package boletin12_1;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Garaxe {

    private int numeroCoches;
    private Coche[] matricula = new Coche[4];

    public Garaxe() {
        this.numeroCoches = 0;
    }

    public Garaxe(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public void Aparcar(Coche c) {
        if (numeroCoches < 5) {
            Date horahoy = new Date();
            c.setHoraEntrada(horahoy);
            
            JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES");
            numeroCoches += 1;
            for (int i = 0; i < 4; i++) {
                if (this.matricula[i] == null) {
                    this.matricula[i] = c;
                    break;
                }
            }
        } else {
            JOptionPane.showInputDialog("COMPLETO");
        }

    }
    
    public void Facturar(Coche c){
        
        
        
        
    }

}
