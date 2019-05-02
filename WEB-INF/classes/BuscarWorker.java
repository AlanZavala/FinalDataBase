import java.sql.*;
import java.text.SimpleDateFormat; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import escuela.Trabajador;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/buscarWorker")
public class BuscarWorker extends HttpServlet{
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

            String comboBChoice=request.getParameter("optBusq");
            String busqueda = request.getParameter("valueBusca");
            String sql=" ";
            
            if(comboBChoice.equals("Id")){
                int id=Integer.parseInt(busqueda);
                sql= "SELECT * FROM trabajador where idTrabajador="+id+";";
            }
            else if(comboBChoice.equals("Nombre")){
                sql= "SELECT * FROM trabajador where nombre='"+busqueda+"';";
            }
            else if(comboBChoice.equals("All")){
                sql= "SELECT * FROM trabajador;";
            }

            //writer2.println(comboBChoice);
          
            //writer2.close();


            ResultSet res = stat.executeQuery(sql);

            Vector<Trabajador> trabajadores = new Vector<Trabajador>();

            while(res.next()){
                Trabajador aux = new Trabajador();
                aux.setId(res.getInt("idTrabajador"));
                aux.setNombre(res.getString("nombre"));
                aux.setApellido(res.getString("apellido"));
                aux.setCuenta(res.getInt("cuenta"));
                aux.setEdad(res.getInt("edad"));
                aux.setCorreo(res.getString("correo"));
                aux.setTelefono(res.getInt("telefono"));
                aux.setDireccion(res.getString("direccion"));
                aux.setPuesto(res.getString("puesto"));
                aux.setContrasenia(res.getString("contrasenia"));
                trabajadores.add(aux);
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("trabajadores", trabajadores);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showWorkers.jsp");

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
                PrintWriter writer5 = new PrintWriter("/Users/alanzavala/Desktop/DBCurso/proyecto1.txt", "UTF-8");
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