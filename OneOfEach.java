import java.util.Random;

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		Random rand = new Random();
		//0 is boy 1 is girl
		int childrenCount=0;
		boolean boy = false;
		boolean girl = false;
		while (!boy || !girl){
			childrenCount++;
			int randomNumber = rand.nextInt(2);
			if(randomNumber == 0){
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
