import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import objetos.Cuenta;
import objetos.Paciente;
import java.util.Vector;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ShowPacientes")
public class ShowPacientes extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){

		try{

			String base = getServletContext().getInitParameter("base");
			String usuario = getServletContext().getInitParameter("usuario");
			String password = getServletContext().getInitParameter("pass");


			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
		
			System.out.println(url);
			Connection con = DriverManager.getConnection(url,usuario,password);

			Statement stat = con.createStatement();
			
			String nombre=request.getParameter("nombre");
			int cuenta=Integer.parseInt(request.getParameter("cuenta"));
            
            int window= Integer.parseInt(request.getParameter("pestana"));
			
			String sql2 = "SELECT * FROM paciente;";

			ResultSet res = stat.executeQuery(sql2);

			Vector<Paciente> pacientes = new Vector<Paciente>();

            while(res.next()){
                Paciente aux = new Paciente();
                aux.setId(res.getInt("ID"));
                aux.setCuenta(res.getInt("cuenta"));
                aux.setNombre(res.getString("nombre"));
                aux.setApellido(res.getString("apellido"));   
                aux.setIdRutina(res.getInt("idRutina"));
                aux.setEdad(res.getString("edad"));
                aux.setTipoU(res.getString("tipo_u"));   
                aux.setGenero(res.getString("genero"));            
                pacientes.add(aux);
            }

			stat.close();
            con.close();

			request.setAttribute("pacientes", pacientes);
			request.setAttribute("response", nombre);
            request.setAttribute("response2", cuenta);
            request.setAttribute("response3", window);

			RequestDispatcher disp = getServletContext().getRequestDispatcher("/showPacientes.jsp");

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

}