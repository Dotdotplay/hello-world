package FlowControl;
import java.util.Random;
public class randomnumbers {
	
	
	
	Random rand = new Random(); 
	
	public void startmethod (int amount) { 
	int holder = 0;
	for (int i=0;i<amount;i++){
	int n = holder;
	n = rand.nextInt(amount) + 1;
	if(n < holder){
		System.out.println( n + " is less than " + holder);
	
	} else if (n > holder){
		System.out.println( n + " is greater than " + holder);
		
	} else if  (n == holder){
		System.out.println( n + " is equal to " + holder);
	}
	
	holder=n;
	}
	
	}
	public void startmethod1 () {
		
	}
}
