public class principal {
    public static void main(String[] args) {
        Medico medi_1 = new Medico("Ambrosio", "Valverde", "Mairena",1);
        Medico medi_2 = new Medico("Oristila", "Anacleto", "Mairena",2);
        Medico medi_3 = new Medico("Eufrasio", "Marrajo", "San Juan",3);
        Pacientes paci_1 = new Pacientes("luis",23,90,true,medi_1,'A');
        Pacientes paci_2 = new Pacientes("Pepe",27,80,false,medi_2,'B');
        Pacientes paci_3 = new Pacientes("Jorke",23,91,true,medi_1,'A');
        Pacientes paci_4 = new Pacientes("Alicia",57,50,false,medi_3,'C');
        Pacientes paci_5 = new Pacientes("Felipe",23,68,true,medi_1,'H');
        Pacientes paci_6 = new Pacientes("Miguel",27,86,false,medi_2,'B');
        Pacientes paci_7 = new Pacientes("Eleuterio",23,70,true,medi_2,'T');
        Pacientes paci_8 = new Pacientes("Cheng",57,40,false,medi_3,'D');
        Pacientes paci_9 = new Pacientes("Luigi",23,89,true,medi_1,'T');
        Pacientes paci_10 = new Pacientes("Mario",57,57,false,medi_3,'D');
        Coronavirus corona_1 = new Coronavirus("COVID-19","Wuhan");
        corona_1.addPaciente('T',paci_1);
        corona_1.addPaciente('A',paci_1);
        corona_1.addPaciente('B',paci_2);
        corona_1.addPaciente('A',paci_3);
        corona_1.addPaciente('C',paci_4);
        corona_1.addPaciente('H',paci_5);
        corona_1.addPaciente('B',paci_6);
        corona_1.addPaciente('T',paci_7);
        corona_1.addPaciente('D',paci_8);
        corona_1.addPaciente('T',paci_9);
        corona_1.addPaciente('D',paci_10);
        System.out.println(corona_1);
        corona_1.guardarPacientes();
        corona_1.darDeAltaPaciente(paci_10);
        corona_1.darDeAltaPaciente(paci_7);
        corona_1.darDeAltaPaciente(paci_10);
        System.out.println(corona_1);
        corona_1.cargarPacientes();
        System.out.println(corona_1);
        corona_1.pacientesporPeso('D');
    }
}
