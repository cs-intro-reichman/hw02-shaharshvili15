/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String value = args[0];
		int middle = ((value.length() % 2) == 0) ? ((value.length() / 2)) : (int) (double) (value.length() / 2);
		String reversed ="";
		for(int i = value.length()-1; i>= 0 ; i--){
			System.out.print(value.charAt(i));
			reversed += value.charAt(i);
		}
		System.out.println();
		System.out.print("The middle character is " + reversed.charAt(middle));
	}
}
