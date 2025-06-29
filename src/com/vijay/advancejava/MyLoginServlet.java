package com.vijay.advancejava;

/**
@WebServlet("/login")
public class MyLoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");

		boolean isValid = LoginDAO.validate(uname, pwd);

		if (isValid) {
			resp.sendRedirect("success.jsp");
		} else {
			resp.sendRedirect("error.jsp");
		}
	}
}
*/

// ✅ HttpServlet in Advanced Java
// HttpServlet is a class in the Servlet API used to handle HTTP-specific requests in web applications

