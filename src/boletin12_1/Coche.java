package boletin12_1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author csantamariacameselle
 */
public class Coche {
    private String matricula;
    private Instant horaEntrada;

    public Coche(){
        
    }   
    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Instant getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(Instant horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    
}
