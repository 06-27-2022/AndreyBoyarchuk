package codingChalange3;
import java.util.*;

public class EvenOrOdd {
	
	int int_Val (String inpt) {
		 try {
		        int IntVal = Integer.parseInt(inpt);
		        return IntVal ;
		    } catch (NumberFormatException e) {
		        System.out.println("Input String cannot be parsed to Integer.");
		    }
		return 0;
	}
	
   	
	public static void main(String[] args) {
		int choice = 1;
		
		while (choice <= 1) {	
		
		EvenOrOdd inputs=new EvenOrOdd();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number");
		String inpt =scan.nextLine();
		
		if (inputs.int_Val(inpt)%2==0) {
			
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
			
		}
		
		System.out.println("To Continue with new nuber Enter 1 ; to quit Enter 2");

        String choiceString = scan.nextLine();
        choice = Integer.parseInt(choiceString);

        if (choice == 1) {
            continue;

        } else if (choice > 1) {
            break;
        }
        scan.close();
		}
		
		
		
		    
		    
		
		
	}

}
