import java.io.Serializable;

class Personaje implements Serializable {
    private String nombre;
    private String clase;
    private Integer fuerza;
    private Integer defensa;
    private Integer magia;
    private Integer vida;
    private Integer nivel;
    private String resistencia;
    private String devilidad;

    public Personaje(String nombre, String clase, Integer fuerza, Integer defensa, Integer magia, Integer vida,
                      Integer nivel, String resistencia, String devilidad) {
        this.nombre = nombre;
        this.clase = clase;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.magia = magia;
        this.vida = vida;
        this.nivel = nivel;
        this.resistencia = resistencia;
        this.devilidad = devilidad;
    }

    public Personaje(String nombre, String clase, Integer fuerza, Integer defensa, Integer magia, Integer vida,
                     Integer nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.magia = magia;
        this.vida = vida;
        this.nivel = nivel;
        this.resistencia = "Ninguna";
        this.devilidad = "Ninguna";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getMagia() {
        return magia;
    }

    public void setMagia(Integer magia) {
        this.magia = magia;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getDevilidad() {
        return devilidad;
    }

    public void setDevilidad(String devilidad) {
        this.devilidad = devilidad;
    }
}
