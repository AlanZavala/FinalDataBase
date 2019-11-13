/*import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Vector;
import objetos.Cliente;
import objetos.Venta;

import javax.servlet.annotation.WebServlet;

@WebServlet("/NewVenta")
public class NewVenta extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{
			
			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);

			int idVenta=Integer.parseInt(request.getParameter("id"));
			int cliente = Integer.parseInt(request.getParameter("cliente"));
			String correo = request.getParameter("correo");
			int telefono = Integer.parseInt(request.getParameter("telefono"));
			String fecha = request.getParameter("datepicker");
			Float precio = Float.parseFloat(request.getParameter("precio"));
			int userTrabajador =Integer.parseInt(request.getParameter("user_trabajador"));

			Venta venta = new Venta(idVenta, fecha, precio, cliente, userTrabajador);

			Statement stat = con.createStatement();
			String sql = "INSERT INTO venta VALUES( "+idVenta+", '" + fecha + "', " + precio + ", " + cliente + ", "  + userTrabajador + ");";

			stat.executeUpdate(sql);

			String sql3 = "SELECT * FROM venta where idVenta="+idVenta+";";
            
            ResultSet res = stat.executeQuery(sql3);

            Vector<Venta> ventas = new Vector<Venta>();

            while(res.next()){
                Venta aux = new Venta();

               	aux.setId(res.getInt("idVenta"));

                aux.setFecha(res.getString("fechaDeExpedicion"));                

                aux.setPrecio(res.getFloat("precioTotal"));
                aux.setCliente(res.getInt("idCliente"));
                aux.setTrabajador(res.getInt("idTrabajador"));
                
                ventas.add(aux);
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("ventas", ventas);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showVenta.jsp");
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