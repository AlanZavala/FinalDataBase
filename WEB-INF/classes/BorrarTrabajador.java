import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Trabajador;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/BorrarWorker") 
public class BorrarTrabajador extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();

            int id = Integer.parseInt(request.getParameter("test3"));
            int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            String nombre=request.getParameter("name");
            int window= Integer.parseInt(request.getParameter("pestana"));

            String sql2="Delete from trabajador_proyecto where idTrabajador="+id+";";
            stat.executeUpdate(sql2);

            String sql="Delete from trabajador where idTrabajador="+id+";";
            stat.executeUpdate(sql);
            
            String sql4 = "SELECT * FROM trabajador;";

            ResultSet res = stat.executeQuery(sql4);

            Vector<Trabajador> trabajadores = new Vector<Trabajador>();

            while(res.next()){

                Trabajador aux = new Trabajador();
                aux.setId(res.getInt("idTrabajador"));
                aux.setNombre(res.getString("nombre"));
                aux.setApellido(res.getString("apellido"));
                aux.setCuenta(res.getInt("cuenta"));
                aux.setEdad(res.getInt("edad"));
                aux.setCorreo(res.getString("correo"));
                aux.setTelefono(res.getInt("telefono"));
                aux.setDireccion(res.getString("direccion"));
                aux.setPuesto(res.getString("puesto"));
                aux.setContrasenia(res.getString("contrasenia"));
                trabajadores.add(aux);

            }

            stat.close();
            con.close();

            request.setAttribute("trabajadores", trabajadores);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/showWorkers.jsp");

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