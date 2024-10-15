package Model;

import java.time.LocalDate;

public class PersonalDelApoyo extends Persona{
    private int añosExperienciaLaboral;

    //Constructor
    public PersonalDelApoyo(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
            int añosExperienciaLaboral) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.añosExperienciaLaboral = añosExperienciaLaboral;
    }

    //Getters y Setters
    public int getAñosExperienciaLaboral() {
        return añosExperienciaLaboral;
    }

    public void setAñosExperienciaLaboral(int añosExperienciaLaboral) {
        this.añosExperienciaLaboral = añosExperienciaLaboral;
    }

    

}
