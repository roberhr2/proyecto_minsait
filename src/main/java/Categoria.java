package main.java;

public class Categoria {
    private int id;
    private String nombre;

    public Categoria() {}

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Busca una categoría por ID en un arreglo de categorías.
     * 
     * @param categorias arreglo de categorías donde se realizará la búsqueda.
     * @param id identificador único de la categoría a buscar.
     * @return la categoría encontrada o null si no se encuentra.
     */
    public static Categoria buscarPorId(Categoria[] categorias, int id) {
        for (Categoria c : categorias) {
            if (c != null && c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    /**
     * Agrega una nueva categoría al primer espacio libre en el arreglo.
     * 
     * @param categorias arreglo de categorías donde se agregará la nueva categoría.
     * @param nueva categoría a agregar.
     * @return true si se agregó exitosamente, false si no hay espacio disponible.
     */
    public static boolean agregarCategoria(Categoria[] categorias, Categoria nueva) {
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i] == null) {
                categorias[i] = nueva;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina una categoría por ID (deja el espacio como null).
     * 
     * @param categorias arreglo de categorías de donde se eliminará la categoría.
     * @param id identificador único de la categoría a eliminar.
     * @return true si se eliminó exitosamente, false si no se encontró el id.
     */
    public static boolean eliminarPorId(Categoria[] categorias, int id) {
        for (int i = 0; i < categorias.length; i++) {
            if (categorias[i] != null && categorias[i].getId() == id) {
                categorias[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todas las categorías no nulas en el arreglo.
     * 
     * @param categorias arreglo de categorías a mostrar.
     */
    public static void mostrarCategorias(Categoria[] categorias) {
        for (Categoria c : categorias) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

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

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}