import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import escuela.Cliente;
import escuela.Cuenta;
import javax.servlet.annotation.WebServlet;

@WebServlet("/registroCliente")
public class RegistroCliente extends HttpServlet{

	// public void init(ServletConfig config){
	// 	try{
	// 		super.init(config);
	// 	}
	// 	catch(Exception e){
	// 		e.printStackTrace();
	// 	}
		
		
	// }

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{
			
			// PrintWriter writer = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
   //          PrintWriter writer2 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
   //          PrintWriter writer3 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");

   //          writer.println("The first lines");
   //          writer.println("The second line");


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
			// Cliente newCliente = new Cliente(id, telefono, correo, password);
            
            Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);

			Statement stat = con.createStatement();

			String name=request.getParameter("nombre");
			int cuentas=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));

			String sql2 = "INSERT INTO cuenta VALUES ("+ cuenta+" ,'" +contrasenia+ "');";
			//writer3.println(sql2);
            String sql = "INSERT INTO cliente values("+id+", '" + cuenta + "', '" + contrasenia + "', "  + telefono + ", '"  + correo +   "');";
            //writer2.println(sql);
			stat.executeUpdate(sql2);
			stat.executeUpdate(sql);
			System.out.println("Sí se guard el nuevo cliente");
			//writer2.close();
			//writer3.close();
			stat.close();
			con.close();
        
            
			// res.setContentType("text/html");
			// PrintWriter out = res.getWriter();

			// req.setAttribute("trabajador", newTrabajador);
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
