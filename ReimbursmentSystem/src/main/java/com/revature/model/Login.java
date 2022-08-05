package com.revature.model;

import java.util.Objects;

public class Login {
		private String username;
		private String password;
		private int Department;
		
		
		
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Login(String username, String password, int department) {
			super();
			this.username = username;
			this.password = password;
			this.Department = department;
		}



		@Override
		public int hashCode() {
			return Objects.hash(Department, password, username);
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Login other = (Login) obj;
			return Department == other.Department && Objects.equals(password, other.password)
					&& Objects.equals(username, other.username);
		}



		public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public int getDepartment() {
			return Department;
		}



		public void setDepartment(int department) {
			Department = department;
		}



		@Override
		public String toString() {
			return "Login [username=" + username + ", password=" + password + ", Department=" + Department + "]";
		}
		
		
		
	





}
