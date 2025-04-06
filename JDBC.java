import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Providing the information for connections
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="chakku348";
		
		//establish the connections
		Connection myConnection = DriverManager.getConnection(url, username, password);
		System.out.println("Datebase connection is done");
		
		//Query for the Database
		String createDBQuery = "create database jdbc_employee";
		String useDBQuery= "use jdbc_employee";
		String createTable= "create table employee_details(empcode int,empname varchar(25),empage int,esalary int)";
		String insertValues= "insert into employee_details(empcode,empname,empage,esalary) values (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,40000),(105,'Shameer',25,90000)";
		String SelectQuery = "select * from employee_details";
		
		//Execute the query's
		Statement statement = myConnection.createStatement();
		statement.execute(createDBQuery);
		statement.execute(useDBQuery);
		statement.execute(createTable);
		statement.executeUpdate(insertValues);
		ResultSet tableResultSet = statement.executeQuery(SelectQuery);
		
		
		while (tableResultSet.next()) {
			System.out.println(tableResultSet.getInt("empcode")+"||"+tableResultSet.getString("empname")+"||"+tableResultSet.getInt("empage")+"||"+tableResultSet.getInt("esalary"));
			
		}
		
		//close the connection
		myConnection.close();
		
		
		
	}

}
