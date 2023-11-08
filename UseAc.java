package day1;

public class UseAc {
	public static void main (String [] args) {
		Ac a1 = new Ac();
		a1.brand = "Bluestar";
		a1.price = 40000;
		a1.colour = "White";
		a1.taxAmount = 5;
		a1.netPrice=(a1.price+(a1.price*a1.taxAmount/100));
		
		Ac a2 = new Ac();
		a2.brand = "Samsung";
		a2.price = 50000;
		a2.colour = "White";
		a2.disAmount = 5;
		a2.netPrice=(a2.price-(a2.price*a2.disAmount/100));
		
		Ac a3 = new Ac();
		a3.brand = "LG";
		a3.price = 45000;
		a3.colour = "White";
		a3.taxAmount = 5;
		a3.netPrice=(a3.price+(a3.price*a3.taxAmount/100));
		
		System.out.println(a1.brand+" "+a1.colour+" "+a1.price+" "+a1.netPrice);
		System.out.println(a2.brand+" "+a2.colour+" "+a2.price+" "+a2.netPrice);
		System.out.println(a3.brand+" "+a3.colour+" "+a3.price+" "+a3.netPrice);
	}

}
