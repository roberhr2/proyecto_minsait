import main.java.Organizador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package test.java;


class OrganizadorTest {

    @Test
    void testConstructorYGetters() {
        Organizador organizador = new Organizador(1, "Juan", "juan@email.com", "pass123");
        assertEquals(1, organizador.getId());
        assertEquals("Juan", organizador.getNombre());
        assertEquals("juan@email.com", organizador.getEmail());
        assertEquals("pass123", organizador.getPassword());
    }

    @Test
    void testSetters() {
        Organizador organizador = new Organizador();
        organizador.setId(2);
        organizador.setNombre("Ana");
        organizador.setEmail("ana@email.com");
        organizador.setPassword("secret");

        assertEquals(2, organizador.getId());
        assertEquals("Ana", organizador.getNombre());
        assertEquals("ana@email.com", organizador.getEmail());
        assertEquals("secret", organizador.getPassword());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            new Organizador(2, "Ana", "ana@email.com", "secret"),
            null
        };
        Organizador encontrado = Organizador.buscarPorId(organizadores, 2);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getId());
        assertEquals("Ana", encontrado.getNombre());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            null
        };
        Organizador encontrado = Organizador.buscarPorId(organizadores, 3);
        assertNull(encontrado);
    }

    @Test
    void testAgregarOrganizadorExitoso() {
        Organizador[] organizadores = new Organizador[2];
        Organizador nuevo = new Organizador(3, "Luis", "luis@email.com", "clave");
        boolean agregado = Organizador.agregarOrganizador(organizadores, nuevo);
        assertTrue(agregado);
        assertEquals(nuevo, organizadores[0]);
    }

    @Test
    void testAgregarOrganizadorSinEspacio() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            new Organizador(2, "Ana", "ana@email.com", "secret")
        };
        Organizador nuevo = new Organizador(3, "Luis", "luis@email.com", "clave");
        boolean agregado = Organizador.agregarOrganizador(organizadores, nuevo);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            new Organizador(2, "Ana", "ana@email.com", "secret")
        };
        boolean eliminado = Organizador.eliminarPorId(organizadores, 2);
        assertTrue(eliminado);
        assertNull(organizadores[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            null
        };
        boolean eliminado = Organizador.eliminarPorId(organizadores, 3);
        assertFalse(eliminado);
    }

    @Test
    void testToString() {
        Organizador organizador = new Organizador(5, "Mario", "mario@email.com", "mypass");
        String esperado = "Organizador{id=5, nombre='Mario', email='mario@email.com', password='mypass'}";
        assertEquals(esperado, organizador.toString());
    }
}