import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DecimalFormat;


public class ServletMurung extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//declaration
		double price=0.00, totalPerDay=0.00,total=0.00, totalAfterDiscount=0.00;
		//format decimal
		DecimalFormat df = new DecimalFormat("0.00");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>HEAD(BOLD)</h1>");
		
		out.print("Name: "+request.getParameter("name")+"<br>");
		out.print("Phone number: "+request.getParameter("phone")+"<br>");
		out.print("Email: "+request.getParameter("email")+"<br>");
		out.print("Address: "+request.getParameter("address")+"<br>");
		out.print("Baby/Toddler's Gender: "+request.getParameter("gender")+"<br>");
		out.print("Service Duration(Hours): "+request.getParameter("duration")+"<br>");
		out.print("Day of Week: "+request.getParameter("day")+"<br>");
		out.print("Number of Day(s): "+request.getParameter("number")+"<br>");
		
		double duration = Double.parseDouble(request.getParameter("duration"));
		double NoOfDay = Double.parseDouble(request.getParameter("number"));
		
		if(request.getParameter("day").equalsIgnoreCase("weekday")) {
			if(duration>=2 && duration<=4) {
				price = duration*22;
			}
			else if(duration>=5 && duration<=8) {
				price = duration*20; 
			}
			else if(duration>=9 && duration <=12) {
				price = duration*18;
			}
		}
		else if(request.getParameter("day").equalsIgnoreCase("weekend")) {
			if(duration>=2 && duration<=4) {
				price = duration*32;
			}
			else if(duration>=5 && duration<=8) {
				price = duration*30; 
			}
			else if(duration>=9 && duration <=12) {
				price = duration*28;
			}
		}	
		totalPerDay = price;
		total = price*NoOfDay;
		out.print("Total Per Day:RM "+df.format(totalPerDay)+"<br>");
		out.print("Total:RM "+df.format(total)+"<br>");
		
		if(NoOfDay>=2) {
			totalAfterDiscount = 0.9*total;
			out.print("Total after Discount:RM "+df.format(totalAfterDiscount)+"<br>");
		}
	}
}
