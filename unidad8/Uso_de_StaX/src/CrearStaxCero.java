import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class CrearStaxCero {
    ArrayList<Personaje> personajes;

    public CrearStaxCero() {
        personajes = new ArrayList<>();
    }

    public void addObjeto( Personaje p ) {
        personajes.add(p);
    }

    public void guardarStax() {
        try {
            XMLOutputFactory factoria = XMLOutputFactory.newInstance();
            XMLEventWriter escribe = factoria.createXMLEventWriter(new FileOutputStream("src\\stax.xml"));
            XMLEventFactory Factoria_eventos = XMLEventFactory.newInstance();
            StartDocument inicio_docu = Factoria_eventos.createStartDocument();
            escribe.add(inicio_docu);
            Characters salto_linea = Factoria_eventos.createCharacters("\n");
            escribe.add(salto_linea);
            Characters tabulador = Factoria_eventos.createCharacters("\t");
            Characters salto_linea_tabulador = Factoria_eventos.createCharacters("\n\t");
            StartElement inicio_personajes = Factoria_eventos.createStartElement("","","Personajes");
            escribe.add(inicio_personajes);
            escribe.add(salto_linea_tabulador);
            int cont = 0;
            for ( Personaje p : personajes ) {
                //Etiquetas
                StartElement inicio_perso = Factoria_eventos.createStartElement("","","Personaje");
                EndElement final_perso = Factoria_eventos.createEndElement("","","Personaje");
                StartElement inicio_fuerza = Factoria_eventos.createStartElement("","","Fuerza");
                EndElement final_fuerza = Factoria_eventos.createEndElement("","","Fuerza");
                StartElement inicio_magia = Factoria_eventos.createStartElement("","","Magia");
                EndElement final_magia = Factoria_eventos.createEndElement("","","Magia");
                StartElement inicio_defensa = Factoria_eventos.createStartElement("","","Defensa");
                EndElement final_defensa = Factoria_eventos.createEndElement("","","Defensa");
                StartElement inicio_vida = Factoria_eventos.createStartElement("","","Vida");
                EndElement final_vida = Factoria_eventos.createEndElement("","","Vida");
                //Atributos
                Attribute nivel = Factoria_eventos.createAttribute("Nivel",Integer.toString( p.getNivel() ) );
                Attribute clase = Factoria_eventos.createAttribute("Clase", p.getClase() );
                Attribute resistencia = Factoria_eventos.createAttribute("Resistencia", p.getResistencia() );
                Attribute devilidad = Factoria_eventos.createAttribute("Devilidad", p.getDevilidad() );
                //Contenido
                Characters contenido_fuerza = Factoria_eventos.createCharacters( Integer.toString( p.getFuerza() ) );
                Characters contenido_magia = Factoria_eventos.createCharacters( Integer.toString( p.getMagia() ) );
                Characters contenido_defensa = Factoria_eventos.createCharacters( Integer.toString( p.getDefensa() ) );
                Characters contenido_vida = Factoria_eventos.createCharacters( Integer.toString( p.getVida() ) );
                //Escribe el un objeto
                //Inicio etiqueta Personaje y atributos
                escribe.add(inicio_perso);
                escribe.add(nivel);
                escribe.add(clase);
                escribe.add(salto_linea_tabulador);
                escribe.add(tabulador);
                //Etiqueta Fuerza
                escribe.add(inicio_fuerza);
                escribe.add(contenido_fuerza);
                escribe.add(final_fuerza);
                escribe.add(salto_linea_tabulador);
                escribe.add(tabulador);
                //Etiqueta Magia
                escribe.add(inicio_magia);
                escribe.add(contenido_magia);
                escribe.add(final_magia);
                escribe.add(salto_linea_tabulador);
                escribe.add(tabulador);
                //Etiqueta Defensa y atributos
                escribe.add(inicio_defensa);
                escribe.add(resistencia);
                escribe.add(devilidad);
                escribe.add(contenido_magia);
                escribe.add(final_magia);
                escribe.add(salto_linea_tabulador);
                escribe.add(tabulador);
                //Etiqueta Vida
                escribe.add(inicio_vida);
                escribe.add(contenido_vida);
                escribe.add(final_vida);
                escribe.add(salto_linea_tabulador);
                //Final etiqueta Personaje
                escribe.add(final_perso);
                if ( cont == personajes.size() - 1) {
                    escribe.add(salto_linea);
                } else {
                    escribe.add(salto_linea_tabulador);
                }
                cont++;
            }
            EndElement final_personajes = Factoria_eventos.createEndElement("","","Personajes");
            escribe.add(final_personajes);
            escribe.add(salto_linea);
            EndDocument final_docu = Factoria_eventos.createEndDocument();
            escribe.add(final_docu);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

}
