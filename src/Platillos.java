
import java.awt.Color;
import java.util.Date;


class Platillos {
    
    String nombre;
    int tiempo;
    String id;
    Date fecha;
    Color color;

    public Platillos(String nombre, int tiempo, String id, Date fecha, Color color) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.id = id;
        this.fecha = fecha;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
