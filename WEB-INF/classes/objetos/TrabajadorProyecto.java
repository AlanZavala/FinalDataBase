package objetos;
public class TrabajadorProyecto{
    private int iDTrabajador;
    private int iDProyecto;

    public TrabajadorProyecto(){

    }
    public TrabajadorProyecto(int iDTrabajadorD, int iDProyecto){
        this.iDTrabajador = iDTrabajador; 
        this.iDProyecto = iDProyecto;
    }

    public void setIdTrabajador(int iDTrabajador){
        this.iDTrabajador = iDTrabajador; 
    }

    public int getUsername(){
        return iDTrabajador;
    }

    public void setPassword(int iDProyecto){
        this.iDProyecto = iDProyecto;
    }
    public int getPassword(){
        return iDProyecto;
    } 
}