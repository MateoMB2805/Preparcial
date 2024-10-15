package Model;

import java.util.ArrayList;
import java.util.List;

public class GestionEventos {
    public List<Atleta> obtenerAtletasNatacionCompeticion(List<Participante> participantes) {
        List<Atleta> atletasNatacion = new ArrayList<>();
        for (Participante participante : participantes) {
            EventoDeportivo evento = participante.getEvento();
            if (evento.getDisciplinaAsociada().equalsIgnoreCase("natación") && evento.getTipoEvento() == TipoEvento.COMPETICION) {
                if (participante.getPersona() instanceof Atleta) {
                    atletasNatacion.add((Atleta) participante.getPersona());
                }
            }
        }
        return atletasNatacion;
    }
}
