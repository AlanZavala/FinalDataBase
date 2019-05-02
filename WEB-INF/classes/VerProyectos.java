import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import escuela.Producto;
import escuela.Proyecto;

import java.util.Vector; 

import javax.servlet.annotation.WebServlet;

@WebServlet("/VerProyectos")
public class VerProyectos extends HttpServlet{

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
			String sql2="";
			
			int workerID=Integer.parseInt(request.getParameter("test4"));

			//select idTrabajador where cuenta=cuenta;

			//sql2 = "select * from proyecto where idProyecto=(select idProyecto from trabajador_proyecto where idTrabajador=(select idTrabajador from trabajador where cuenta="+cuenta+"));";
			sql2 = "select idProyecto from trabajador_proyecto where idTrabajador="+workerID+";";

			String sql3= "select * from proyecto";
			//writer2.println(sql2);
			//writer2.close();

			ResultSet res2 = stat.executeQuery(sql2);

			Vector<Integer> idProyectos = new Vector<Integer>();

			while(res2.next()){
				idProyectos.add(res2.getInt("idProyecto"));
				//writer3.println(res2.getInt("idProyecto"));
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
		                //writer3.println(res.getString("fechaDeTermino"));
		                aux.setDuracion(res.getInt("duracion"));
		                aux.setDescripcion(res.getString("descripcion")); 
		                proyectos.add(aux);
	            	}
            	
            }
            //writer3.println("después del while");
          
            //writer3.close();

			stat.close();
            con.close();

			request.setAttribute("proyectos", proyectos);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showProjOfWorker.jsp");

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