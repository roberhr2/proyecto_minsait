import main.java.Ubicacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package test.java;


class UbicacionTest {

    @Test
    void testConstructorYGetters() {
        Ubicacion ubicacion = new Ubicacion(1, true, "Calle Falsa 123");
        assertEquals(1, ubicacion.getId());
        assertTrue(ubicacion.isOnline());
        assertEquals("Calle Falsa 123", ubicacion.getDireccion());
    }

    @Test
    void testSetters() {
        Ubicacion ubicacion = new Ubicacion();
        ubicacion.setId(2);
        ubicacion.setOnline(false);
        ubicacion.setDireccion("Av. Siempre Viva 742");

        assertEquals(2, ubicacion.getId());
        assertFalse(ubicacion.isOnline());
        assertEquals("Av. Siempre Viva 742", ubicacion.getDireccion());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            new Ubicacion(2, false, "Presencial"),
            null
        };
        Ubicacion encontrada = Ubicacion.buscarPorId(ubicaciones, 2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getId());
        assertFalse(encontrada.isOnline());
        assertEquals("Presencial", encontrada.getDireccion());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            null
        };
        Ubicacion encontrada = Ubicacion.buscarPorId(ubicaciones, 3);
        assertNull(encontrada);
    }

    @Test
    void testAgregarUbicacionExitoso() {
        Ubicacion[] ubicaciones = new Ubicacion[2];
        Ubicacion nueva = new Ubicacion(3, false, "Nueva Direccion");
        boolean agregado = Ubicacion.agregarUbicacion(ubicaciones, nueva);
        assertTrue(agregado);
        assertEquals(nueva, ubicaciones[0]);
    }

    @Test
    void testAgregarUbicacionSinEspacio() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            new Ubicacion(2, false, "Presencial")
        };
        Ubicacion nueva = new Ubicacion(3, false, "Otra Direccion");
        boolean agregado = Ubicacion.agregarUbicacion(ubicaciones, nueva);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            new Ubicacion(2, false, "Presencial")
        };
        boolean eliminado = Ubicacion.eliminarPorId(ubicaciones, 2);
        assertTrue(eliminado);
        assertNull(ubicaciones[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            null
        };
        boolean eliminado = Ubicacion.eliminarPorId(ubicaciones, 3);
        assertFalse(eliminado);
    }

    @Test
    void testToString() {
        Ubicacion ubicacion = new Ubicacion(5, true, "Remoto");
        String esperado = "Ubicacion{id=5, online=true, direccion='Remoto'}";
        assertEquals(esperado, ubicacion.toString());
    }
}