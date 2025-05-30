package main.java;

public class Organizador {
    private int id;
    private String nombre;
    private String email;
    private String password;

    // Constructor vacío
    public Organizador() {}

    // Constructor con parámetros
    public Organizador(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
    
    // Buscar un organizador por ID en un arreglo
    public static Organizador buscarPorId(Organizador[] organizadores, int id) {
        for (Organizador o : organizadores) {
            if (o != null && o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    // Agregar un organizador al primer espacio libre en el arreglo
    public static boolean agregarOrganizador(Organizador[] organizadores, Organizador nuevo) {
        for (int i = 0; i < organizadores.length; i++) {
            if (organizadores[i] == null) {
                organizadores[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    // Eliminar un organizador por ID (deja el espacio como null)
    public static boolean eliminarPorId(Organizador[] organizadores, int id) {
        for (int i = 0; i < organizadores.length; i++) {
            if (organizadores[i] != null && organizadores[i].getId() == id) {
                organizadores[i] = null;
                return true;
            }
        }
        return false;
    }

    // Mostrar todos los organizadores
    public static void mostrarOrganizadores(Organizador[] organizadores) {
        for (Organizador o : organizadores) {
            if (o != null) {
                System.out.println(o);
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

    // Método toString
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