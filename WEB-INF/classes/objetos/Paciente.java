package objetos;
public class Paciente{
    private int id; 
    private int cuenta;
    private String contrasenia; 
    private String nombre;
    private String apellido;
    private String edad;
    private String tipoU;
    private String genero;
    private int id_rutina;

    public Paciente(){

    }

    public Paciente(int id, int cuenta, String contrasenia, String nombre, String apellido, String edad, String tipoU, String genero, int id_rutina){
        this.id = id; 
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.nombre = nombre; 
        this.apellido = apellido;
        this.edad = edad;
        this.tipoU = tipoU; 
        this.genero = genero;
        this.id_rutina = id_rutina;
    }

    public Paciente(int cuenta, String contrasenia, String nombre, String apellido, String edad, String tipoU, String genero, int id_rutina){ 
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.nombre = nombre; 
        this.apellido = apellido;
        this.edad = edad;
        this.tipoU = tipoU; 
        this.genero = genero;
        this.id_rutina = id_rutina;
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
    public void setEdad(String edad){
        this.edad = edad; 
    }

    public String getEdad(){
        return edad;
    }
    public void setTipoU(String tipoU){
        this.tipoU = tipoU; 
    }

    public String getTipoU(){
        return tipoU;
    }

    public void setGenero(String genero){
        this.genero = genero; 
    }

    public String getGenero(){
        return genero;
    }

    public void setIdRutina(int id_rutina){
        this.id_rutina = id_rutina;
    }
    public int getIdRutina(){
        return id_rutina;
    }
    
}