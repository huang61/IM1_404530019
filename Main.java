import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value for X,Y,Width,Height(Space them apart):");		
		RectangleTester rectangle1 = new RectangleTester(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
		RectangleTester rectangle2 = new RectangleTester(0,12,60,47);		
		
			
		System.out.println("\n<Your Rectangle>\n"+rectangle1.toString());
		System.out.println("\n<Example Rectangle>\n"+rectangle2.toString());
		System.out.println("\nEnd of Output!");
		
	}

}
