import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
    private String fichero_origen = "src\\Personas.xml";
    private String fichero_destino = "src\\dom_modificado.xml";
    private String comentario = "<!-- COMENTARIO ANADIDO DESDE DOM -->";

    public ModificarDOM() {
        docu = null;
        cargarDOM();
    }
    //Cargo el contenido del XML que se da como ejemplo en la tarea 1 U8 en la estructura DOM
    public void cargarDOM() {
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.parse(new File(fichero_origen));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    //Añado un nueva etiqueta hija como último hijo
    public void add_ultimo( String nombre, String edad ){
        Element persona = docu.createElement("persona");
        Element nom = docu.createElement("nombre");
        nom.setTextContent(nombre);
        persona.appendChild(nom);
        Element ed = docu.createElement("edad");
        ed.setTextContent(edad);
        persona.appendChild(ed);
    }

    //Guardo el contenido en el fichero dom_modificado.xml
    public void guardarDOM() {
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
