
import java.io.Serializable;
import java.util.ArrayList;

class Cliente implements Serializable{
    
    String nombre;
    int edad;
    String genero;
    ArrayList<Platillos> lista;

    public Cliente(String nombre, int edad, String genero, ArrayList<Platillos> lista) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;  
        this.lista = lista;
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
        return nombre + ", Edad:" + edad + ", Genero: " + genero + ", lista=" + lista + '}';
    }
    
    
    
}
