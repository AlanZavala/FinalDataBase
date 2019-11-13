// import java.sql.*;
// import java.text.SimpleDateFormat;
// import java.io.*;
// import javax.servlet.*;
// import javax.servlet.http.*;
// import java.util.Date;
// import objetos.Colaborador;
// import javax.servlet.annotation.WebServlet;
// import java.util.Vector;
// @WebServlet("/BuscarColab") 
// public class BuscarColab extends HttpServlet{
// 	public void doPost(HttpServletRequest request, HttpServletResponse response){

// 		try{

//             String base = getServletContext().getInitParameter("base");
//             String usuario = getServletContext().getInitParameter("usuario");
//             String pass = getServletContext().getInitParameter("pass");
                
//             Class.forName("com.mysql.jdbc.Driver");
//             String url = "jdbc:mysql://localhost/"+base+"?useSSL=false&allowPublicKeyRetrieval=true";
//             Connection con = DriverManager.getConnection(url,usuario,pass);
    
//             Statement stat = con.createStatement();
//             int cuenta=Integer.parseInt(request.getParameter("cuenta"));
//             String nombre=request.getParameter("name");
            
//             String comboBChoice=request.getParameter("optBusq");
//             String busqueda = request.getParameter("valueBusca");
//             String sql=" ";
            
//             if(comboBChoice.equals("Id")){
//                 int id=Integer.parseInt(busqueda);
//                 sql= "SELECT * FROM colaborador where ID="+id+";";
//             }
//             else if(comboBChoice.equals("Nombre")){
//                 sql= "SELECT * FROM colaborador where nombre='"+busqueda+"';";
//             }
            
//             else if(comboBChoice.equals("All")){
//                 sql= "SELECT * FROM colaborador;";
//             }


//             ResultSet res = stat.executeQuery(sql);

//             Vector<Colaborador> colaboradores = new Vector<Colaborador>();

//             while(res.next()){
//                 Colaborador aux = new Colaborador();
//                 aux.setId(res.getInt("ID"));
//                 aux.setCuenta(res.getString("cuenta"));
//                 aux.setNombre(res.getString("nombre"));
//                 aux.setApellido(res.getString("apellido"));
//                 aux.setEdad(res.getInt("edad"));
//                 aux.setGenero(res.getString("genero")); 
//                 colaboradores.add(aux);
//             }
            
//             stat.close();
//             con.close();
            
//             request.setAttribute("colaboradores", colaboradores);
//             request.setAttribute("response", nombre);
//             request.setAttribute("response2", cuenta);
//             RequestDispatcher disp =  getServletContext().getRequestDispatcher("/showColabBuscado.jsp");

//             if(disp!=null){
//                 disp.forward(request,response);
//             }
// 		}
// 		catch(Exception e){
// 			try{
//                 e.printStackTrace();
//             }
//             catch(Exception e2){
//                 try{
//                 e.printStackTrace();
//             }
//             catch(Exception e3){
//                 e3.printStackTrace();
//             }   
//             }   
          
// 		}

// 	}	

// }