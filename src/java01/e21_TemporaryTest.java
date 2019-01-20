package java01;

abstract class Employee  {
	private String name;
	private int years;
	private double salary_a;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getSalary_a() {
		return salary_a;
	}
	public void setSalary_a(double salary_a) {
		this.salary_a = salary_a;
	}
	public Employee() {
	}
	public Employee(String name, int years, double salary_a) {
		super();
		this.name = name;
		this.years = years;
		this.salary_a = salary_a;
	}
	public abstract void pay();
	public void print(Employee e) {
		if (e instanceof Regular) {
			System.out.print("[정규직] " + e.getName() + " " + e.getYears()+" ");//+ " " + e.getSalary_a());
			e.pay();
		}
		else if (e instanceof Temporary) {
			System.out.print("[비정규직] " +  e.getName() + " " + e.getYears()+" " );//+ " " + e.getSalary_a());
			e.pay();
		}
		else System.out.println("Error");
	}
}
class Regular extends Employee {
	double bonus;
	double salary;
	
	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public void pay() {
		// TODO Auto-generated method stub
		double salary_a = salary*12; 
		if(salary < 200) {
			salary_a = (salary_a*1.04);
		}
		else if(salary < 250) {
			salary_a = (salary_a*1.05);
		}
		else salary_a = (salary_a*1.06);
		System.out.println(salary_a);
	}
	public Regular() {
		
	}
	public Regular(double bonus, double salary) {
		super();
		this.bonus = bonus;
		this.salary = salary;
	}

	
}
class Temporary extends Employee{
	private int day;
	private double wage;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("급여 : " + (day*wage));
	}
	public Temporary() {
		
	}
	public Temporary(int day, double wage) {
		super();
		this.day = day;
		this.wage = wage;
	}
	
}
public class e21_TemporaryTest {
	public static void main(String[] args) {
		Regular r1 = new Regular();
		Temporary t1 = new Temporary(25,9);
		r1.setName("Yoom");
		r1.setYears(25);
		r1.setSalary(500);
		t1.setName("Young");
		t1.setYears(21);
		r1.print(r1);
		t1.print(t1);
	}
}
