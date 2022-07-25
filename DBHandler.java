package Travel;

import java.io.*;
import java.sql.*;
import java.util.*;


public class DBHandler {
	
	public static Connection getConnection() {
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/trip?useSSL=false";
			String id="root";
			String password="Shree@007";
			
			conn=DriverManager.getConnection(url,id,password);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
			
		}
		
	}



