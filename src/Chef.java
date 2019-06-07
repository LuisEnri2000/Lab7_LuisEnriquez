
import java.io.Serializable;
import java.util.ArrayList;




class Chef implements Serializable{
    
    String nombre;
    int edad;
    String genero;
    ArrayList<Platillos> lista = new ArrayList();

    public Chef(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Platillos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Platillos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Chef " + nombre + ", Platillos: " + lista ;
    }

    
    
}


