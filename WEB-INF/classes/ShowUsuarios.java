import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import objetos.Cuenta;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowUsuarios")
public class ShowUsuarios extends HttpServlet{
 
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
			String nombre = request.getParameter("nombre");
			int cuenta = Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));
			
			String sql2 = "SELECT * FROM cuenta;";

			ResultSet res = stat.executeQuery(sql2);

			Vector<Cuenta> colaboradores = new Vector<Cuenta>();

            while(res.next()){
                Cuenta aux = new Cuenta();
                aux.setUsername(res.getInt("ID"));
                aux.setPassword(res.getString("contrasenia"));
                colaboradores.add(aux);
            }

			stat.close();
            con.close();

			request.setAttribute("colaboradores", colaboradores);
			request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showUsuarios.jsp");

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