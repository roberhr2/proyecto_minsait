package test.java;

import main.java.Evento;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

package test.java;




class EventoTest {

    @Test
    void testConstructorYGetters() {
        Date fecha = new Date();
        Evento evento = new Evento(1, "Concierto", fecha, 120, 10, 20, 30);
        assertEquals(1, evento.getId());
        assertEquals("Concierto", evento.getNombre());
        assertEquals(fecha, evento.getFecha());
        assertEquals(120, evento.getDuracion());
        assertEquals(10, evento.getIdUbicacion());
        assertEquals(20, evento.getIdOrganizador());
        assertEquals(30, evento.getIdCategoria());
    }

    @Test
    void testSetters() {
        Evento evento = new Evento(0, null, null, 0, 0, 0, 0);
        Date fecha = new Date();
        evento.setId(2);
        evento.setNombre("Seminario");
        evento.setFecha(fecha);
        evento.setDuracion(90);
        evento.setIdUbicacion(11);
        evento.setIdOrganizador(21);
        evento.setIdCategoria(31);

        assertEquals(2, evento.getId());
        assertEquals("Seminario", evento.getNombre());
        assertEquals(fecha, evento.getFecha());
        assertEquals(90, evento.getDuracion());
        assertEquals(11, evento.getIdUbicacion());
        assertEquals(21, evento.getIdOrganizador());
        assertEquals(31, evento.getIdCategoria());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Evento[] eventos = {
            new Evento(1, "A", new Date(), 60, 1, 1, 1),
            new Evento(2, "B", new Date(), 90, 2, 2, 2),
            null
        };
        Evento encontrado = Evento.buscarPorId(eventos, 2);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getId());
        assertEquals("B", encontrado.getNombre());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Evento[] eventos = {
            new Evento(1, "A", new Date(), 60, 1, 1, 1),
            null
        };
        Evento encontrado = Evento.buscarPorId(eventos, 3);
        assertNull(encontrado);
    }

    @Test
    void testAgregarEventoExitoso() {
        Evento[] eventos = new Evento[2];
        Evento nuevo = new Evento(3, "C", new Date(), 120, 3, 3, 3);
        boolean agregado = Evento.agregarEvento(eventos, nuevo);
        assertTrue(agregado);
        assertEquals(nuevo, eventos[0]);
    }

    @Test
    void testAgregarEventoSinEspacio() {
        Evento[] eventos = {
            new Evento(1, "A", new Date(), 60, 1, 1, 1),
            new Evento(2, "B", new Date(), 90, 2, 2, 2)
        };
        Evento nuevo = new Evento(3, "C", new Date(), 120, 3, 3, 3);
        boolean agregado = Evento.agregarEvento(eventos, nuevo);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Evento[] eventos = {
            new Evento(1, "A", new Date(), 60, 1, 1, 1),
            new Evento(2, "B", new Date(), 90, 2, 2, 2)
        };
        boolean eliminado = Evento.eliminarPorId(eventos, 2);
        assertTrue(eliminado);
        assertNull(eventos[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Evento[] eventos = {
            new Evento(1, "A", new Date(), 60, 1, 1, 1),
            null
        };
        boolean eliminado = Evento.eliminarPorId(eventos, 3);
        assertFalse(eliminado);
    }
}