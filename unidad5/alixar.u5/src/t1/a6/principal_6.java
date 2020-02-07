package t1.a6;

import t1.a5.Instrumento;

public class principal_6 {
    public static void main(String[] args) {
        Piano p = new Piano();
        Campana c = new Campana();
        p.Add( Instrumento.Nota.DO);
        p.Add( Instrumento.Nota.MI);
        p.Add( Instrumento.Nota.RE);
        p.Add( Instrumento.Nota.FA);
        p.Interpretar();
        c.Add( Instrumento.Nota.LA);
        c.Add( Instrumento.Nota.SOL);
        c.Add( Instrumento.Nota.RE);
        c.Add( Instrumento.Nota.SI);
        c.Interpretar();


    }
}
