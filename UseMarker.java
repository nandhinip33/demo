package day1;

public class UseMarker {
	public static void main (String [] args) {
		Marker m = new Marker();
		m.brand = "camlin";
		m.colour = "black";
		m.price = 1500;
		m.taxAmount = 5;
		m.disAmount = 3;
		m.netPrice=(m.price+(m.price*m.taxAmount/100));
		m.netPrice1=(m.price-(m.price*m.disAmount/100));
		
		
		System.out.println(m.brand+"\n"+m.price+"\n"+m.colour+"\n"+m.netPrice+"\n"+m.netPrice1);
	}

}






