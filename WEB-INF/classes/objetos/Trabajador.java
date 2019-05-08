package objetos;
public class Trabajador{
    private int id;
    private String nombre;
    private String apellido;
    private int cuenta;
    private int edad;
    private String correo;
    private int telefono;
    private String direccion;
    private String puesto;
    private String contrasenia;
    public Trabajador(){
        
    }
    public Trabajador(int id, String nombre, String apellido, int cuenta, int edad, String correo, int telefono, String direccion, String puesto, String contrasenia){
            this.id=id;
            this.nombre = nombre; 
            this.apellido = apellido; 
            this.cuenta = cuenta; 
            this.edad = edad; 
            this.correo = correo;
            this.telefono = telefono; 
            this.direccion = direccion; 
            this.puesto = puesto;
            this.contrasenia = contrasenia;
    }

    public int getId(){
        return id;
    }
    public void setId(int a){
        this.id=a;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String a){
        this.nombre = a;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String a){
        this.apellido = a;
    }

    public int getCuenta(){
        return cuenta;
    }

    public void setCuenta(int a){
        this.cuenta = a;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int a){
        this.edad = a;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String a){
        this.correo = a;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int a){
        this.telefono = a;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String a){
        this.direccion = a;
    }

    public String getPuesto(){
        return puesto;
    }

    public void setPuesto(String a){
        this.puesto = a;
    }
    public String getContrasenia(){
        return contrasenia;
    }

    public void setContrasenia(String a){
        this.contrasenia = a;
    }
}