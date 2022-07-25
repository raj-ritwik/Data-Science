package Travel;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException, SQLException, InvalidPackageIdException{
		// TODO Auto-generated method stub
		PackageDao P=new PackageDao();
		List<Tour> l=new ArrayList<Tour>();
		l=P.calculate();
		System.out.println("Package_id\tsource\tdestination\tnoOfDays\tbasic_fare\tpackage_cost");
		for(Tour i:l) {
			System.out.println(i.getPackage_id()+"\t\t"+i.getSource()+"\t"+i.getDestination()+"\t\t"+i.getBasic_fare()+"\t\t"+i.getNoOfDays()+"\t\t"+i.getPackage_cost());
		}

	}

}
