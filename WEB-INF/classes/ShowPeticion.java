/*import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
import objetos.Peticion;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowPeticion")
public class ShowPeticion extends HttpServlet{

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
			String nombre=request.getParameter("nombre");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
			int window= Integer.parseInt(request.getParameter("pestana"));

			
			String sql = "SELECT * FROM peticion;";

			ResultSet res = stat.executeQuery(sql);

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

}*/