/*import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import objetos.Cliente;
import objetos.Cuenta;
import javax.servlet.annotation.WebServlet;

@WebServlet("/registroCliente")
public class RegistroCliente extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");


            int id = Integer.parseInt(request.getParameter("id"));
            
            int cuenta = Integer.parseInt(request.getParameter("cuentaCliente"));
            String contrasenia = request.getParameter("contrasenia");
            String correo = request.getParameter("correo");
            int telefono = Integer.parseInt(request.getParameter("telefono"));

			Cliente newCliente = new Cliente(id, cuenta, contrasenia, telefono, correo);

			Cuenta newCuenta = new Cuenta(cuenta, contrasenia);
            
            Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);

			Statement stat = con.createStatement();

			String name=request.getParameter("nombre");
			int cuentas=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));

			String sql2 = "INSERT INTO cuenta VALUES ("+ cuenta+" ,'" +contrasenia+ "');";
            String sql = "INSERT INTO cliente values("+id+", '" + cuenta + "', '" + contrasenia + "', "  + telefono + ", '"  + correo +   "');";
			stat.executeUpdate(sql2);
			stat.executeUpdate(sql);
			System.out.println("Sí se guard el nuevo cliente");
			stat.close();
			con.close();

			request.setAttribute("response", name);
            request.setAttribute("response2", cuentas);
            request.setAttribute("response3", window);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/altaClientes.jsp");

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
