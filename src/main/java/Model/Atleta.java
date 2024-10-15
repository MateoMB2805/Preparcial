package Model;

import java.time.LocalDate;

public class Atleta extends Persona {
    private int experienciaDeportivaEnAños;
    private int numeroParticipacionesEventos;
    
    //Constructor
    public Atleta(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
            int experienciaDeportivaEnAños, int numeroParticipacionesEventos) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.experienciaDeportivaEnAños = experienciaDeportivaEnAños;
        this.numeroParticipacionesEventos = numeroParticipacionesEventos;
    }

    //Getters y Setters
    public int getExperienciaDeportivaEnAños() {
        return experienciaDeportivaEnAños;
    }

    public void setExperienciaDeportivaEnAños(int experienciaDeportivaEnAños) {
        this.experienciaDeportivaEnAños = experienciaDeportivaEnAños;
    }

    public int getNumeroParticipacionesEventos() {
        return numeroParticipacionesEventos;
    }

    public void setNumeroParticipacionesEventos(int numeroParticipacionesEventos) {
        this.numeroParticipacionesEventos = numeroParticipacionesEventos;
    }

    
}
