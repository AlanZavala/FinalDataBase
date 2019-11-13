/*import java.sql.*;
import java.text.SimpleDateFormat; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Producto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/buscarProducto")
public class BuscarProducto extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();

            int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            String nombre=request.getParameter("name");
            int window= Integer.parseInt(request.getParameter("pestana"));

            String comboBChoice=request.getParameter("optBusq");
            String busqueda = request.getParameter("valueBusca");
            String sql=" ";
            
            if(comboBChoice.equals("Id")){
                int id=Integer.parseInt(busqueda);
                sql= "SELECT * FROM producto where idProducto="+id+";";
            }
            else if(comboBChoice.equals("Nombre")){
                sql= "SELECT * FROM producto where nombre='"+busqueda+"';";
            }
            else if(comboBChoice.equals("Proveedor")){
                sql= "SELECT * FROM producto where proveedor='"+busqueda+"';";
            }
            else if(comboBChoice.equals("All")){
                sql= "SELECT * FROM producto;";
            }


            ResultSet res = stat.executeQuery(sql);

            Vector<Producto> productos = new Vector<Producto>();

            while(res.next()){
                Producto aux = new Producto();
                 aux.setId(res.getInt("idProducto"));
                aux.setNombre(res.getString("nombre"));
                aux.setUso(res.getString("Uso"));
                aux.setFechaLlegada(res.getString("fechaDeLlegada"));
                aux.setFechaVenta(res.getString("fechaDeVenta"));
                aux.setPrecioProveedor(res.getFloat("precioProveedor"));
                aux.setPrecioCliente(res.getFloat("precioCliente"));
                aux.setProveedor(res.getString("proveedor"));
                aux.setTabla(res.getInt("tabla"));
                aux.setGanancia(res.getFloat("ganancia"));
                productos.add(aux);
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("productos",productos);
            request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showProducts.jsp");

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