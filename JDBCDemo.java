package practiceProject;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url= "jdbc:MySql://localhost:3306/employes";
		String uname = "root";
		String pass = "root123";
		int usn = 006;
		String name = "sirisa";
		
				
//		String querry = "insert into employes.Student values(" + usn+",'"+name+"')";
		String querry = "insert into employes.Student values(? , ?)";
//		String querry = "select * from Student";
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, uname, pass);
//	Statement st = con.createStatement();
	PreparedStatement st = con.prepareStatement(querry);
	st.setInt(1, usn);
	st.setString(2, name);
//	ResultSet rs = st.executeQuery(querry);
	int count = st.executeUpdate();
	 
/*	while(rs.next()) {
	int usn=rs.getInt(1);
	String name = rs.getString(2);
	System.out.println(usn+","+name);
	}
	*/	
	
	System.out.println(count+" rows affected");
	st.close();
	con.close();
	}

}
