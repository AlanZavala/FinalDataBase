/*import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import objetos.Producto;
import objetos.Proyecto;
import objetos.Trabajador;

import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowProjects")
public class ShowPjtQuery extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");


			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);
			String name=request.getParameter("nombre");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
			int pestana= Integer.parseInt(request.getParameter("pestana"));

			Statement stat = con.createStatement();
			String sql;
			
			String sql2 = "SELECT * FROM proyecto;";

			ResultSet res = stat.executeQuery(sql2);

			Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res.next()){
                Proyecto aux = new Proyecto();
                aux.setId(res.getInt("idProyecto"));
                aux.setNombre(res.getString("nombre"));
                aux.setFechaInicio(res.getString("fechaDeInicio"));
                aux.setFechaFin(res.getString("fechaDeTermino"));
                //writer3.println(res.getString("fechaDeTermino"));
                aux.setDuracion(res.getInt("duracion"));
                aux.setDescripcion(res.getString("descripcion")); 
                aux.setCuenta(res.getInt("idCliente"));
                aux.setCantidad(res.getInt("cantidad"));
                aux.setPrecioTotal(res.getFloat("precioTotal"));
                proyectos.add(aux);
            }

            String verifySql="Select * from trabajador";

            ResultSet res2 = stat.executeQuery(verifySql);

            Vector<Trabajador> ids_workers = new Vector<Trabajador>();

            while(res2.next()){
                Trabajador aux2 = new Trabajador();
                aux2.setId(res2.getInt("idTrabajador"));
                aux2.setNombre(res2.getString("nombre"));
                ids_workers.add(aux2);
            }

			stat.close();
            con.close();

            request.setAttribute("ids_nombres", ids_workers);

			request.setAttribute("proyectos", proyectos);
			request.setAttribute("response", name);
			request.setAttribute("response2", cuenta);
			

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showProjects.jsp");

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