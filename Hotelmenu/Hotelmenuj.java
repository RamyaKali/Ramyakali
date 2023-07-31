package Hotelmenu;

public class Hotelmenuj {
	public static void main (String args[])
	{ 
		System.out.println (" PARCEL SERVICE");
	 System.out.println ("  Particulars      Gst   Qty   rate   Amount");
	 System.out.println (" Carry bag Medium  5%    1     5.00   5.0");
	 System.out.println (" Plain dosai      \n 5%    1     60.00  60.00");
	 System.out.println (" Paratha kuruma    5%    1     50.00  50.00");
	 System.out.println (" Sambar vada 1 pc  5%    1     30.00  30.00");
	 int carrybag= 5;
	 int Plaindosai= 60;
	 int paratha=50;
	 int Sambarvada= 30;
	 int sum = carrybag+ Plaindosai+paratha+Sambarvada;
	
	 System.out.println("--------------The sub total is--------:"+sum);
	}
}