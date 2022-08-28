package map;

public class Lenguaje {
    private String nombre;
    private String creador;
    private int version;
    public Lenguaje(String nombre, String creador, int version) {
        this.nombre = nombre;
        this.creador = creador;
        this.version = version;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}


