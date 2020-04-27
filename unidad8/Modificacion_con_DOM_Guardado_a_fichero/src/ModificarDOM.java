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

public class ModificarDOM {
    private Document docu;

    //Cargo el contenido del XML que se da como ejemplo en la tarea 1 U8 en la estructura DOM
    public ModificarDOM( String fichero_origen ) {
        docu = null;
        fichero_origen = fichero_origen;
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.parse(new File(fichero_origen));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    /*El comentario tiene que ser diferente si no lo cambia de lugar cada vez que lo añado, por eso lo modifico numerandolo.
    También cambio la Ñ por N para evitar posibles errores que me an sucedido algunas veces*/
    public void addComentario( String comen ){
        Node raiz = docu.getDocumentElement();
        for (int i = 0; i < docu.getElementsByTagName("persona").getLength() ; i++) {
            Comment comentario = docu.createComment( comen  + " " + (i + 1));
            raiz.insertBefore(comentario, docu.getElementsByTagName("persona").item(i));
            Element persona = (Element) docu.getElementsByTagName("persona").item(i);
        }
    }

    //Creo un nuevo nodo etiqueta y reemplazar la primera etiqueta hija por ese nodo creado
    public void reemplazarEtiqueta( String nombre, int edad ){
        Element persona = docu.createElement("persona");
        Element nom = docu.createElement("nombre");
        nom.setTextContent(nombre);
        persona.appendChild(nom);
        Element ed = docu.createElement("edad");
        ed.setTextContent("" + edad);
        persona.appendChild(ed);
        Element raiz = docu.getDocumentElement();
        raiz.replaceChild( persona, raiz.getElementsByTagName("persona").item(0) );
    }

    //Añado un nueva etiqueta hija como último hijo
    public void addUltimo( String nombre, int edad ){
        Element persona = docu.createElement("persona");
        Element nom = docu.createElement("nombre");
        nom.setTextContent(nombre);
        persona.appendChild(nom);
        Element ed = docu.createElement("edad");
        ed.setTextContent("" + edad);
        persona.appendChild(ed);
        Element raiz = docu.getDocumentElement();
        raiz.appendChild(persona);
    }

    public void guardarDOM( String fichero_destino ) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer conversor = tf.newTransformer();
            conversor.setOutputProperty( OutputKeys.INDENT, "yes" );
            conversor.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            conversor.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            conversor.setOutputProperty( OutputKeys.METHOD, "xml" );
            conversor.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origen = new DOMSource(docu);
            StreamResult destino = new StreamResult(new File(fichero_destino));
            conversor.transform(origen,destino);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
