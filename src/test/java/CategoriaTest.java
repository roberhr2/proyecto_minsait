package test.java;

import main.java.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CategoriaTest {

    @Test
    void testConstructorYGetters() {
        Categoria cat = new Categoria(1, "Libros");
        assertEquals(1, cat.getId());
        assertEquals("Libros", cat.getNombre());
    }

    @Test
    void testSetters() {
        Categoria cat = new Categoria();
        cat.setId(2);
        cat.setNombre("Música");
        assertEquals(2, cat.getId());
        assertEquals("Música", cat.getNombre());
    }

    @Test
    void testBuscarPorIdEncontrado() {
        Categoria[] categorias = {
            new Categoria(1, "Libros"),
            new Categoria(2, "Música"),
            null
        };
        Categoria encontrada = Categoria.buscarPorId(categorias, 2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getId());
        assertEquals("Música", encontrada.getNombre());
    }

    @Test
    void testBuscarPorIdNoEncontrado() {
        Categoria[] categorias = {
            new Categoria(1, "Libros"),
            null
        };
        Categoria encontrada = Categoria.buscarPorId(categorias, 3);
        assertNull(encontrada);
    }

    @Test
    void testAgregarCategoriaExitoso() {
        Categoria[] categorias = new Categoria[2];
        Categoria nueva = new Categoria(3, "Deportes");
        boolean agregado = Categoria.agregarCategoria(categorias, nueva);
        assertTrue(agregado);
        assertEquals(nueva, categorias[0]);
    }

    @Test
    void testAgregarCategoriaSinEspacio() {
        Categoria[] categorias = {
            new Categoria(1, "Libros"),
            new Categoria(2, "Música")
        };
        Categoria nueva = new Categoria(3, "Deportes");
        boolean agregado = Categoria.agregarCategoria(categorias, nueva);
        assertFalse(agregado);
    }

    @Test
    void testEliminarPorIdExitoso() {
        Categoria[] categorias = {
            new Categoria(1, "Libros"),
            new Categoria(2, "Música")
        };
        boolean eliminado = Categoria.eliminarPorId(categorias, 2);
        assertTrue(eliminado);
        assertNull(categorias[1]);
    }

    @Test
    void testEliminarPorIdNoEncontrado() {
        Categoria[] categorias = {
            new Categoria(1, "Libros"),
            null
        };
        boolean eliminado = Categoria.eliminarPorId(categorias, 3);
        assertFalse(eliminado);
    }

    @Test
    void testToString() {
        Categoria cat = new Categoria(5, "Tecnología");
        String esperado = "Categoria{id=5, nombre='Tecnología'}";
        assertEquals(esperado, cat.toString());
    }
}