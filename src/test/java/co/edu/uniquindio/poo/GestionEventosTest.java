package co.edu.uniquindio.poo;

import Model.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionEventosTest {

    @Test
    public void testObtenerAtletasNatacionCompeticion() {
        // Crear evento de natación de tipo competición
        EventoDeportivo eventoNatacion = new EventoDeportivo("Torneo Natación", TipoEvento.COMPETICION, LocalDate.of(2024, 10, 1), "Colombia", "Bogotá", "natación");

        // Crear atletas y participantes
        Atleta atleta1 = new Atleta("Juan", "Perez", LocalDate.of(1995, 5, 10), "Colombia", 5,4);
        Participante participante1 = new Participante(atleta1, eventoNatacion, TipoParticipacion.ATLETA, 29, "Colombia");

        List<Participante> participantes = new ArrayList<>();
        participantes.add(participante1);

        // Crear instancia de la clase que gestiona los eventos
        GestionEventos gestionEventos = new GestionEventos();

        // Ejecutar el método
        List<Atleta> atletasNatacion = gestionEventos.obtenerAtletasNatacionCompeticion(participantes);

        // Verificar que se obtiene el atleta
        assertEquals(1, atletasNatacion.size());
        assertEquals("Juan", atletasNatacion.get(0).getNombre());
    }
}
