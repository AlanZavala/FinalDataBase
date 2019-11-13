package objetos;
public class Colaborador {
    private int ID;
    private int cuenta;
    private String nombre;
    private String apellido;
    private String edad;
    
    public Colaborador(){
        
    }
    
    public Colaborador(int ID,int cuenta, String nombre,String apellido, String edad){
        this.ID=ID;
        this.cuenta=cuenta;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad/*"yyyy-MM-dd"*/;
    }
    private String genero;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
