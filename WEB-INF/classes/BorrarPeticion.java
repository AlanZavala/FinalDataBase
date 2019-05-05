import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import escuela.Peticion;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/borrarPeticion") 
public class BorrarPeticion extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{
            // PrintWriter writer = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
            // PrintWriter writer2 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
            // PrintWriter writer3 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");

            // writer.println("The firster lines");
            // writer.println("The second line");

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
            //writer.close();
    
            Statement stat = con.createStatement();

            int id= Integer.parseInt(request.getParameter("test3"));
            int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            String nombre=request.getParameter("name");
            int window = Integer.parseInt(request.getParameter("pestana"));


            System.out.println("Entrar a deletions");
            String sql="Delete from peticion where idPeticion="+id+";";
            //writer2.println(sql);
            stat.executeUpdate(sql);

            
            
            String sql2 = "SELECT * FROM peticion;";
            //writer2.println(sql2);
            //writer2.close();

            ResultSet res = stat.executeQuery(sql2);

            

            Vector<Peticion> peticiones = new Vector<Peticion>();

            while(res.next()){

                Peticion aux = new Peticion();

                aux.setId(res.getInt("idPeticion"));
                aux.setCliente(res.getInt("idCliente"));
                aux.setNombreProyecto(res.getString("nombreProyecto"));
                aux.setFecha(res.getString("fechaTentativa"));
                aux.setDescripcion(res.getString("descripcion"));
                aux.setCantidad(res.getInt("cantidad"));
                aux.setTelefono(res.getString("telefono"));

                peticiones.add(aux);

            }

            //writer3.println("the vector size is "+productos.size());
            // writer3.println("hello "+productos.get(0).id);
            // writer3.println("hello "+productos.get(1).id);
            //writer3.close();

            stat.close();
            con.close();

            request.setAttribute("peticiones", peticiones);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/showPeticion.jsp");

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