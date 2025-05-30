package main.java;

public class Ubicacion {
    
    private int id;
    private boolean online;
    private String direccion;

    // Constructor vacío
    public Ubicacion() {}

    // Constructor con parámetros
    public Ubicacion(int id, boolean online, String direccion) {
        this.id = id;
        this.online = online;
        this.direccion = direccion;
    }
    
    // Buscar una ubicación por ID en un arreglo
    public static Ubicacion buscarPorId(Ubicacion[] ubicaciones, int id) {
        for (Ubicacion u : ubicaciones) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    // Agregar una ubicación al primer espacio libre en el arreglo
    public static boolean agregarUbicacion(Ubicacion[] ubicaciones, Ubicacion nueva) {
        for (int i = 0; i < ubicaciones.length; i++) {
            if (ubicaciones[i] == null) {
                ubicaciones[i] = nueva;
                return true;
            }
        }
        return false;
    }

    // Eliminar una ubicación por ID (deja el espacio como null)
    public static boolean eliminarPorId(Ubicacion[] ubicaciones, int id) {
        for (int i = 0; i < ubicaciones.length; i++) {
            if (ubicaciones[i] != null && ubicaciones[i].getId() == id) {
                ubicaciones[i] = null;
                return true;
            }
        }
        return false;
    }

    // Mostrar todas las ubicaciones
    public static void mostrarUbicaciones(Ubicacion[] ubicaciones) {
        for (Ubicacion u : ubicaciones) {
            if (u != null) {
                System.out.println(u);
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

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", online=" + online +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
