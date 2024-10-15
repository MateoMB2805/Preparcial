package Model;

import java.time.LocalDate;


public class EventoDeportivo {

    private String nombre;
    private TipoEvento tipoEvento;
    private LocalDate fechaInicio;
    private String ubicacionPais;
    private String ubicacionCiudad;
    private String disciplinaAsociada;
    
  
    
    
    //Constructor
    public EventoDeportivo(String nombre, TipoEvento tipoEvento, LocalDate fechaInicio, String ubicacionPais, String ubicacionCiudad,
            String disciplinaAsociada ) {
        this.nombre = nombre;
         this.tipoEvento = tipoEvento;
        this.fechaInicio = fechaInicio;
        this.ubicacionPais = ubicacionPais;
        this.ubicacionCiudad = ubicacionCiudad;
        this.disciplinaAsociada = disciplinaAsociada;
       
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

      public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getUbicacionPais() {
        return ubicacionPais;
    }
    public void setUbicacionPais(String ubicacionPais) {
        this.ubicacionPais = ubicacionPais;
    }
    public String getUbicacionCiudad() {
        return ubicacionCiudad;
    }
    public void setUbicacionCiudad(String ubicacionCiudad) {
        this.ubicacionCiudad = ubicacionCiudad;
    }
    public String getDisciplinaAsociada() {
        return disciplinaAsociada;
    }
    public void setDisciplinaAsociada(String disciplinaAsociada) {
        this.disciplinaAsociada = disciplinaAsociada;
    }

  

    
}
