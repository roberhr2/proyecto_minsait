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

    // Constructor
    public Evento(int id, String nombre, Date fecha, int duracion, int idUbicacion, int idOrganizador, int idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.idUbicacion = idUbicacion;
        this.idOrganizador = idOrganizador;
        this.idCategoria = idCategoria;
    }

    // Buscar un evento por ID en un arreglo de eventos
    public static Evento buscarPorId(Evento[] eventos, int id) {
        for (Evento e : eventos) {
            if (e != null && e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Agregar un evento al primer espacio libre en el arreglo
    public static boolean agregarEvento(Evento[] eventos, Evento nuevo) {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] == null) {
                eventos[i] = nuevo;
                return true;
            }
        }
        return false; // No hay espacio
    }

    // Eliminar un evento por ID (deja el espacio como null)
    public static boolean eliminarPorId(Evento[] eventos, int id) {
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getId() == id) {
                eventos[i] = null;
                return true;
            }
        }
        return false;
    }

    // Mostrar todos los eventos
    public static void mostrarEventos(Evento[] eventos) {
        for (Evento e : eventos) {
            if (e != null) {
                System.out.println(e);
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
