package prereq;

import java.util.Scanner;

public class DigitToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter the number");
				int number = s.nextInt();
				int input = 0;
				while (number > 0){
					input = input*10 + number%10;
					number = number/10;
				}
				int output = 0;
				while(input > 0){
					output = input%10;
					input = input/10;
					
				
					switch(output){
					case 0 : System.out.print(" Zero "); break;
					case 1 : System.out.print(" One "); break;
					case 2 : System.out.print(" Two "); break;
					case 3 : System.out.print(" Three "); break;
					case 4 : System.out.print(" Four "); break;
					case 5 : System.out.print(" Five "); break;
					case 6 : System.out.print(" Six "); break;
					case 7 : System.out.print(" Seven "); break;
					case 8 : System.out.print(" Eight "); break;
					case 9 : System.out.print(" Nine "); break;
					}

			}
				
			}

	}


