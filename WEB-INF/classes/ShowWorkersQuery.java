import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import escuela.Producto;
import escuela.Trabajador;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowWorkers")
public class ShowWorkersQuery extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{
			
			PrintWriter writer = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
			PrintWriter writer2 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
			PrintWriter writer3 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");

			writer.println("The first line");
			writer.println("The second line");

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");


			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);
			writer.close();

			Statement stat = con.createStatement();
			String sql;
			
			String sql2 = "SELECT * FROM trabajador;";
			writer2.println(sql2);
			writer2.close();

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


            writer3.close();

			stat.close();
            con.close();

			request.setAttribute("trabajadores", trabajadores);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showWorkers.jsp");

			if(disp!=null){
				disp.forward(request, response);
			}
		}
		catch(Exception e){			
			try{
				PrintWriter writer4 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
				e.printStackTrace();
				writer4.println(e);
				writer4.close();
			}
			catch(Exception e2){
				try{
				PrintWriter writer5 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
				e.printStackTrace();
				writer5.println(e);
				writer5.close();
			}
			catch(Exception e3){
				e3.printStackTrace();
			}	
			}	
		}
	}

}