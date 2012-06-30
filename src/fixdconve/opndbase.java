package fixdconve;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class opndbase
{

	// private Connection sqlConnection;

	public static void testDriver() throws Exception
	{
		System.out.println("Initializing Server... ");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Found.");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(" Driver Not Found, exiting..");
			throw (e);
		}
	}

	public Connection getDBConnection(String host, String userDB,
			String passDB, String database) throws Exception
	{
		String url = "";
		try
		{
			url = "jdbc:mysql://" + host + "/" + database;

			Connection con = DriverManager.getConnection(url, userDB, passDB);
			System.out.println(" Database connection established to " + url
					+ ".");

			return con;
		}
		catch (SQLException e)
		{
			System.out.println(" Connection couldn't be established to " + url);
			throw (e);
		}
	}

	public static void testDriver2() throws Exception
	{
		Connection connection = null;
		try
		{
			// Instantiate the appropriate JDBC driver
			final String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);

			// Connection parameters
			final String databaseHost = "172.16.3.98";
			final String portNumber = "3306"; // Port Number
			final String sid = "accessdb";
			final String url = "jdbc:mysql://" + databaseHost + ":"
					+ portNumber + "/" + sid;
			final String username = "rsdev";
			final String password = "rsdev";
			connection = DriverManager.getConnection(url, username, password);

			CallableStatement proc = connection
					.prepareCall("{call myproc(?, ?, ?)}");
			proc.setString(1, "value1");
			proc.setString(2, "value2");
			proc.setString(3, "value3");
			proc.execute();
		}
		catch (ClassNotFoundException e)
		{
			System.err
					.println("Unable to load the driver class, check your classpath.");
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// Database problem.
			System.err.println("Database problem.");
			e.printStackTrace();
		}
	}
}
