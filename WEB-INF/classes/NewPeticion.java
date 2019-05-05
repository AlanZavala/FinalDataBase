import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
// import escuela.Producto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;

@WebServlet("/NewPeticion")
public class NewPeticion extends HttpServlet{
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

            String name=request.getParameter("name");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            int window=Integer.parseInt(request.getParameter("pestana"));
            
            int id = Integer.parseInt(request.getParameter("id"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            String nombreProyecto  = request.getParameter("nombre");
            String fechaTentativa = request.getParameter("fechaTentativa") ;
            String descripcion = request.getParameter("descripcion");
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            String telefono = request.getParameter("telefono");



            String sql = "INSERT INTO peticion values(" + id + ", " + idCliente + ", " + nombreProyecto + ", " + fechaTentativa + ", " + descripcion + ", " + cantidad + ", " + telefono + ");";
            ResultSet res = stat.executeQuery(sql);
            // stat.executeUpdate(sql);

              
            
            // Producto newProduct = new Producto(id, nombre, uso, fechaLlegada, fechaVenta, precioProveedor, precioCliente, proveedor, tabla, ganancia);

            //writer2.println(sql2);
            //writer2.close();


            
            Vector<Peticion> peticiones = new Vector<Peticion>();

            while(res.next()){
                Peticion aux = new Peticion();
                // aux.setId(res.getInt("idProducto"));
                // productos.add(aux);
                aux.setId(res.getInt("idPeticion"));
                aux.setCliente(res.getInt("idCliente"));
                aux.setNombreProyecto(res.getString("nombreProyecto"));
                aux.setFecha(res.getString("fechaTentativa"));
                aux.setDescripcion(res.getString("descripcion"));
                aux.setCantidad(res.getInt("cantidad"));
                aux.setTelefono(res.getString("telefono"));
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("peticiones",peticiones);
            request.setAttribute("response", name);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showPeticion.jsp");

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
