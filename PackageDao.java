package Travel;

import java.io.*;
import java.util.*;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class PackageDao {
	public List<Tour> generatePackageCost(String filepath) throws InvalidPackageIdException, SQLException{
		List<Tour> p=new ArrayList<Tour>();
		Connection conn=null;
		conn=DBHandler.getConnection();
		ArrayList ob=new ArrayList();
		File f=null;
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(filepath);
			br=new BufferedReader(fr);
			String s=null;
			String sp[];
			while((s=br.readLine()) !=null) {
				ob.add(s);
			}
			Iterator itr=ob.iterator();
			while(itr.hasNext()) {
				String []st=itr.next().toString().split(",");
				double package_cost=0;
				double discount=0;
				if(validate(st[0])) {
					Tour tr=new Tour();
					tr.setPackage_id(st[0]);
					tr.setSource(st[1]);
					tr.setDestination(st[2]);
					tr.setBasic_fare(Integer.parseInt(st[3]));
					tr.setNoOfDays(Integer.parseInt(st[4]));
					tr.setPackage_cost(tr.getPackage_cost());
					p.add(tr);
					String query="insert into tour(package_id,source,destination,basic_fare,noOfDays,package_cost) values(?,?,?,?,?,?)";
					PreparedStatement prep = conn.prepareStatement(query);
					prep.setString(1, tr.getPackage_id());
					prep.setString(2, tr.getSource());
					prep.setString(3, tr.getDestination());
					prep.setInt(4, tr.getNoOfDays());
					prep.setInt(5, (int)tr.getBasic_fare());
					prep.setInt(6, (int)tr.getPackage_cost());
					prep.executeUpdate();
					
					
					
					
				}
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public boolean validate(String packageId) throws InvalidPackageIdException{
		if(packageId.matches("[0-9a-zA-Z]{3}[/]{1}[0-9a-zA-Z]{3}$")) {
			return true;
		}
		else {
			throw new InvalidPackageIdException("Invalid Package Id");
		}
	}
	public List<Tour> calculate(){
		List<Tour>l=new ArrayList<Tour>();
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		try (Connection conn=new DBHandler().getConnection();){
			preparedStatement=conn.prepareStatement("select * from tour");
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Tour td =new Tour();
				td.setPackage_id(resultSet.getString(1));
				td.setSource(resultSet.getString(2));
				td.setDestination(resultSet.getString(3));
				td.setBasic_fare(resultSet.getDouble(5));
				td.setNoOfDays(resultSet.getInt(4));
				td.setPackage_cost(resultSet.getDouble(5));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
