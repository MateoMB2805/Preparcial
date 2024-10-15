package Model;

import java.util.ArrayList;

import java.util.List;

public class Equipo {

    private String nombre;
    private String paisDeOrigen;
    private List<Atleta> atletas;

    public Equipo (String nombre, String paisDeOrigen){
        this.nombre=nombre;
        this.paisDeOrigen= paisDeOrigen;
        this.atletas = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen){
        this.paisDeOrigen= paisDeOrigen;
    }

    public void agregarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

}
