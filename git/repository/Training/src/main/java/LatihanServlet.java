
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LatihanServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("First Name : " + request.getParameter("name") + "<br>");
		out.print("Last Name : " + request.getParameter("lastname") + "<br>");
		out.print("Gender : " +request.getParameter("gender")+"<br>");
		out.print("Kereta :" +request.getParameter("cars")+"<br>");
		out.print("The message: "+request.getParameter("message")+"<br>");
		out.print("Password: "+request.getParameter("psw")+"<br>");
		out.print("CheckBox: "+request.getParameter("vehicleCB")+"<br>");
		out.print("Birthday: "+request.getParameter("bday")+"<br>");
	}

}
