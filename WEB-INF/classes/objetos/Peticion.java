package objetos;

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

    public Peticion(int id, int idClient, String nombreProyecto, String fechaTentiva, String descripcion, int cantidad, String telefono){
        this.id = id;
        this.idClient = idClient; 
        this.nombreProyecto = nombreProyecto; 
        this.fechaTentiva = fechaTentiva; 
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.telefono = telefono;
    }

    public void setId(int id){
        this.id = id; 
    }
    public int getId(){
        return id; 
    }

    public void setCliente(int idClient){
        this.idClient = idClient; 
    }
    public int getCliente(){
        return idClient;
    }

    public void setNombreProyecto(String nombreProyecto){
        this.nombreProyecto = nombreProyecto; 
    }
    public String getNombreProyecto(){
        return nombreProyecto;
    }

    public void setFecha(String fechaTentiva){
        this.fechaTentiva = fechaTentiva; 
    }
    public String getFecha(){
        return fechaTentiva;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad; 
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono; 
    }
    public String getTelefono(){
        return telefono;
    }
}