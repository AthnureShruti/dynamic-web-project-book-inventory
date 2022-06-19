package UserInput;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LibraryBookDao.LibraryBookDao;
import com.LibraryBookDto.LibraryBookDto;
import com.LibraryBookLogic.LibraryBookLogic;


@WebServlet("/BookMain")
public class BookMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int borrow_no=Integer.parseInt(request.getParameter("borrow_no"));
			String name=request.getParameter("book_name");
			String author=request.getParameter("book_author");
			String category=request.getParameter("category");
			
			
			LibraryBookDto dto=new LibraryBookDto();
			
			dto.setName(name);
			dto.setAuthor(author);
			dto.setCategory(category);
			dto.setIssue_date(new Date());
			dto.setBorrow_no(borrow_no);
			LibraryBookDao dao=new LibraryBookLogic().insertData(dto);
			
			System.out.println("Book Name : "+dao.getName());
			System.out.println("Book Author : "+dao.getAuthor());
			System.out.println("Book Category : "+dao.getCategory());
			System.out.println("Book Borrow No : "+dao.getBorrow_no());
			System.out.println("Book Issued On : "+dao.getIssue_date());
			System.out.println("Book Return Date : "+dao.getReturn_date());
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shruti");
			Statement stmt=con.createStatement();
			/*ResultSet rs=stmt.executeQuery("select * from stud");
			while(rs.next())
				
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
			*/
			
			//Executing a SQL INSERT query using executeUpdate()  method of Statement object.
			int count = stmt.executeUpdate("insert into library_book values("+dao.getBorrow_no()+
					",'"+dao.getName()+
					"','"+dao.getAuthor()+
					"','"+dao.getCategory()+
					"','" +dao.getIssue_date()+
					"','"+dao.getReturn_date()+
					"')");
			System.out.println("Number of rows updated in database =  " + count);
			con.close();

			}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		
		
		
	}
	

	
}
