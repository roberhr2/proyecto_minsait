import main.java.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package test.java;


class UsuarioTest {

    @Test
    void testConstructorYGetters() {
        Usuario usuario = new Usuario(1, "Juan", "juan@mail.com", "pass123");
        assertEquals(1, usuario.getId());
        assertEquals("Juan", usuario.getNombre());
        assertEquals("juan@mail.com", usuario.getEmail());
        assertEquals("pass123", usuario.getPassword());
    }

    @Test
    void testSetters() {
        Usuario usuario = new Usuario(0, "", "", "");
        usuario.setId(2);
        usuario.setNombre("Ana");
        usuario.setEmail("ana@mail.com");
        usuario.setPassword("secret");
        assertEquals(2, usuario.getId());
        assertEquals("Ana", usuario.getNombre());
        assertEquals("ana@mail.com", usuario.getEmail());
        assertEquals("secret", usuario.getPassword());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            new Usuario(2, "Ana", "ana@mail.com", "clave"),
            null
        };
        Usuario encontrado = Usuario.buscarPorId(usuarios, 2);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getId());
        assertEquals("Ana", encontrado.getNombre());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            null
        };
        Usuario encontrado = Usuario.buscarPorId(usuarios, 3);
        assertNull(encontrado);
    }

    @Test
    void testAgregarUsuarioExitoso() {
        Usuario[] usuarios = new Usuario[2];
        Usuario nuevo = new Usuario(3, "Luis", "luis@mail.com", "abc");
        boolean agregado = Usuario.agregarUsuario(usuarios, nuevo);
        assertTrue(agregado);
        assertEquals(nuevo, usuarios[0]);
    }

    @Test
    void testAgregarUsuarioSinEspacio() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            new Usuario(2, "Ana", "ana@mail.com", "clave")
        };
        Usuario nuevo = new Usuario(3, "Luis", "luis@mail.com", "abc");
        boolean agregado = Usuario.agregarUsuario(usuarios, nuevo);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            new Usuario(2, "Ana", "ana@mail.com", "clave")
        };
        boolean eliminado = Usuario.eliminarPorId(usuarios, 2);
        assertTrue(eliminado);
        assertNull(usuarios[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            null
        };
        boolean eliminado = Usuario.eliminarPorId(usuarios, 3);
        assertFalse(eliminado);
    }
}