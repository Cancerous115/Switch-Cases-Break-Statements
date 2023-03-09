import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner scanner= new Scanner(System.in);

		System.out.print("Enter first number:");
		double number1=scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter second number:");
		double number2=scanner.nextDouble();
		scanner.nextLine();

		System.out.print("What operation would you like to use?");
		String operation=scanner.nextLine();
		
		switch(operation){
			case"sum":
				System.out.printf("%f+%f=%f",number1,number2,number1+number2);	
		//break stops here,outside if/else staements. 
				break;
			case"sub":
				System.out.printf("%f-%f=%f",number1,number2,number1-number2);
				break;
			case"div":
				if(number2==0){
				System.out.println("can't divide by 0");
				}else{
				System.out.printf("%f/%f=%f",number1,number2,number1/number2);
				}
				
			default:
				System.out.printf("%s is not a supported operation.");
		}
		//if (operation.equals("sum"))
		//{System.out.printf("%f+%f=%f",number1,number2,number1+number2);}				 
    //elif(operation.equals("mult")); {
		//System.out.printf("%f*%f=%f",number1,number2,number1*number2); 
		//}
		scanner.close();
	}
}