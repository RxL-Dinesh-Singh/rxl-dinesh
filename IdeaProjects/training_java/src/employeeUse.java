package Company;

public class employeeUse {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.createEmployee(1, "dinesh", 12, "Computer SCience");
		emp1.createEmployee(2, "Kushagra", 13, "Computer SCience");
		emp1.createEmployee(3, "devesh", 14, "Computer SCience");
		emp1.createEmployee(4, "nikhil", 15, "Computer SCience");
		emp1.createEmployee(5, "jay", 16, "Computer SCience");
		emp1.retriveObjectAscending();
		emp1.retriveByAge();
	}
}
