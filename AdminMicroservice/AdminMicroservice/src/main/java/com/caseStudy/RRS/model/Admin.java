package com.caseStudy.RRS.model;

import org.springframework.data.annotation.Id;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "FlightBook")
public class Admin {
	
	
		
		@Id
		
		
	    private String flightid;
		  
		private String flight_no;
		 
		private String flightName;
		
		private String startStation;
		
		private String endStation;
		
		public Admin()
		{
			
		}
		
		public String getFlightid() {
			return flightid;
		}
		 
		public String getFlight_no() {
			return flight_no;
		}
		public void setFlight_no(String flight_no) {
			this.flight_no = flight_no;
		}
		public String getFlightName() {
			return flightName;
		}
		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}
		public String getStartStation() {
			return startStation;
		}
		public void setStartStation(String startStation) {
			this.startStation = startStation;
		}
		public String getEndStation() {
			return endStation;
		}
		public void setEndStation(String endStation) {
			this.endStation = endStation;
		}
		@Override
		public String toString() {
			return "Flight [flightid=" + flightid + ", flight_no=" + flight_no + ", flightName=" + flightName + ", startStation="
					+ startStation + ", endStation=" + endStation + "]";
		}

				
		
		
	}
