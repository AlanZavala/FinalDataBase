package objetos;

public class Progreso{
   
    private int idProgreso;
    private int idPaciente;
    private int velocidad; 
    private int resistencia;
    private int fuerza;  


    public Progreso(){

    }

    public Progreso(int idProgreso, int idPaciente, int velocidad, int resistencia, int fuerza){
        this.idProgreso = idProgreso;
        this.idPaciente = idPaciente;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.fuerza = fuerza;

      
    }
   
    public void setIdProgreso(int idProgreso){
        this.idProgreso = idProgreso; 
    }
    public int getIdProgreso(){
        return idProgreso; 
    }

    public void setPaciente(int idPaciente){
        this.idPaciente = idPaciente; 
    }
    public int getPaciente(){
        return idPaciente;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad; 
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setResistencia(int resistencia){
        this.resistencia = resistencia; 
    }
    public int getResistencia(){
        return resistencia;
    }
   public void setFuerza(int fuerza){
        this.fuerza = fuerza; 
    }
    
}