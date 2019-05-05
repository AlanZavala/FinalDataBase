import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import escuela.Producto;
import escuela.Proyecto;

import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/Session")
public class Session extends HttpServlet{

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
			String nombre=request.getParameter("name");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
			int window=Integer.parseInt(request.getParameter("pestana"));

			Statement stat = con.createStatement();
			
			/*
			Esto es para proyecto venta
			*/
			String sql4 = "select * from cliente;";			
			ResultSet res2 = stat.executeQuery(sql4);

			Vector<Cliente> clientes = new Vector<Cliente>();

			while(res2.next()){
				Cliente aux2 = new Cliente();
				aux2.setId(res2.getInt("ID"));
				aux2.setCuenta(res2.getInt("cuenta"));				
				clientes.add(aux2);
			}

			String sql5 = "select * from trabajador;";			
			ResultSet res3 = stat.executeQuery(sql5);

			Vector<Trabajador> trabajadores = new Vector<Trabajador>();

			while(res3.next()){
				if(    res3.getInt(res3.getInt("cuenta")) == cuenta  ){
					Trabajador aux3 = new Trabajador();
					aux3.setId(res3.getInt("idTrabajador"));
					aux3.setNombre(res3.getString("nombre"));
					aux3.setCuenta(res3.getInt("cuenta"));
					trabajadores.add(aux3);
					break;
				}				
			}
			/*
			Fin del proyecto venta
			*/


            //writer3.close();

			stat.close();
            con.close();

		
			request.setAttribute("response", nombre);
			request.setAttribute("response2", cuenta);
			request.setAttribute("response3", window);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showVenta.jsp");

			if(window==1){
				disp = getServletContext().getRequestDispatcher("/adminPass.jsp");


			}
			else if(window==2){
				disp = getServletContext().getRequestDispatcher("/pass.jsp");
			}
			else if(window==3){
				window=1;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/altaTrabajadores.jsp");
			}
			else if(window==4){
				window=1;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/RegistroProducto.jsp");

			}
			else if(window==5){
				window=2;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/RegistroProducto.jsp");
			} else if(window == 6){
				window=1;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/altaClientes.jsp");
			}
			else if(window == 7){
				window=1;
				request.setAttribute("response3", window);
				request.setAttribute("clientes", clientes);
            	request.setAttribute("trabajadores", trabajadores);
				disp = getServletContext().getRequestDispatcher("/ProyectoVenta.jsp");
			}
			else if(window==8){
				window=2;
				request.setAttribute("response3", window);
				request.setAttribute("clientes", clientes);
            	request.setAttribute("trabajadores", trabajadores);
				disp = getServletContext().getRequestDispatcher("/ProyectoVenta.jsp");
			}
			else if(window==9){
				window=10;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/peticion.jsp");
			}
			else if(window==10){
				disp = getServletContext().getRequestDispatcher("/clientPass.jsp");

			} else if (window == 11) {
				window=1;
				request.setAttribute("response3", window);
				disp = getServletContext().getRequestDispatcher("/showProjects.jsp");
			}

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