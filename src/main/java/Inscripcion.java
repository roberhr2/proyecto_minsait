package main.java;

public class Inscripcion {
    // Atributos
    private int id;
    private int idUsuario;
    private int idEvento;
    private boolean cancelado;

    // Constructor vacío (por defecto)
    public Inscripcion() {
    }

    // Constructor con todos los parámetros
    public Inscripcion(int id, int idUsuario, int idEvento, boolean cancelado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.cancelado = cancelado;
    }

    public static Inscripcion buscarPorId(Inscripcion[] inscripciones, int id) {
        for (Inscripcion i : inscripciones) {
            if (i != null && i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean agregarInscripcion(Inscripcion[] inscripciones, Inscripcion nueva) {
        for (int i = 0; i < inscripciones.length; i++) {
            if (inscripciones[i] == null) {
                inscripciones[i] = nueva;
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarPorId(Inscripcion[] inscripciones, int id) {
        for (int i = 0; i < inscripciones.length; i++) {
            if (inscripciones[i] != null && inscripciones[i].getId() == id) {
                inscripciones[i] = null;
                return true;
            }
        }
        return false;
    }

    public static void mostrarInscripciones(Inscripcion[] inscripciones) {
        for (Inscripcion i : inscripciones) {
            if (i != null) {
                System.out.println(i);
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

    // Método toString para imprimir información de la inscripción
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

