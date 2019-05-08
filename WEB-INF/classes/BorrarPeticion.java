import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Peticion;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/borrarPeticion") 
public class BorrarPeticion extends HttpServlet{
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
            String sql="Delete from peticion where idPeticion="+id+";";
            stat.executeUpdate(sql);

            
            
            String sql2 = "SELECT * FROM peticion;";

            ResultSet res = stat.executeQuery(sql2);

            

            Vector<Peticion> peticiones = new Vector<Peticion>();

            while(res.next()){

                Peticion aux = new Peticion();

                aux.setId(res.getInt("idPeticion"));
                aux.setCliente(res.getInt("idCliente"));
                aux.setNombreProyecto(res.getString("nombreProyecto"));
                aux.setFecha(res.getString("fechaTentativa"));
                aux.setDescripcion(res.getString("descripcion"));
                aux.setCantidad(res.getInt("cantidad"));
                aux.setTelefono(res.getString("telefono"));

                peticiones.add(aux);

            }

            stat.close();
            con.close();

            request.setAttribute("peticiones", peticiones);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/showPeticion.jsp");

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
}