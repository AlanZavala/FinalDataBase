/*import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import objetos.Producto;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/RegistroProducto")
public class RegistroProducto extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
    
            Statement stat = con.createStatement();

            String name=request.getParameter("nombre");
            int cuentas=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));


            int id= Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombres");
            String uso = request.getParameter("uso");            
            String fechaLlegada = request.getParameter("fecha");  
            String fechaVenta = request.getParameter("fechaVenta");

            float precioProveedor = Float.parseFloat(request.getParameter("Pproveedor")) ;            
            float precioCliente = Float.parseFloat(request.getParameter("cliente"));            
            String proveedor = request.getParameter("proveedor");                      
            int tabla = Integer.parseInt(request.getParameter("tabla"));            
            float ganancia = Float.parseFloat(request.getParameter("ganancia"));      
            
            Producto newProduct = new Producto(id, nombre, uso, fechaLlegada, fechaVenta, precioProveedor, precioCliente, proveedor, tabla, ganancia);

            
            
            String sql = "INSERT INTO producto values("+id+",'"+nombre+"','" + uso + "', '"  + fechaLlegada + "', '"  + fechaVenta + "', " + precioProveedor + ", "  + precioCliente + ", '"   + proveedor + "', "   + tabla + ","  + ganancia + ");";
                
            stat.executeUpdate(sql);
            System.out.println("se agrego el nuevo producto");

            String sql2 = "SELECT * FROM producto where idProducto="+id+";";

            ResultSet res = stat.executeQuery(sql2);

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
            request.setAttribute("response", name);
            request.setAttribute("response2", cuentas);
            request.setAttribute("response3", window);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/productoRegistrado.jsp");

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

}
*/