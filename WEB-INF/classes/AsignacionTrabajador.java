/*import java.sql.*;
import java.text.SimpleDateFormat; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Proyecto;
import objetos.Producto;
import objetos.Trabajador;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/AsignarTrabajador")
public class AsignacionTrabajador extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();
            int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            String nombre=request.getParameter("name");

            int window= Integer.parseInt(request.getParameter("pestana"));
            int idTrabajador= Integer.parseInt(request.getParameter("asign"));

            int idProyecto= Integer.parseInt(request.getParameter("test4"));


            boolean checkAddWorker=false;
            boolean checkDupli=true;

            

            String checkDuplicates="select * from trabajador_proyecto;";

            ResultSet res3 = stat.executeQuery(checkDuplicates);


            while(res3.next()){
                
                if(res3.getInt("idTrabajador")==idTrabajador && res3.getInt("idProyecto")==idProyecto){
                

                    checkDupli=false;
                    break;
                }

            }

            String verifySql="Select * from trabajador";

            ResultSet res = stat.executeQuery(verifySql);

            while(res.next() && checkDupli){
                if(res.getInt("idTrabajador")==idTrabajador){
                    checkAddWorker=true;
                    break;
                }

            }

            String sql=" ";
            
            if(checkAddWorker){
                sql= "Insert into trabajador_proyecto VALUES("+idTrabajador+","+idProyecto+");";
                stat.executeUpdate(sql);
            }

            String sql3="SELECT * FROM proyecto;";

            ResultSet res2 = stat.executeQuery(sql3);

            Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res2.next()){
                Proyecto aux = new Proyecto();
                aux.setId(res2.getInt("idProyecto"));
                aux.setNombre(res2.getString("nombre"));
                aux.setFechaInicio(res2.getString("fechaDeInicio"));
                aux.setFechaFin(res2.getString("fechaDeTermino"));
                aux.setDuracion(res2.getInt("duracion"));
                aux.setDescripcion(res2.getString("descripcion")); 
                aux.setCuenta(res2.getInt("idCliente"));
                aux.setCantidad(res2.getInt("cantidad"));
                aux.setPrecioTotal(res2.getFloat("precioTotal"));
                proyectos.add(aux);
            }
            
            stat.close();
            con.close();

            request.setAttribute("proyectos", proyectos);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showProjects.jsp");

            if(disp!=null){
                disp.forward(request,response);
            }
		}
		catch(Exception e){
			try{
                e.printStackTrace();
            }
            catch(Exception e2){
                try{
                e.printStackTrace();
            }
            catch(Exception e3){
                e3.printStackTrace();
            }   
            }   
          
		}

	}	

}*/