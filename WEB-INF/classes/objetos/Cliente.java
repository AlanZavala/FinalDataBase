package objetos;
public class Cliente{
    private int id; 
    private int cuenta;
    private String contrasenia; 
    private int telefono; 
    private String correo;

    public Cliente(){

    }

    public Cliente(int id, int cuenta, String contrasenia, int telefono, String correo){
        this.id = id; 
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.telefono = telefono; 
        this.correo = correo;
    }

    public Cliente(int cuenta, String contrasenia, int telefono, String correo){ 
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.telefono = telefono; 
        this.correo = correo;
    }

    public void setId(int id){
        this.id = id; 
    }
    public int getId(){
        return id;
    }

    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }
    public int getCuenta(){
        return cuenta;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
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

    
}