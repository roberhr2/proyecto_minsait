import main.java.Inscripcion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package test.java;


class InscripcionTest {

    @Test
    void testConstructorYGetters() {
        Inscripcion inscripcion = new Inscripcion(1, 100, 200, false);
        assertEquals(1, inscripcion.getId());
        assertEquals(100, inscripcion.getIdUsuario());
        assertEquals(200, inscripcion.getIdEvento());
        assertFalse(inscripcion.isCancelado());
    }

    @Test
    void testSetters() {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setId(2);
        inscripcion.setIdUsuario(101);
        inscripcion.setIdEvento(201);
        inscripcion.setCancelado(true);

        assertEquals(2, inscripcion.getId());
        assertEquals(101, inscripcion.getIdUsuario());
        assertEquals(201, inscripcion.getIdEvento());
        assertTrue(inscripcion.isCancelado());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            new Inscripcion(2, 101, 201, true),
            null
        };
        Inscripcion encontrada = Inscripcion.buscarPorId(inscripciones, 2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getId());
        assertEquals(101, encontrada.getIdUsuario());
        assertTrue(encontrada.isCancelado());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            null
        };
        Inscripcion encontrada = Inscripcion.buscarPorId(inscripciones, 3);
        assertNull(encontrada);
    }

    @Test
    void testAgregarInscripcionExitoso() {
        Inscripcion[] inscripciones = new Inscripcion[2];
        Inscripcion nueva = new Inscripcion(3, 102, 202, false);
        boolean agregado = Inscripcion.agregarInscripcion(inscripciones, nueva);
        assertTrue(agregado);
        assertEquals(nueva, inscripciones[0]);
    }

    @Test
    void testAgregarInscripcionSinEspacio() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            new Inscripcion(2, 101, 201, true)
        };
        Inscripcion nueva = new Inscripcion(3, 102, 202, false);
        boolean agregado = Inscripcion.agregarInscripcion(inscripciones, nueva);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            new Inscripcion(2, 101, 201, true)
        };
        boolean eliminado = Inscripcion.eliminarPorId(inscripciones, 2);
        assertTrue(eliminado);
        assertNull(inscripciones[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            null
        };
        boolean eliminado = Inscripcion.eliminarPorId(inscripciones, 3);
        assertFalse(eliminado);
    }

    @Test
    void testToString() {
        Inscripcion inscripcion = new Inscripcion(5, 150, 250, true);
        String esperado = "Inscripcion{id=5, idUsuario=150, idEvento=250, cancelado=true}";
        assertEquals(esperado, inscripcion.toString());
    }
}