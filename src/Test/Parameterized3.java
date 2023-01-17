package Test;

import constructor.*;

//import constructor.Parameterized;

 class Parameterized3 extends Parameterized {

 Parameterized3(String carName, int carYear) {
	super(carName, carYear);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterized obj = new Parameterized3("Audio", 2022);
		System.out.println(obj.car+ " " + obj.year);
	}

}
