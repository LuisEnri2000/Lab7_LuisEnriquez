
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




class adminBarra extends Thread {
    
    private JProgressBar barra;
    private boolean listaCapaz;
    private boolean vive;
    ArrayList<Platillos> lista = new ArrayList(); 
    JTable tabla;
    DefaultTableModel modelo;
    

    public adminBarra(JProgressBar barra, JTable tabla) {
        this.barra = barra;
        vive = true;
        listaCapaz = false;
        this.tabla = tabla;
        barra.setValue(0);
        modelo = (DefaultTableModel) tabla.getModel();
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public ArrayList<Platillos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Platillos> lista) {
        this.lista = lista;
    }
    
    public void setCapaz (boolean x) {
        listaCapaz = x;
    }

    public void run() {
        int t = 100;
        while (vive) {   
            if(listaCapaz) {
                if (lista.size() > 0) { 
                    t = lista.get(0).getTiempo() * 10;
                    barra.setMaximum(lista.get(0).getTiempo());
                    barra.setValue(barra.getValue() + 1);
                    if (barra.getValue() == barra.getMaximum()) {
                        modelo.addRow(new Object[]{lista.get(0).getNombre(),lista.get(0).getTiempo()});
                        if (lista.size() == 1) {
                            listaCapaz = false;
                        }
                        lista.remove(0);
                        
                        barra.setValue(0);
                    }
                }
                try {
                    Thread.sleep(t);
                } 
                catch (InterruptedException e) {
                    System.out.println("Interrumpido!");
                }
            }
        }
        
    }
    
    
}
