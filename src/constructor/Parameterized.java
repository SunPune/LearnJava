package constructor;

public class Parameterized {

public String car;
public	int year;
	
protected Parameterized(String carName, int carYear) {
		
	 car = carName;
		year = carYear;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Parameterized obj = new Parameterized("Fiesta", 2013);
		System.out.println(obj.car + " "+ obj.year);
	}
} 
