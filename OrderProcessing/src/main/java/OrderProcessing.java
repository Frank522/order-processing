

import java.io.IOException;
import java.util.Collection;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class OrderProcessing
 */
@WebServlet("/Order")
public class OrderProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Order order;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderProcessing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//retrieve shipping and payment information
		
		
		Jsonb jsonb = JsonbBuilder.create();        
		//Order submittedOrder = jsonb.fromJson(jsonOrder, Order.class);
	}

}
