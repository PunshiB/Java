import javax.servlet.*;
import java.io.*;

public class DateServ extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
        
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        java.util.Date date = new java.util.Date();
        
        pw.println("<h2>>"+"Current Date and Time: "+date.toString()+"</h2>");
        pw.close();
    }
}
