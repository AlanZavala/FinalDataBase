import java.sql.*;
import java.text.SimpleDateFormat; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import escuela.Proyecto;
import escuela.Producto;
import escuela.Trabajador;
import javax.servlet.annotation.WebServlet;
import java.util.Vector;
@WebServlet("/AsignarTrabajador")
public class AsignacionTrabajador extends HttpServlet{
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
            int idTrabajador= Integer.parseInt(request.getParameter("asign"));

            int idProyecto= Integer.parseInt(request.getParameter("test4"));


            boolean checkAddWorker=false;
            boolean checkDupli=true;

            

            String checkDuplicates="select * from trabajador_proyecto;";

            ResultSet res3 = stat.executeQuery(checkDuplicates);


            while(res3.next()){
                
                if(res3.getInt("idTrabajador")==idTrabajador && res3.getInt("idProyecto")==idProyecto){
                

                    checkDupli=false;
                    break;
                }

            }

            String verifySql="Select * from trabajador";

            ResultSet res = stat.executeQuery(verifySql);

            while(res.next() && checkDupli){
                if(res.getInt("idTrabajador")==idTrabajador){
                    checkAddWorker=true;
                    break;
                }

            }

            String sql=" ";
            
            if(checkAddWorker){
                sql= "Insert into trabajador_proyecto VALUES("+idTrabajador+","+idProyecto+");";
                stat.executeUpdate(sql);
            }


            /*Vector<Integer> ids_workers = new Vector<Integer>();

            while(res.next()){
                Trabajador aux = new Trabajador();
                aux.setId(res.getInt("idTrabajador"));
                aux.setNombre(res.getString("nombre"));
                if (!ids_workers.contains(aux.getId())) {
                    ids_workers.add(aux.getId());
                }
            }

            request.setAttribute("ids_nombres", ids_workers);*/

            //String sql2 = "INSERT INTO cuenta VALUES ("+ username+" ,'" +password+ "');";
          
            //writer2.close();
            String sql3="SELECT * FROM proyecto;";

            ResultSet res2 = stat.executeQuery(sql3);

            Vector<Proyecto> proyectos = new Vector<Proyecto>();

            while(res2.next()){
                Proyecto aux = new Proyecto();
                aux.setId(res2.getInt("idProyecto"));
                aux.setNombre(res2.getString("nombre"));
                aux.setFechaInicio(res2.getString("fechaDeInicio"));
                aux.setFechaFin(res2.getString("fechaDeTermino"));
                aux.setDuracion(res2.getInt("duracion"));
                aux.setDescripcion(res2.getString("descripcion")); 
                proyectos.add(aux);
            }
            
            stat.close();
            con.close();
            
            request.setAttribute("proyectos", proyectos);
            RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showProjects.jsp");

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