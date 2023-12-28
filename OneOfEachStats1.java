import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int numberOfTimesToRun = Integer.parseInt(args[0]);
		int twoChildrenFamilies = 0;
		int threeChildrenFamilies = 0;
		int fourOrMoreChildrenFamilies = 0;
		int sumOfAllChildren = 0;
		String mostCommon = "";
		Random rand = new Random();
		for (int i = 0; i< numberOfTimesToRun ; i++){
			int childrenCount=0;
			boolean boy = false;
			boolean girl = false;
			while (!boy || !girl){
				childrenCount++;
				int randomNumber = rand.nextInt(2);
				if(randomNumber == 0){
					boy = true;
				}
				else{
					girl = true;
				}
			}
			if(childrenCount == 2){
				twoChildrenFamilies++;
			}
			else if(childrenCount == 3){
				threeChildrenFamilies++;
			}
			else{
				fourOrMoreChildrenFamilies++;
			}
			sumOfAllChildren += childrenCount;
			if(twoChildrenFamilies > threeChildrenFamilies && twoChildrenFamilies > fourOrMoreChildrenFamilies){
				mostCommon = "2";
			}
			else if(threeChildrenFamilies > twoChildrenFamilies && threeChildrenFamilies > fourOrMoreChildrenFamilies){
				mostCommon = "3";
			}
			else if(fourOrMoreChildrenFamilies > twoChildrenFamilies && fourOrMoreChildrenFamilies > threeChildrenFamilies){
				mostCommon = "4 or more";
			}
		}
		var average = (double)sumOfAllChildren/numberOfTimesToRun;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildrenFamilies);
		System.out.println("Number of families with 3 children: " + threeChildrenFamilies);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildrenFamilies);
		System.out.println("The most common number of children is " + mostCommon + ".");
	}
}
