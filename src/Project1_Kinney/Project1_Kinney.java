package Project1_Kinney;
import java.util.Scanner;
public class Project1_Kinney {

	public static void main(String[] args) {
		/* Write a program that displays the following options for
		 * a math quiz
		 * Please choose one of the following options for your math quiz:
		 * 1. Addition with numbers 1-10
		 * 2. Addition with numbers 1-100
		 * 3. Subtraction with numbers 1-10
		 * 4. Subtraction with numbers 1-100
		 * 5. Multiplication with numbers 1-10
		 * 6. Exit the program
		 */
		
		
		//Calling Scanner here
		Scanner in = new Scanner(System.in);
		//Starting off the title of the program before going into the for loop for the menu and options associated with it
		System.out.println("Welcome to the Wright State School of Math!");
		//Here the menu of choices is printed out for the user to pick from as long as the two variables that will keep track of how
		//many problems the user gets right and how many they attempt so that we can find the total percent at the end of the program.
		double right = 0;
		double attempted = 0;
		//For loop will hold for true until its break, which will be when the user uses the 6th option
		while (true) {
		//Menu choices
		System.out.println("");
		System.out.println("Please choose of the following options for your math quiz: ");
		System.out.println("1. Addition with numbers 1-10");
		System.out.println("2. Addition with numbers 1-100");
		System.out.println("3. Subtraction with numbers 1-10");
		System.out.println("4. Subtraction with numbers 1-100");
		System.out.println("5. Multiplication with numbers 1-10");
		System.out.println("6. Exit the program ");
		int choice = in.nextInt();
		//While the user's input is not between the choices presented, put them in a loop until they pick a number between the choice.
		//Whatever number, 1-6, the user chooses, it will go to that for loop which is listed below as the if statements.
		while(choice < 1 || choice > 6) {
			System.out.println("Valid choices are 1-6; please re-enter");
			choice = in.nextInt();
		}
		//Declaring variables to check the answer the user gives, and also the variable correct which is the actual answer to see
		//if the user is correct or not
		int answer;
		int correct;
		if (choice == 1) {
			//Start a for loop to generate the problem and print it to the user
			for (int j = 1; j <= 5 ; j++) {
				attempted += 1;
				int add1 = (int)(1 + Math.random()*10);
				int add2 = (int) (1 + Math.random()*10);
				correct = add1 + add2;
			System.out.println("");
			System.out.println("Enter the answer to the following problem: " + add1 + "+" + add2);
			answer = in.nextInt();
			//Check the answer the user gives, if its correct at a counter to the right variable and also print out that they are correct
			//Otherwise tell the user they are wrong and display the right answer and move on to the next problem
			if (answer == add1 + add2) {
				System.out.println("That is the correct answer!");
				right += 1;
			} else { 
				System.out.println("Sorry, that is incorrect. The correct answer is " + correct);
			}
		}
			
		} else if (choice == 2) {
			for (int j = 1; j <= 5 ; j++) {
				attempted += 1;
				int add2 = (int)(1 + Math.random()*100);
				int add3 = (int) (1 + Math.random()*100);
				correct = add2 + add3;
			System.out.println("");
			System.out.println("Enter the answer to the following problem: " + add2 + "+" + add3);
			answer = in.nextInt();
			if (answer == add2 + add3) {
				System.out.println("That is the correct answer!");
				right += 1;
			} else { 
				System.out.println("Sorry, that is incorrect. The correct answer is " + correct);
			}
		}
			
		} else if (choice == 3) {
			for (int j = 1; j <= 5 ; j++) {
				attempted += 1;
				int sub1 = (int)(1 + Math.random()*10);
				int sub2 = (int) (1 + Math.random()*10);
				correct = sub1 - sub2;
			System.out.println("");
			System.out.println("Enter the answer to the following problem: " + sub1 + "-" + sub2);
			answer = in.nextInt();
			if (answer == sub1 - sub2) {
				System.out.println("That is the correct answer!");
				right += 1;
			} else { 
				System.out.println("Sorry, that is incorrect. The correct answer is " + correct);
			}
		}
			
		} else if (choice == 4) {
			for (int j = 1; j <= 5 ; j++) {
				attempted += 1;
				int sub3 = (int)(1 + Math.random()*100);
				int sub4 = (int) (1 + Math.random()*100);
				correct = sub3 - sub4;
			System.out.println("");
			System.out.println("Enter the answer to the following problem: " + sub3 + "-" + sub4);
			answer = in.nextInt();
			if (answer == sub3 - sub4) {
				System.out.println("That is the correct answer!");
				right += 1;
			} else { 
				System.out.println("Sorry, that is incorrect. The correct answer is " + correct);
			}
		}
		} else if (choice == 5) {
			for (int j = 1; j <= 5 ; j++) {
				attempted += 1;
				int mult1 = (int)(1 + Math.random()*10);
				int mult2 = (int) (1 + Math.random()*10);
				correct = mult1 * mult2;
			System.out.println("");
			System.out.println("Enter the answer to the following problem: " + mult1 + "*" + mult2);
			answer = in.nextInt();
			if (answer == mult1 * mult2) {
				System.out.println("That is the correct answer!");
				right += 1;
			} else { 
				System.out.println("Sorry, that is incorrect. The correct answer is " + correct);
			}
			
			}
			//If the user chooses 6, break the loop and return to get the grade
		} else if (choice == 6) {
			break;
		
		}
	}
		//Close scanner since no more inputs will need to be gathered from the user beyond this point
		in.close();
		//Since the right and attempted values are used as doubles so that we can divide them, we must display them as ints
		//So here they are casted to new values to display to the user
		int right1 = (int)right;
		int attempted1 = (int)attempted;
		//Calculate the percentage of question right by dividing the number of answers right, by the number of those attempted
		 double percent = ((right/attempted)*100);
		 //Print out to the user the amount of correct problems as well as the percentage correct.
		System.out.printf("You got %d problems correct out of %d problems attempted. That is %.2f percent correct. Goodbye!", right1, attempted1, percent);
	}
}

