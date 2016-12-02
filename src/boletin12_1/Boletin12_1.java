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
        Coche caux = new Coche(JOptionPane.showInputDialog("Escriba la matricula del coche:"));
        g1.Aparcar(caux);
        g1.Facturar(JOptionPane.showInputDialog("Escriba la matricula del coche:"));

    }

}
