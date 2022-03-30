package mx.uv.t4is.Saludos;

public class Saludo {
    private int id;
    private String nombre;


    public Saludo() {
    }
    

    public Saludo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    
}
