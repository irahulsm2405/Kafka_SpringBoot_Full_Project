package com.employee.ws.core;


public class EmployeeEvent {

		private Integer employeeId;
		private String name;
		private String unit;
		private String email;
		private String phone;
		
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public EmployeeEvent(Integer employeeId, String name, String unit, String email, String phone) {
			super();
			this.employeeId = employeeId;
			this.name = name;
			this.unit = unit;
			this.email = email;
			this.phone = phone;
		}
		public EmployeeEvent() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", name=" + name + ", unit=" + unit + ", email=" + email
					+ ", phone=" + phone + "]";
		}
		
		
}
