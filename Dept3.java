package com.pojo;




public class Dept3 {
		private int departmentNumber;
		private String departmentName;
		private String departmentLocation;
		
		
		public int getDepartmentNumber() {
			return departmentNumber;
		}

		public void setDepartmentNumber(int departmentNumber) {
			this.departmentNumber = departmentNumber;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public String getDepartmentLocation() {
			return departmentLocation;
		}

		public void setDepartmentLocation(String departmentLocation) {
			this.departmentLocation = departmentLocation;
		}

		

		@Override
		public String toString() {
			return "Department [departmentNumber=" + departmentNumber + ", departmentName=" + departmentName
					+ ", departmentLocation=" + departmentLocation + "]";
		}

		
		
		
		
	}


