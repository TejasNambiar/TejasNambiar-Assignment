package pairGeneric;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
        
        PairString<String, String> paired = new PairString<>();
        paired = new PairString<>("A","1000");
        System.out.println("key: "+paired.getKey()+" value: "+paired.getValue());
        System.out.println("=====================================================================");
        PairString<String, Date> paired2 = new PairString<>();
        
        SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
        Scanner input = new Scanner(System.in);
        
        try{
        	
        	System.out.println("yyyy-mm-dd");
        	String strDate = input.nextLine();
        	Date date = dateInput.parse(strDate);
        	
        	paired2 = new PairString<>("A", date );
        	System.out.println("key: "+paired2.getKey()+" value: "+paired2.getValue());
           
        } 
        catch (Exception e) 
        {
           System.out.println("Parce Exception");
        }finally {
			input.close();
		}
	}

}
