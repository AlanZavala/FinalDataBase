package objetos;
public class Usuario{
    private int username;
    private String password;
    private String edad;
    private String nombre;
    private String apellido;
    private String tipo_usuario; 
    private int id_rutina;

    public Usuario (int username, String password){
        this.username = username; 
        this.password = password;
    }

    public Usuario (int username, String password, String edad, String nombre, String apellido, String tipo_usuario, int id_rutina){
        this.username = username; 
        this.password = password;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_usuario = tipo_usuario;
        this.id_rutina = id_rutina;
    }

    public void setUsername(int username){
        this.username = username;
    }

    public int getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    } 

    public void setEdad(String edad){
        this.edad = edad;
    }

    public String getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    } 

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }

    public void setTipoU(String tipo_usuario){
        this.tipo_usuario = tipo_usuario;
    }
    public String getTipoU(){
        return tipo_usuario;
    }  

    public void setIdRutina(int id_rutina){
        this.id_rutina = id_rutina;
    }

    public int getIdRutina(){
        return id_rutina;
    }
}