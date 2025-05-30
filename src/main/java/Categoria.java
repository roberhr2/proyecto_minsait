package main.java;

public class Categoria {
    private int id;
    private String nombre;

    // Constructor vacío
    public Categoria() {}

    // Constructor con parámetros
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Buscar una categoría por ID en un arreglo
    public static Categoria buscarPorId(Categoria[] categorias, int id) {
        for (Categoria c : categorias) {
            if (c != null && c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    // Agregar una categoría al primer espacio libre en el arreglo
    public static boolean agregarCategoria(Categoria[] categorias, Categoria nueva) {
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i] == null) {
                categorias[i] = nueva;
                return true;
            }
        }
        return false;
    }

    // Eliminar una categoría por ID (deja el espacio como null)
    public static boolean eliminarPorId(Categoria[] categorias, int id) {
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i] != null && categorias[i].getId() == id) {
                categorias[i] = null;
                return true;
            }
        }
        return false;
    }

    // Mostrar todas las categorías
    public static void mostrarCategorias(Categoria[] categorias) {
        for (Categoria c : categorias) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString
    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}