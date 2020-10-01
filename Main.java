import java.util.Scanner;
/**
 *The example program for Nested
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
		Scanner input = new Scanner(System.in);

		//ask the user if the animal has feathers
		System.out.println("Does the animal have feathers? (yes/no)");
		String featherAnswer = input.nextLine();
    
		//check to see feather status
		if(featherAnswer.equals("yes")){
			//get feather colour
			System.out.println("What colour are the feathers? (red/blue)");
			String featherColour = input.nextLine();
			if(featherColour.equals("blue")){
				System.out.println("You have a blue jay");
			}else if(featherColour.equals("red")){
				System.out.println("You have a cardinal");
			}
			//if the user answered no
		}else{
			
		}
	}
}
