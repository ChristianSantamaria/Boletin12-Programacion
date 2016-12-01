package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin12_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Garaxe g1 = new Garaxe();
        for (int i = 0; i < 4; i++) {
            String matricula = (JOptionPane.showInputDialog("Escriba la matricula del coche:"));
            Coche caux = new Coche(matricula);
            g1.Aparcar(caux);
            
        }
        
        
    }
    
}
