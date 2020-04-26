import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MostrarStax {
    private XMLEventReader leer;

    public MostrarStax( String fichero ) {
        leer = null;
        try {
            XMLInputFactory factoria = XMLInputFactory.newInstance();
            leer = factoria.createXMLEventReader(new FileInputStream(fichero));
        } catch ( FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarContenido()  {
        try {
            while ( leer.hasNext() ) {
                XMLEvent evento = leer.nextEvent();
                if ( evento.isStartElement() ) {
                    StartElement inicio_etiqueta = evento.asStartElement();
                    if ( inicio_etiqueta.getName().getLocalPart().equals("persona") ) {
                        System.out.print("\t");
                    } else if ( inicio_etiqueta.getName().getLocalPart().equals("nombre") ||
                                inicio_etiqueta.getName().getLocalPart().equals("edad")) {
                        System.out.print("\t\t");
                    }
                    System.out.print( "<"+ inicio_etiqueta.getName().getLocalPart() );
                    System.out.print(">");
                    if ( inicio_etiqueta.getName().getLocalPart().equals("personas") ) {
                        System.out.print("\n");
                    } else if ( inicio_etiqueta.getName().getLocalPart().equals("persona") ) {
                        System.out.print("\n");
                    }
                } else if ( evento.isEndElement( ) ) {
                    EndElement final_etiqueta = evento.asEndElement();
                    if ( final_etiqueta.getName().getLocalPart().equals("persona") ) {
                        System.out.print("\t");
                    }
                    System.out.println("</" + final_etiqueta.getName().getLocalPart()+">");
                } else if ( evento.isStartDocument() ) {
                    System.out.println("Fichero XML:");

                } else if ( evento.isCharacters()) {
                    Characters texto = evento.asCharacters();
                    if ( !texto.getData().contains("\n") ) {
                        System.out.print( texto.getData() );
                    }
                }
            }
        } catch ( XMLStreamException e ) {
            System.out.println(e.getMessage());
        }
    }

}
