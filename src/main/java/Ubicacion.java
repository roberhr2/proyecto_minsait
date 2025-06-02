package main.java;

public class Ubicacion {
    
    private int id;
    private boolean online;
    private String direccion;

    public Ubicacion() {}

    public Ubicacion(int id, boolean online, String direccion) {
        this.id = id;
        this.online = online;
        this.direccion = direccion;
    }
    
    /**
     * Busca una ubicación por ID en un arreglo de ubicaciones.
     * 
     * @param ubicaciones arreglo de ubicaciones donde se realizará la búsqueda.
     * @param id identificador único de la ubicación a buscar.
     * @return la ubicación encontrada o null si no se encuentra.
     */
    public static Ubicacion buscarPorId(Ubicacion[] ubicaciones, int id) {
        for (Ubicacion u : ubicaciones) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    /**
     * Agrega una nueva ubicación al primer espacio libre en el arreglo.
     * 
     * @param ubicaciones arreglo de ubicaciones donde se agregará la nueva ubicación.
     * @param nueva ubicación a agregar.
     * @return true si se agregó exitosamente, false si no hay espacio disponible.
     */
    public static boolean agregarUbicacion(Ubicacion[] ubicaciones, Ubicacion nueva) {
        for (int i = 0; i < ubicaciones.length; i++) {
            if (ubicaciones[i] == null) {
                ubicaciones[i] = nueva;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina una ubicación por ID (deja el espacio como null).
     * 
     * @param ubicaciones arreglo de ubicaciones de donde se eliminará la ubicación.
     * @param id identificador único de la ubicación a eliminar.
     * @return true si se eliminó exitosamente, false si no se encontró el id.
     */
    public static boolean eliminarPorId(Ubicacion[] ubicaciones, int id) {
        for (int i = 0; i < ubicaciones.length; i++) {
            if (ubicaciones[i] != null && ubicaciones[i].getId() == id) {
                ubicaciones[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todas las ubicaciones en el arreglo.
     * 
     * @param ubicaciones arreglo de ubicaciones a mostrar.
     */
    public static void mostrarUbicaciones(Ubicacion[] ubicaciones) {
        for (Ubicacion u : ubicaciones) {
            if (u != null) {
                System.out.println(u);
            }
        }
    }

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

    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", online=" + online +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
