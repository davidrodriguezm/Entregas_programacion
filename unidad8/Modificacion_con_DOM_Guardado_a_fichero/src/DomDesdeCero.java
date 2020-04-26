import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
import java.util.ArrayList;

public class DomDesdeCero {
    ArrayList<Personaje> personajes;
    private Document docu;

    public DomDesdeCero() {
        personajes = new ArrayList();
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void addObjeto( Personaje p ) {
        personajes.add(p);
    }

    public void guardarDOM() {
        cargarInformacion();
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer conversor = tf.newTransformer();
            conversor.setOutputProperty( OutputKeys.INDENT, "yes" );
            conversor.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            conversor.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            conversor.setOutputProperty( OutputKeys.METHOD, "xml" );
            conversor.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
            DOMSource origen = new DOMSource(docu);
            StreamResult destino = new StreamResult(new File("src\\cero.xml"));
            conversor.transform(origen,destino);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }

    private void cargarInformacion() {
        Element raiz = docu.createElement("Personajes");
        for ( Personaje p : personajes ) {
            Element per = docu.createElement("Personaje");
            per.setAttribute("Nivel","" + p.getNivel());
            per.setAttribute("Clase",p.getClase());
            Element nombre = docu.createElement("Nombre");
            nombre.setTextContent(p.getNombre());
            per.appendChild(nombre);
            Element estadisticas = docu.createElement("Estadisticas");
            Element fuerza = docu.createElement("Fuerza");
            fuerza.setTextContent("" + p.getFuerza());
            estadisticas.appendChild(fuerza);
            Element magia = docu.createElement("Magia");
            magia.setTextContent("" + p.getMagia());
            estadisticas.appendChild(magia);
            Element vida = docu.createElement("Vida");
            vida.setTextContent("" + p.getVida());
            estadisticas.appendChild(vida);
            Element defensa = docu.createElement("Defensa");
            defensa.setTextContent("" + p.getDefensa());
            defensa.setAttribute("Resistencia",p.getResistencia());
            defensa.setAttribute("Devilidad",p.getDevilidad());
            estadisticas.appendChild(defensa);
            per.appendChild(estadisticas);
            raiz.appendChild(per);
        }
        docu.appendChild(raiz);
    }
}
