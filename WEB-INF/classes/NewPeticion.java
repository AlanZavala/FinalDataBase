/*import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Peticion;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;

@WebServlet("/NewPeticion")
public class NewPeticion extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();

            String name=request.getParameter("name");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            int window=Integer.parseInt(request.getParameter("pestana"));
            
            int id = Integer.parseInt(request.getParameter("id"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            String nombreProyecto  = request.getParameter("nombre");
            String fechaTentativa = request.getParameter("fechaTentativa") ;
            String descripcion = request.getParameter("descripcion");
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            String telefono = request.getParameter("telefono");



            String sql = "INSERT INTO peticion values(" + id + ", " + idCliente + ", '" + nombreProyecto + "','" + fechaTentativa + "', '" + descripcion + "', " + cantidad + ", '"+ telefono + "');";
            stat.executeUpdate(sql);

            String sql2="Select * from peticion where idPeticion="+id+";";

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
            
            request.setAttribute("peticiones",peticiones);
            

            request.setAttribute("response", name);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showPeticion.jsp");

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
