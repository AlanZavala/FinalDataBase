package objetos;
public class Proyecto{ 
    private int id; 
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private int duracion; 
    private String descripcion;
    private int cuenta;
    private int cantidad;
    private float precioTotal;


    public Proyecto(){

    }

    public Proyecto(int id, String nombre, String fechaInicio, String fechaFin, int duracion, String descripcion, int cuenta, int cantidad, float precioTotal){
        this.id = id; 
        this.nombre = nombre; 
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.cuenta=cuenta;
        this.cantidad=cantidad;
        this.precioTotal=precioTotal;
    }

    public Proyecto(String nombre, String fechaInicio, String fechaFin, int duracion, String descripcion){
        this.nombre = nombre; 
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public void setId(int id){
        this.id = id; 
    }
    public int getId(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public String getNombre(){
        return nombre;
    }

    public void setFechaInicio(String fechaInicio){
        this.fechaInicio = fechaInicio; 
    }
    public String getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaFin(String fechaFin){
        this.fechaFin = fechaFin; 
    }
    public String getFechaFin(){
        return fechaFin;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion; 
    }
    public int getDuracion(){
        return duracion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }
    public String getDescripcion(){
        return descripcion;
    }
     public int getCuenta(){
        return cuenta;
    }

    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }
     public float getPrecioTotal(){
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal){
        this.precioTotal = precioTotal;
    }
     public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad= cantidad;
    }

}