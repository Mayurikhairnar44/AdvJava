

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkansservlet")
public class checkansservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public checkansservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();

		String que1 = request.getParameter("que1");
		String que2 = request.getParameter("que2");
		String que3 = request.getParameter("que3");
		int score=0;
		
		request.setAttribute("question1", que1);
		request.setAttribute("question2", que2);
		request.setAttribute("question3", que3);

//		if (que1.equals("A way to store and organize data") && que2.equals("Stack") && que2.equals("Stack")) {
////			response.sendRedirect("success.jsp");
//			
//			score++;
//			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
//			rd.forward(request, response);
//			
//		} else {
////			response.sendRedirect("error.jsp");
//			
//			score--;
//			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
//			rd.forward(request, response);
//		}
//		
//		request.setAttribute("scored", score);
		
		if(que1.equals("A way to store and organize data"))
		{
			score=score+1;
		}
		if(que2.equals("Stack"))
		{
			score=score+1;
		}
		if(que3.equals("Stack"))
		{
			score=score+1;
		}
		
		request.setAttribute("scored", score);
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
