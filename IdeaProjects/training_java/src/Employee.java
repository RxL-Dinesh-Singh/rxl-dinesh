package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Employee  {
		int age;
		int id;
		String name;
		String department;
		HashMap<Integer, Employee> map = new HashMap<>();
		HashMap<Integer, Employee> map2 = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> ageArr = new ArrayList<>();
		public Employee() {

			
		}
		public  void createEmployee(int id, String name , int age , String department) {
			arr.add(id);
			ageArr.add(age);
			Employee emp = new Employee();
			emp.id = id;
			emp.name = name;
			emp.age = age;
			emp.department = department;
			map.put(id, emp);
			map2.put(age, emp);
		}
		public void retriveObjectAscending() {
			Collections.sort(arr);
			for(int i=0;i<arr.size();i++) {
				System.out.println(map.get(arr.get(i)));
			}
		}
		public void retriveByAge() {
			Collections.sort(ageArr);
			for(int i=ageArr.size()-1;i>=0;i--) {
				System.out.println(map2.get(ageArr.get(i)));
			}
		}
		
		
		
}
