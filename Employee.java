package practiceProject;

public class Employee {
	
	private String name;
	private int age;
	private int employeeId;
	
		public Employee(String eName,int eAge, int eId) {
			// TODO Auto-generated constructor stub
			name = eName;
			age = eAge;
			employeeId=eId;
		}
////	public String getName() {
////		return name;
////	}
//	public void setName(String name) {
//		this.name = name;
//	}
////	public int getAge() {
////		return age;
////	}
//	public void setAge(int age) {
//		this.age = age;
//	}
////	public int getEmployeeId() {
////		return employeeId;
////	}
//	public void setEmployeeId(int empId) {
//		this.employeeId = empId;
//	}

	public String toString() {
		return "Name: " +name+ " "+"Age: "+ age+" "+"ID: " +employeeId;
	}

}
