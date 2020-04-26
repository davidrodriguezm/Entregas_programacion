package tarea2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;

public class principal_2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ambrosio",72);
        Persona p2 = new Persona("Ortensia",46);
        Persona p3 = new Persona("Fliorerino",23);
        Persona p4 = new Persona("Petronila",63);
        ArrayList<Persona> lista_personas = new ArrayList<>();
        lista_personas.add(p1);
        lista_personas.add(p2);
        lista_personas.add(p3);
        lista_personas.add(p4);
        //Guardo objetos Persona en un fichero.
        try (ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("src\\main\\java\\tarea2\\FichPersona.dat"))){
            salida.writeObject(lista_personas);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Persona> lista = null;
        Document docu = null;
        Transformer conversor = null;
        //Leo los objetos Persona en el fichero.
        try (ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("src\\main\\java\\tarea2\\FichPersona.dat"))){
            lista= (ArrayList<Persona>) entrada.readObject();
            DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factoria.newDocumentBuilder();
            docu = builder.newDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            conversor = tf.newTransformer();
            conversor.setOutputProperty( OutputKeys.INDENT, "yes" );
            conversor.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            conversor.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            conversor.setOutputProperty( OutputKeys.METHOD, "xml" );
            conversor.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }
        //Creo un documento con los datos de los objetos Persona.
        Element raiz = docu.createElement("personas");
        for ( Persona p : lista) {
            Element per = docu.createElement("persona");
            Element nom = docu.createElement("nombre");
            Element edad = docu.createElement("edad");
            nom.setTextContent(p.getNombre());
            edad.setTextContent("" + p.getEdad());
            per.appendChild(nom);
            per.appendChild(edad);
            raiz.appendChild(per);
        }
        DOMSource origen = new DOMSource(raiz);
        StreamResult destino = new StreamResult(new File("src\\main\\java\\tarea2\\PersonasTarea2.xml"));
        //Creo el documento XML.
        try {
            conversor.transform(origen,destino);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
        //Leo el documento XML con una copia de mi parser usado en la tarea 1.
        ParseadorDOMPersonas2.parse("src\\main\\java\\tarea2\\PersonasTarea2.xml");
    }
}
