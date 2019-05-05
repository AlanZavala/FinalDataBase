package escuela;
public class Cliente{
    private int id; 
    private int telefono; 
    private String correo;
    private String contrasenia; 

    public Cliente(){

    }

    public Cliente(int id, int telefono, String correo, String contrasenia){
        this.id = id; 
        this.telefono = telefono; 
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Cliente(int id, int telefono, String correo){
        this.telefono = telefono; 
        this.correo = correo;
    }

    public void setId(int id){
        this.id = id; 
    }
    public int getId(){
        return id;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono; 
    }
    public int getTelefono(){
        return telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo; 
    }

    public String getCorreo(){
        return correo;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }
}