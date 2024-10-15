package Model;



public class Participante {
    private Persona persona;
    private EventoDeportivo evento;
    private TipoParticipacion tipoParticipacion;
    private int edad;
    private String paisRepresentacion;

    public Participante(Persona persona, EventoDeportivo evento, TipoParticipacion tipoParticipacion, int edad, String paisRepresentacion) {
        this.persona = persona;
        this.evento = evento;
        this.tipoParticipacion = tipoParticipacion;
        this.edad = edad;
        this.paisRepresentacion = paisRepresentacion;
    }

    public Persona getPersona() { return persona; }
    public TipoParticipacion getTipoParticipacion() { return tipoParticipacion; }
    public EventoDeportivo getEvento() { return evento; }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPaisRepresentacion() {
        return paisRepresentacion;
    }

    public void setPaisRepresentacion(String paisRepresentacion) {
        this.paisRepresentacion = paisRepresentacion;
    }


}
