
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Myservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out=response.getWriter();
//		out.println("This is the doGet method");
//		out.println("This is myservlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out = response.getWriter();
//		out.println("This is the doPost method");
//		out.println("This is myservlet");

		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
//		request.setAttribute("name1", username);
//		request.setAttribute("passvalue", password);

//		out.println("Name is:"+username);
//		out.println("Password is:"+password);

		
//		if (username.equals("Mayuri") && password.equals("Mayuri@44")) {
////			response.sendRedirect("success.jsp");
//			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
//			rd.forward(request, response);
//		} else {
////			response.sendRedirect("error.jsp");
//			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
//			rd.forward(request, response);
//		}
		
		boolean isValid=false;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnt", "root","password");
			
			String str = "select * from userTable where user=? and password=?";
			PreparedStatement ps = con.prepareStatement(str);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			isValid=rs.next();
			if(isValid==true)
			{
				out.println("successfully loggin....");
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
				//response.sendRedirect("success.jsp");
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
				//response.sendRedirect("error.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
