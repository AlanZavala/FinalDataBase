package escuela;
public class Proyecto{ 
    private int id; 
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private int duracion;
    private String descripcion;

    public Proyecto(){

    }

    public Proyecto(int id, String nombre, String fechaInicio, String fechaFin, int duracion, String descripcion){
        this.id = id; 
        this.nombre = nombre; 
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracion = duracion;
        this.descripcion = descripcion;
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

}