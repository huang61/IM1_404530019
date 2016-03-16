/*
 * [A]98
 * [TA's advise]
 * 1.�ݨӧA��C#���ӾǱo�ܤ���, ��set;get;��@���Pı.
 * 2.�èS���걵getHeigth(),getWidth()�h�p��Area��Perimeter, ��������2��.
 * 3.�p�{���p�G�S���n�D����, �ɶq�g���@���ɮ�.
 * 4.Accessible���׹��r�B�z�o�ܦn.
 * */

import java.util.Scanner;

class RectangleTester {

	//good job!
	private double height;
	private double width;
	private double y;
	private double x;

	//RectangleTester(){this(-1,-1,-1,-1);}//�Y��[�W�o�@��h�����l�Ʒ|��n
	
	public RectangleTester(double X, double Y, double Width, double Height) {
		this.height = Height;
		this.width = Width;
		this.x = X;
		this.y = Y;
	}

	public String toString() {
		return "\nRectangle" + "[X=" + this.x + ",Y=" + this.y + ",Width=" + this.width + ",Height=" + this.height
				+ "]\n" + "Area=" + this.height * this.width + "\nPerimeter=" + (this.height + this.width) * 2;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value for X,Y,Width,Height(Space them apart):");
		
		//�γ\�[�Wtry-catch�O����ϥΪ̿�J�D�Ʀr�ӾɭP�{���X���|��n.
		RectangleTester rectangle1 = new RectangleTester(scanner.nextDouble(), scanner.nextDouble(),
				scanner.nextDouble(), scanner.nextDouble());
		
		RectangleTester rectangle2 = new RectangleTester(0, 12, 60, 47);

		System.out.println("\n<Your Rectangle>\n" + rectangle1.toString());
		System.out.println("\n<Example Rectangle>\n" + rectangle2.toString());
		System.out.println("\nEnd of Output!");

	}

}
