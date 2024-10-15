package Model;

import java.time.LocalDate;

public class Entrenador extends Persona {
    private String especializacion;

    //Constructor
    public Entrenador(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
            String especializacion) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.especializacion = especializacion;
    }
    //GETTER Y SETTERS
    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    

}
