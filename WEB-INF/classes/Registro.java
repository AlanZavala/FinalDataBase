/*import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import objetos.Trabajador;
import objetos.Cuenta;
import javax.servlet.annotation.WebServlet;

@WebServlet("/registro")
public class Registro extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");

            String idValidation=request.getParameter("id");
            String telValidation=request.getParameter("telefono");
            String userValidation=request.getParameter("username");
            String mensaje=request.getParameter("mensaje");

            String name=request.getParameter("nombre");
			int cuentas=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));

            if(idValidation.charAt(0)<48 || idValidation.charAt(0)>57 || telValidation.length()>8 || (userValidation.charAt(0)!='2'&& userValidation.charAt(0)!='1')){
            	mensaje="¡Llena correctamente los datos!";
            	request.setAttribute("response", name);
            	request.setAttribute("response2", cuentas);
            	request.setAttribute("response3", window);
            	request.setAttribute("mensaje", mensaje);


			RequestDispatcher disp = getServletContext().getRequestDispatcher("/altaTrabajadores.jsp");
				if(disp!=null){
					disp.forward(request,response);
				}
            }
			else{
            int id= Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombres");
            String apellido = request.getParameter("apellido");
            int username = Integer.parseInt(request.getParameter("username"));
            String password = request.getParameter("password");
            int edad = Integer.parseInt(request.getParameter("edad"));
            String correo = request.getParameter("correo");
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            String direccion = request.getParameter("direccion");
			String puesto = request.getParameter("puesto");

			Cuenta cuenta = new Cuenta(username, password);
			mensaje="¡Alta exitosa!";

			Trabajador newTrabajador = new Trabajador(id, nombre, apellido, username, edad, correo, telefono, direccion, puesto, password);
            
            Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);

			Statement stat = con.createStatement();

			

			String sql2 = "INSERT INTO cuenta VALUES ("+ username+" ,'" +password+ "');";
            String sql = "INSERT INTO trabajador values("+id+", '" + direccion + "', " + telefono + ", '"  + correo + "', '"  + puesto + "', "  + edad + ", '"   + nombre + "', '"   + apellido + "', "  + username + ", '" + password +   "');";
			stat.executeUpdate(sql2);
			stat.executeUpdate(sql);
			System.out.println("Sí se guard el nuevo trabajador");
			stat.close();
			con.close();

			request.setAttribute("response", name);
            request.setAttribute("response2", cuentas);
            request.setAttribute("response3", window);
            request.setAttribute("mensaje", mensaje);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/altaTrabajadores.jsp");

			if(disp!=null){
				disp.forward(request,response);
			}
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
