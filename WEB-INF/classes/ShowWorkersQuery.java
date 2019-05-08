import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import objetos.Producto;
import objetos.Trabajador;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowWorkers")
public class ShowWorkersQuery extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");


			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);

			Statement stat = con.createStatement();
			String sql;
			String nombre=request.getParameter("nombre");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));
			
			String sql2 = "SELECT * FROM trabajador;";

			ResultSet res = stat.executeQuery(sql2);

			Vector<Trabajador> trabajadores = new Vector<Trabajador>();

            while(res.next()){
                Trabajador aux = new Trabajador();
                aux.setId(res.getInt("idTrabajador"));
                aux.setDireccion(res.getString("direccion"));
                aux.setTelefono(res.getInt("telefono"));
                aux.setCorreo(res.getString("correo"));
                aux.setPuesto(res.getString("puesto"));
                aux.setEdad(res.getInt("edad")); 
                aux.setNombre(res.getString("nombre")); 
                aux.setApellido(res.getString("apellido")); 
                aux.setCuenta(res.getInt("cuenta")); 
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