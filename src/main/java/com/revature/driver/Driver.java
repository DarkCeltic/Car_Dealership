package com.revature.driver;

import com.revature.load_page.LoadPage;

public class Driver {
	public static void main(String[] args) {
		
		LoadPage deathStarEmporium = new LoadPage();
		deathStarEmporium.loadData();
		
//		Customer c1 = new Customer();
//		c1.setFirstName("Kenneth");
//		c1.setLastName("Stratton");
//		c1.setUsername("KStra");
//		c1.setPassword("Sith");
//		Customer c2 = new Customer();
//		c2.setFirstName("Luke");
//		c2.setLastName("Skywalker");
//		c2.setUsername("LSky");
//		c2.setPassword("Jedi");
//		Employee e1 = new Employee();
//		e1.setFirstName("Bob");
//		e1.setLastName("Johnson");
//		e1.setUsername("BJohn");
//		e1.setPassword("emp1");
//		Employee e2 = new Employee();
//		e2.setFirstName("Dane");
//		e2.setLastName("Joe");
//		e2.setUsername("DJoe");
//		e2.setPassword("emp2");
//		
//		Car car1 = new Car(10000, "123456", "Ford", "F150", "50", "2019");
//		Car car2 = new Car(15000, "987645", "Chevy", "Silverado", "25", "2020");
//		
//		Fleet fleet = new Fleet();
//		fleet.setFleet(car1);
//		fleet.setFleet(car2);
//		
//		for(Car car : fleet.getFleet()) {
//			System.out.println(car);
//		}
//		
//		Users user = new Users();
//		user.setEmployees(e1);
//		user.setEmployees(e2);
//		user.setCustomers(c1);
//		user.setCustomers(c2);
//		
//		for(Customer cus: user.getCustomers()) {
//			System.out.println(cus);
//		}
//		for(Employee emp: user.getEmployees()) {
//			System.out.println(emp);
//		}
//		Database data = new Database(user, fleet);
//		
//		DatabaseDAO save = new DatabaseSerializationDAO();
//		
//		save.createDatabase(data);
	}
}
