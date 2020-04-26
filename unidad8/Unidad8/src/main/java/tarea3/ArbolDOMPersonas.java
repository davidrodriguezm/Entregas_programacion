package tarea3;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ArbolDOMPersonas {
    private Document documento;
    private Map<String,Persona3> personas;
/* He decidido tener un atributo mapa con objetos persona. En el que uso como clave el atributo nombre de Persona,
para garantizar que cada persona tenga un nombre único como dice el enunciado. También para facilitar los cambios en
el documento con la inserción de cada Persona y mantener un mayor control sobre ellos */

    public ArbolDOMPersonas(String fichero) {
        Document docu = null;
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.parse(new File(fichero));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        if ( docu != null) {
            documento = docu;
            cargarMapa();
        } else {
            System.out.println("El documento no se ha leido correctamente");
        }
    }

// Leo las etiquetas persona y con su información creo objetos Persona de que guardo en el mapa.
    private void cargarMapa() {
        personas = new HashMap<>();
        NodeList lista_nodos = documento.getElementsByTagName("persona");
        for (int i = 0; i < lista_nodos.getLength() ; i++) {
            Element persona = (Element) lista_nodos.item(i);
            Element nombre = (Element) persona.getElementsByTagName("nombre").item(0);
            String nom = nombre.getTextContent();
            Element edad = (Element) persona.getElementsByTagName("edad").item(0);
            int ed = Integer.parseInt(edad.getTextContent());
            Persona3 p = new Persona3(nom,ed);
            personas.put(p.getNombre(),p);
        }
    }

/* Inserto las personas en el mapa y cambio el documento para que se ajuste a los valores actuales
de las personas almacenadas en el mapa. Luego guardo los cambios en el fichero origen */
    public void addPersona( Persona3 p ) {
        personas.put(p.getNombre(),p);
        Element raiz = documento.createElement("personas");
        for ( Persona3 valor : personas.values() ) {
            Element per = documento.createElement("persona");
            Element nom = documento.createElement("nombre");
            Element edad = documento.createElement("edad");
            nom.setTextContent(valor.getNombre());
            edad.setTextContent("" + valor.getEdad());
            per.appendChild(nom);
            per.appendChild(edad);
            raiz.appendChild(per);
        }
        documento.removeChild(documento.getDocumentElement());
        documento.appendChild(raiz);
        guardarDOM();
    }

    private void guardarDOM() {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer conversor = tf.newTransformer();
            conversor.setOutputProperty( OutputKeys.INDENT, "yes" );
            conversor.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            conversor.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            conversor.setOutputProperty( OutputKeys.METHOD, "xml" );
            conversor.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origen = new DOMSource(documento);
            StreamResult destino = new StreamResult(new File("src\\main\\java\\tarea3\\PersonasTarea3.xml"));
            conversor.transform(origen,destino);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leeDOM( ) {
        leeRecursivo( documento );
    }

    private void leeRecursivo( Node nodo ) {
        if ( nodo != null ) {
            NodeList hijos = nodo.getChildNodes();
            if ( nodo.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("---------------------------------------");
                Element elemento = (Element) nodo;
                System.out.println("Etiqueta " + elemento.getTagName() + ":");
                if ( elemento.hasAttributes() ) {
                    NamedNodeMap atributos = elemento.getAttributes();
                    System.out.print("Atributos:");
                    for (int i = 0; i < atributos.getLength() ; i++) {
                        System.out.print(" " + atributos.item(i).getNodeName() + "=" + atributos.item(i).getNodeValue());
                    }
                    System.out.println();
                }
            } else if ( nodo.getNodeType() == Node.TEXT_NODE ) {
                Text texto = (Text) nodo;
                System.out.println( "Texto: " + texto.getWholeText() );
            } else if ( nodo.getNodeType() == Node.COMMENT_NODE ) {
                Comment comentario = (Comment) nodo;
                System.out.println( "Comentario: " + comentario.getTextContent() );
            }
            for (int i = 0; i < hijos.getLength() ; i++) {
                Node nieto = hijos.item(i);
                leeRecursivo(nieto);
            }
        }
    }

}
