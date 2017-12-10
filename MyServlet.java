import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>Welcome to my first servlet</h1>");
	}
}
	
