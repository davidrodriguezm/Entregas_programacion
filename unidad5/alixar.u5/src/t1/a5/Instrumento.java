package t1.a5;

public abstract class  Instrumento {
    public enum Nota {DO,RE,MI,FA,SOL,LA,SI}
    final protected int tama_max = 100;
    protected Nota notas[] = new Nota[tama_max];
    protected int cont_tama = 0;

    public void Add( Nota nueva) {
        if ( cont_tama < tama_max) {
            notas[cont_tama] = nueva;
            cont_tama++;
        }
    }
    public abstract void Interpretar();
}
