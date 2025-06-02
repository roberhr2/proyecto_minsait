package main.java;

import java.util.Date;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private int duracion;
    private int idUbicacion;
    private int idOrganizador;
    private int idCategoria;

    public Evento(int id, String nombre, Date fecha, int duracion, int idUbicacion, int idOrganizador, int idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.idUbicacion = idUbicacion;
        this.idOrganizador = idOrganizador;
        this.idCategoria = idCategoria;
    }

    /**
     * Busca un evento por ID en un arreglo de eventos.
     * 
     * @param eventos arreglo de eventos donde se realizará la búsqueda.
     * @param id identificador único del evento a buscar.
     * @return el evento encontrado o null si no se encuentra.
     */
    public static Evento buscarPorId(Evento[] eventos, int id) {
        for (Evento e : eventos) {
            if (e != null && e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo evento al primer espacio libre en el arreglo.
     * 
     * @param eventos arreglo de eventos donde se agregará el nuevo evento.
     * @param nuevo evento a agregar.
     * @return true si se agregó exitosamente, false si no hay espacio disponible.
     */
    public static boolean agregarEvento(Evento[] eventos, Evento nuevo) {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] == null) {
                eventos[i] = nuevo;
                return true;
            }
        }
        return false; // No hay espacio
    }

    /**
     * Elimina un evento por ID (deja el espacio como null).
     * 
     * @param eventos arreglo de eventos de donde se eliminará el evento.
     * @param id identificador único del evento a eliminar.
     * @return true si se eliminó exitosamente, false si no se encontró el id.
     */
    public static boolean eliminarPorId(Evento[] eventos, int id) {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getId() == id) {
                eventos[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todos los eventos no nulos en el arreglo proporcionado.
     * 
     * @param eventos arreglo de eventos a mostrar.
     */
    public static void mostrarEventos(Evento[] eventos) {
        for (Evento e : eventos) {
            if (e != null) {
                System.out.println(e);
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(int idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
