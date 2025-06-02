package main.java;

public class Inscripcion {
    // Atributos
    private int id;
    private int idUsuario;
    private int idEvento;
    private boolean cancelado;

    public Inscripcion() {
    }

    public Inscripcion(int id, int idUsuario, int idEvento, boolean cancelado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.cancelado = cancelado;
    }

    /**
     * Busca una inscripción por su ID en el arreglo proporcionado.
     * 
     * @param inscripciones arreglo de inscripciones donde se realizará la búsqueda.
     * @param id identificador único de la inscripción a buscar.
     * @return la inscripción encontrada o null si no se encuentra.
     */
    public static Inscripcion buscarPorId(Inscripcion[] inscripciones, int id) {
        for (Inscripcion i : inscripciones) {
            if (i != null && i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    /**
     * Agrega una nueva inscripción al primer espacio libre en el arreglo.
     * 
     * @param inscripciones arreglo de inscripciones donde se agregará la nueva inscripción.
     * @param nueva inscripción a agregar.
     * @return true si se agregó exitosamente, false si no hay espacio disponible.
     */
    public static boolean agregarInscripcion(Inscripcion[] inscripciones, Inscripcion nueva) {
        for (int i = 0; i < inscripciones.length; i++) {
            if (inscripciones[i] == null) {
                inscripciones[i] = nueva;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina una inscripción por su ID (deja el espacio como null).
     * 
     * @param inscripciones arreglo de inscripciones de donde se eliminará la inscripción.
     * @param id identificador único de la inscripción a eliminar.
     * @return true si se eliminó exitosamente, false si no se encontró el id.
     */
    public static boolean eliminarPorId(Inscripcion[] inscripciones, int id) {
        for (int i = 0; i < inscripciones.length; i++) {
            if (inscripciones[i] != null && inscripciones[i].getId() == id) {
                inscripciones[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todas las inscripciones en el arreglo proporcionado.
     * 
     * @param inscripciones arreglo de inscripciones a mostrar.
     */
    public static void mostrarInscripciones(Inscripcion[] inscripciones) {
        for (Inscripcion i : inscripciones) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idEvento=" + idEvento +
                ", cancelado=" + cancelado +
                '}';
    }
}

