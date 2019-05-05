  import java.sql.*; 
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import escuela.Proyecto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/RegistroProyecto")
public class RegistroProyecto extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){ 

		try{
            // PrintWriter writer = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
            // PrintWriter writer2 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
            // PrintWriter writer3 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");

            // writer.println("The first lines");
            // writer.println("The second line");

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
            //writer.close();
    
            Statement stat = con.createStatement();

            

            int id= Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");           
            String fechaInicio = request.getParameter("fechaInicio");  
            String fechaFin = request.getParameter("fechaFin");

            int duracion = Integer.parseInt(request.getParameter("duracion")) ;                        
            String descripcion = request.getParameter("descripcion");
            int idCliente = Integer.parseInt(request.getParameter("idCliente")) ;  
            int cantidad = Integer.parseInt(request.getParameter("cantidad")) ;  
            float precioTotal = Float.parseFloat(request.getParameter("precioTotal")) ;                   
            
            Proyecto newProyecto = new Proyecto(id, nombre, fechaInicio, fechaFin, duracion, descripcion, idCliente, cantidad, precioTotal);

            
            
            String sql = "INSERT INTO proyecto values("+id+",'"+nombre+"','" + fechaInicio + "', '"  + fechaFin + "', " + duracion + ", '"  + descripcion + "',"+idCliente+","+cantidad+","+precioTotal+");";
                
            stat.executeUpdate(sql);
            //writer2.println(sql);
            System.out.println("se agrego el nuevo proyecto");

            String sql2 = "SELECT * FROM proyecto where idProyecto="+id+";";

            //writer2.println(sql2);
            //writer2.close();


            ResultSet res = stat.executeQuery(sql2);

            Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res.next()){
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
            
            stat.close();
            con.close();
            
            request.setAttribute("proyectos", proyectos);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/proyectoRegistrado.jsp");

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
