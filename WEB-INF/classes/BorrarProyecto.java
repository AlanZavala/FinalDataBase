/*import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Proyecto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/borrarProyect") 
public class BorrarProyecto extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();

            int id= Integer.parseInt(request.getParameter("test3"));
            int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            String nombre=request.getParameter("name");
            int window = Integer.parseInt(request.getParameter("pestana"));
            System.out.println("Entrar a deletions");
            String sql="Delete from trabajador_proyecto where idProyecto="+id+";";
            stat.executeUpdate(sql);

            String sql1="Delete from proyecto where idProyecto="+id+";";
            stat.executeUpdate(sql1);
            
            String sql2 = "SELECT * FROM proyecto;";

            ResultSet res = stat.executeQuery(sql2);

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
            request.setAttribute("response3", window);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/showProjects.jsp");

            if(disp!=null){
                disp.forward(request, response);
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