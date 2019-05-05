package escuela;

public class Peticion{
    private int id;
    private int idClient; 
    private String nombreProyecto; 
    private String fechaTentiva; 
    private String descripcion; 
    private int cantidad;
    private String telefono;

    public Peticion(){

    }

    public Peticion(int idClient, String nombreProyecto, String fechaTentiva, String descripcion, int cantidad,
            String telefono){        
        this.nombreProyecto = nombreProyecto; 
        this.fechaTentiva = fechaTentiva; 
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.telefono = telefono;
    }

    public Peticion(int id, int idClient, String nombreProyecto, String fechaTentiva, String descripcion, int cantidad,
            String telefono){
        this.id = id;
        this.idClient = idClient; 
        this.nombreProyecto = nombreProyecto; 
        this.fechaTentiva = fechaTentiva; 
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.telefono = telefono;
    }

    public void setId(int a){
        this.id = a; 
    }
    public int getId(){
        return id; 
    }

    public void setCliente(int a){
        this.idClient = a; 
    }
    public int getCliente(){
        return idClient;
    }

    public void setNombreProyecto(String a){
        this.nombreProyecto = a; 
    }
    public String getNombreProyecto(){
        return nombreProyecto;
    }

    public void setFecha(String a){
        this.fechaTentiva = a; 
    }
    public String getFecha(){
        return fechaTentiva;
    }

    public void setDescripcion(String a){
        this.descripcion = a; 
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setCantidad(int a){
        this.cantidad = a; 
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setTelefono(String a){
        this.telefono = a; 
    }
    public String getTelefono(){
        return telefono;
    }
}