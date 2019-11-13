/*import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import objetos.Venta;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;

@WebServlet("/RecentVentas")
public class RecentVentas extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

            String base = getServletContext().getInitParameter("base");
            String usuario = getServletContext().getInitParameter("usuario");
            String pass = getServletContext().getInitParameter("pass");
                
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
            Connection con = DriverManager.getConnection(url,usuario,pass);
            Statement stat = con.createStatement();

            String name=request.getParameter("name");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            int window=Integer.parseInt(request.getParameter("pestana"));

            String sql= "SELECT ID from cliente where cuenta = " + cuenta + ";";
            ResultSet res2 = stat.executeQuery(sql);


            Vector<Integer> idClientes = new Vector<Integer>();

            while(res2.next()){
                idClientes.add(res2.getInt("ID"));;
            }

            String sql2 = "SELECT * from venta";
            ResultSet res = stat.executeQuery(sql2);

            Vector<Venta> ventasRec = new Vector<Venta>();

            while(res.next()){
                if(idClientes.contains(res.getInt("idCliente"))){
                    Venta aux = new Venta();
                    aux.setId(res.getInt("idVenta"));
                    aux.setFecha(res.getString("fechaDeExpedicion"));
                    aux.setPrecio(res.getFloat("precioTotal"));
                    aux.setCliente(res.getInt("idCliente"));
                    aux.setTrabajador(res.getInt("idTrabajador")); 
                    ventasRec.add(aux);  
                }             
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("ventasRec",ventasRec);
            request.setAttribute("response", name);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showRecVentas.jsp");

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
