import java.util.Random;

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		Random rand = new Random();
		//less than 0.5 is boy more or equal than 0.5 is a girl
		int childrenCount=0;
		boolean boy = false;
		boolean girl = false;
		while (!boy || !girl){
			childrenCount++;
			double randomNumber = rand.nextDouble(1);
			if(randomNumber < 0.5){
				System.out.print("b ");
				boy = true;
			}
			else{
				System.out.print("g ");
				girl = true;
			}
		}
		System.out.println();
		System.out.printf("You made it... and you now have %d children" , childrenCount);
	}
}
