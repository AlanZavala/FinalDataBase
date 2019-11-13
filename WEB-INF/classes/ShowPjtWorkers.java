/*import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import objetos.Producto;
import objetos.Proyecto;

import java.util.Vector; 

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowToWorkers")
public class ShowPjtWorkers extends HttpServlet{

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
			String sql2="";
			
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
			String nombre=request.getParameter("nombre");

			sql2 = "select idProyecto from trabajador_proyecto where idTrabajador=(select idTrabajador from trabajador where cuenta="+cuenta+");";

			String sql3= "select * from proyecto";

			ResultSet res2 = stat.executeQuery(sql2);

			Vector<Integer> idProyectos = new Vector<Integer>();

			while(res2.next()){
				idProyectos.add(res2.getInt("idProyecto"));
			}

			ResultSet res = stat.executeQuery(sql3);
						
			Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res.next()){
            	
            		if(idProyectos.contains(res.getInt("idProyecto"))){
		                Proyecto aux = new Proyecto();
		                aux.setId(res.getInt("idProyecto"));
		                aux.setNombre(res.getString("nombre"));
		                aux.setFechaInicio(res.getString("fechaDeInicio"));
		                aux.setFechaFin(res.getString("fechaDeTermino"));
		                aux.setDuracion(res.getInt("duracion"));
		                aux.setDescripcion(res.getString("descripcion")); 
		                aux.setCuenta(res.getInt("idCliente"));
                		aux.setCantidad(res.getInt("cantidad"));
                		aux.setPrecioTotal(res.getFloat("precioTotal"));
		                proyectos.add(aux);
	            	}
            	
            }

			stat.close();
            con.close();

			request.setAttribute("proyectos", proyectos);
			request.setAttribute("response", nombre);
			request.setAttribute("response2", cuenta);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showProjectsToWorkers.jsp");

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