/*import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Proyecto;
import objetos.Producto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/buscarProyecto") 
public class BuscarProyecto extends HttpServlet{
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
            
            String comboBChoice=request.getParameter("optBusq");
            String busqueda = request.getParameter("valueBusca");
            String sql=" ";
            
            if(comboBChoice.equals("Id")){
                int id=Integer.parseInt(busqueda);
                sql= "SELECT * FROM proyecto where idProyecto="+id+";";
            }
            else if(comboBChoice.equals("Nombre")){
                sql= "SELECT * FROM proyecto where nombre='"+busqueda+"';";
            }
            else if(comboBChoice.equals("idCliente")){
                sql= "SELECT * FROM proyecto where nombre='"+busqueda+"';";
            }
            
            else if(comboBChoice.equals("All")){
                sql= "SELECT * FROM proyecto;";
            }


            ResultSet res = stat.executeQuery(sql);

            Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res.next()){
                Proyecto aux = new Proyecto();
                aux.setId(res.getInt("idProyecto"));
                aux.setNombre(res.getString("nombre"));
                aux.setFechaInicio(res.getString("fechaDeInicio"));
                aux.setFechaFin(res.getString("fechaDeTermino"));
                aux.setDuracion(res.getInt("duracion"));
                aux.setDescripcion(res.getString("descripcion")); 
                aux.setCuenta(res.getInt("idCliente"));
                aux.setCantidad(res.getInt("cantidad"));
                aux.setPrecioTotal(res.getFloat("precioTotal"));
                proyectos.add(aux);
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("proyectos", proyectos);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
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