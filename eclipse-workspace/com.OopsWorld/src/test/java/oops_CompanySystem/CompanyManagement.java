package oops_CompanySystem;

public class CompanyManagement {

	public static void main(String[] args) {
		
		Manager M = new Manager("Somya ", 33, 120000, 80000);
		Developer dev1 = new Developer("Sania ", 27, 85000, "Java");
		Developer dev2 = new Developer("Nick ", 29, 82000, "Python");
		QA q1 = new QA("Bob", 27, 82000, "Automation");
		QA q2 = new QA("Sunny", 25, 78000, "Manual");
		
		M.DisplayDetails();
		dev1.DisplayDetails();
		dev2.DisplayDetails();
		q1.DisplayDetails();
		q2.DisplayDetails();
		
		System.out.println(M.getName() + "Bonus: " + M.calculateBonus());
		System.out.println(dev1.getName() + "Bonus: " +dev1.calculateBonus());
		System.out.println(dev2.getName() + "Bonus: " +dev2.calculateBonus());
		System.out.println(q1.getName() + "Bonus: "+q1.calculateBonus());
		System.out.println(q2.getName() + "Bonus: "+q2.calculateBonus());
		
		
		ITDepartment IT = new ITDepartment();
		IT.assignEmployee(M);
		IT.assignEmployee(dev1);
		IT.assignEmployee(dev2);
		IT.assignEmployee(q1);
		IT.assignEmployee(q2);
		
		System.out.println("TOTAL IT Budget: "  + IT.calculateBudget());
		
	}

}
