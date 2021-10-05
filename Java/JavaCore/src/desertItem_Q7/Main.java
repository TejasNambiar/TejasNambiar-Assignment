package desertItem_Q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		DesetItem candy = new Candy();
		DesetItem cookie = new Cookie();
		DesetItem iceCream = new IceCream();
		candy = new Candy(0.1, 20);
		cookie = new Cookie(0.2, 30);
		iceCream = new IceCream(0.3, 50);
		
		double tax, price;
		
		System.out.println("Hello | Hallo | Namaste ");
		System.out.println("-------------");
		System.out.println("Select(number) \n1. User\t2. Admin");
		
		int option = Integer.parseInt(reader.readLine());
		
		switch (option) {
		
		case 1:
			System.out.println("~~~~User~~~~");
			System.out.println("Choose item\n1. candy\t2.cookie\t3.iceCream");
			int item = Integer.parseInt(reader.readLine());
			System.out.println("Enter the Quantity required");
			int quantity = Integer.parseInt(reader.readLine());
			
			switch (item) {
			
				case 1:
					System.out.println("candy amount "+candy.getAmount()
						+"\ncandy tax: "+candy.getTax() +" totalAmount: USD "+String.format("%.2f",(quantity * (float)candy.getCost())));
					System.out.println("-------------");
					break;
					
				case 2:
					System.out.println("cookie amount "+cookie.getAmount()
						+"\ncookie tax: "+cookie.getTax() +" totalAmount: EUR "+String.format("%.2f",quantity*(float)cookie.getCost()));
					System.out.println("-------------");
					break;
					
				case 3:
					System.out.println("iceCream amount "+iceCream.getAmount()
						+"\niceCream tax: "+iceCream.getTax() +" totalAmount: USD "+String.format("%.2f",(quantity * (float)iceCream.getCost())));
					System.out.println("-------------");
					break;
	
				default:
					System.out.println("Please enter proper value");
					break;
				}
			break;
			
		case 2:
			System.out.println("~~~~Admin~~~~");
			System.out.println("Choose item\n1. candy\t2.cookie\t3.iceCream");
			int item1 = Integer.parseInt(reader.readLine());
			
			switch (item1) {
			
				case 1:
					System.out.println("Candy info");
					System.out.println("Tax");
					tax = Double.parseDouble(reader.readLine());
					System.out.println("Amount");
					price = Double.parseDouble(reader.readLine());
					Candy candy2 = new Candy(tax,price);
					
					System.out.println("candy amount "+candy2.getAmount()
					+"\ncandy tax: "+candy2.getTax() +" totalAmount: USD "+String.format("%.2f",(float)candy2.getCost()));
					System.out.println("-------------");
					break;
					
				case 2:
					System.out.println("Cookie info");
					System.out.println("Tax");
					tax = Double.parseDouble(reader.readLine());
					System.out.println("Amount");
					price = Double.parseDouble(reader.readLine());
					Cookie cookie2 = new Cookie(tax,price);
					
					System.out.println("cookie2 added "+cookie2.getAmount()
					+"\ncookie2 tax: "+cookie2.getTax() +" totalAmount: USD "+String.format("%.2f",(float)cookie2.getCost()));
					System.out.println("-------------");
					break;
					
				case 3:
					System.out.println("Icecream info");
					System.out.println("Tax");
					tax = Double.parseDouble(reader.readLine());
					System.out.println("Amount");
					price = Double.parseDouble(reader.readLine());
					IceCream iceCream2 = new IceCream(tax,price);
					
					System.out.println("iceCream2 amount "+iceCream2.getAmount()
					+"\niceCream2 tax: "+iceCream2.getTax() +" totalAmount: USD "+String.format("%.2f",(float)iceCream2.getCost()));
					System.out.println("-------------");
					break;
	
				default:
					System.out.println("Please enter proper value");
					break;
				}
			break;
			
		default:
			System.out.println("Please enter proper value");
			break;
		}
		
	}

}
