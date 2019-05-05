import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
import escuela.Peticion;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowPeticion")
public class ShowPeticion extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{
			
			// PrintWriter writer = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
			// PrintWriter writer2 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
			// PrintWriter writer3 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");

			// writer.println("The first line");
			// writer.println("The second line");

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");


			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);
			//writer.close();

			Statement stat = con.createStatement();
			String nombre=request.getParameter("nombre");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
			int window= Integer.parseInt(request.getParameter("pestana"));

			
			String sql = "SELECT * FROM peticion;";
			//writer2.println(sql2);
			//writer2.close();

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

            //writer3.println("the vector size is "+productos.size());
            // writer3.println("hello "+productos.get(0).id);
            // writer3.println("hello "+productos.get(1).id);
            //writer3.close();

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
				//PrintWriter writer4 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
				e.printStackTrace();
				//writer4.println(e);
				//writer4.close();
			}
			catch(Exception e2){
				try{
				//PrintWriter writer5 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
				e.printStackTrace();
				//writer5.println(e);
				//writer5.close();
			}
			catch(Exception e3){
				e3.printStackTrace();
			}	
			}	
		}
	}

}