package staticmethod;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee.empSalary();
		emp1.empVacationTime();
		//SuperEmployee sem1=new SuperEmployee();
		SuperEmployee.empSalary();
		Employee.empSalary();
	}
}
