package Model;

import java.time.LocalDate;

public class Arbitro extends Persona {
    private String categoria;

    // Constructor
    public Arbitro(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad, String categoria) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.categoria = categoria;
    }

    //Getters y setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
}
