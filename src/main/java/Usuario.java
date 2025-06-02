package main.java;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;

    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /**
     * Busca un usuario por su ID en el arreglo proporcionado.
     * 
     * @param usuarios arreglo de usuarios donde se realizará la búsqueda.
     * @param id identificador único del usuario a buscar.
     * @return el usuario encontrado o null si no se encuentra.
     */
    public static Usuario buscarPorId(Usuario[] usuarios, int id) {
        for (Usuario u : usuarios) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo usuario al primer espacio libre en el arreglo.
     * 
     * @param usuarios arreglo de usuarios donde se agregará el nuevo usuario.
     * @param nuevo usuario a agregar.
     * @return true si se agregó exitosamente, false si no hay espacio disponible.
     */
    public static boolean agregarUsuario(Usuario[] usuarios, Usuario nuevo) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un usuario por su ID (deja el espacio como null).
     * 
     * @param usuarios arreglo de usuarios de donde se eliminará el usuario.
     * @param id identificador único del usuario a eliminar.
     * @return true si se eliminó exitosamente, false si no se encontró el id.
     */
    public static boolean eliminarPorId(Usuario[] usuarios, int id) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getId() == id) {
                usuarios[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todos los usuarios en el arreglo proporcionado.
     * 
     * @param usuarios arreglo de usuarios a mostrar.
     */
    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (Usuario u : usuarios) {
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
}
