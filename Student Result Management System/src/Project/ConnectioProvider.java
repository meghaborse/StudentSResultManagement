package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectioProvider 
{
  public static Connection getCon()
  {
	  try
	  {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","admin");
		return con;
	  }
	  catch(Exception e)
	  {
	    	  System.out.println(e);
	    	  return null;
	  }
  }
}
