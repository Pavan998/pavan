package com.vehicle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;

public class FlightEnquiry {
	DataSource myDataSource = null;
	
	public DataSource getMyDataSource() {
		return myDataSource;
	}
	
	public void setMyDataSource(DataSource myDataSource) {
		this.myDataSource = myDataSource;
	}

	public Set<Flight> getAvailableFlights(String src,String dest) {
		
		Set<Flight> myFlightSet = new HashSet<Flight>();
		try {
			Connection conn = myDataSource.getConnection();
			System.out.println("Connected....");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Flights where Source ="+"'"+src+"'"+" and destination ="+"'"+dest+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println("------------------");
			}
			
			System.out.println("Closing..rs,st,conn");
			rs.close();
			st.close();
			conn.close();
			System.out.println("rs,st,conn Closed....");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return myFlightSet;
				
	}
	
}
