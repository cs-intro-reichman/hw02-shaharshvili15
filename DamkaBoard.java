/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int numberOrLinesAndColumns = Integer.parseInt(args[0]);
		for (int line= 1; line<=numberOrLinesAndColumns ; line++){
			String currentLine ="";
			for(int column = 1;column<=numberOrLinesAndColumns;column++ ){
				if(line%2 == 0 && column == 1){
					currentLine += " *";
				}
				else if (line%2 != 0 && column == 1) {
					currentLine += "*";
				}
				else{
					currentLine +=" *";
				}
			}
			System.out.println(currentLine);
			//if(line != numberOrLinesAndColumns){
			//	System.out.println();
			//}
		}
	}
}
