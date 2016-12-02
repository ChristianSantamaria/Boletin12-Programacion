package boletin12_1;

import java.time.Duration;
import java.time.Instant;
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
            JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES");

            Instant TiempoInicio = Instant.now();
            c.setHoraEntrada(TiempoInicio);
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

    public void Facturar(String matricula) {
        for (int i = 0; i < 4; i++) {
            if (this.matricula[i].getMatricula().equals(matricula)) {

                long TiempoTotal = Duration.between(this.matricula[i].getHoraEntrada(), Instant.now()).toNanos();
                JOptionPane.showInputDialog("Ha estado " + TiempoTotal);
                float factura = 0;
                if (TiempoTotal >= 3) {
                    factura = (float) 1.5;
                    if (TiempoTotal > 3) {
                        for (int j = 0; j < TiempoTotal - 3; j++) {
                            factura += 0.20;
                        }
                    }
                }

                System.out.println("Factura:");
                System.out.println("Matricula coche: " + matricula);
                System.out.println("Tempo: " + TiempoTotal);
                System.out.println("Precio: " + factura);
                break;
            }
        }
        JOptionPane.showInputDialog("Coche no encontrado");

    }

}
