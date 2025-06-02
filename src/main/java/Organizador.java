package main.java;

public class Organizador {
    private int id;
    private String nombre;
    private String email;
    private String password;

    public Organizador() {}

    public Organizador(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
    
    /**
     * Busca un objeto {@code Organizador} en el arreglo proporcionado por su identificador.
     *
     * @param organizadores Arreglo de objetos {@code Organizador} donde se realizará la búsqueda.
     * @param id Identificador único del organizador a buscar.
     * @return El objeto {@code Organizador} cuyo identificador coincide con el proporcionado,
     *         o {@code null} si no se encuentra ningún organizador con ese id.
     */
    public static Organizador buscarPorId(Organizador[] organizadores, int id) {
        for (Organizador o : organizadores) {
            if (o != null && o.getId() == id) {
                return o;
            }
        }
        return null;
    }
    
    /**
     * Agrega un nuevo objeto {@code Organizador} al arreglo.
     *
     * @param organizadores Arreglo de objetos {@code Organizador} donde se agregará el nuevo organizador.
     * @param nuevo Objeto {@code Organizador} a agregar.
     * @return {@code true} si el organizador fue agregado exitosamente, {@code false} si no hay espacio disponible.
     */
    public static boolean agregarOrganizador(Organizador[] organizadores, Organizador nuevo) {
        for (int i = 0; i < organizadores.length; i++) {
            if (organizadores[i] == null) {
                organizadores[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un objeto {@code Organizador} del arreglo por su identificador.
     *
     * @param organizadores Arreglo de objetos {@code Organizador} de donde se eliminará el organizador.
     * @param id Identificador único del organizador a eliminar.
     * @return {@code true} si el organizador fue eliminado exitosamente, {@code false} si no se encontró el id.
     */
    public static boolean eliminarPorId(Organizador[] organizadores, int id) {
        for (int i = 0; i < organizadores.length; i++) {
            if (organizadores[i] != null && organizadores[i].getId() == id) {
                organizadores[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todos los organizadores en el arreglo proporcionado.
     *
     * @param organizadores Arreglo de objetos {@code Organizador} a mostrar.
     */
    public static void mostrarOrganizadores(Organizador[] organizadores) {
        for (Organizador o : organizadores) {
            if (o != null) {
                System.out.println(o);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}