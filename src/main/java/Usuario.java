package main.java;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;

    // Constructor
    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public static Usuario buscarPorId(Usuario[] usuarios, int id) {
        for (Usuario u : usuarios) {
            if (u != null && u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public static boolean agregarUsuario(Usuario[] usuarios, Usuario nuevo) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarPorId(Usuario[] usuarios, int id) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getId() == id) {
                usuarios[i] = null;
                return true;
            }
        }
        return false;
    }

    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (Usuario u : usuarios) {
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
