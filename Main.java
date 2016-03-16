/*
 * [A]98
 * [TA's advise]
 * 1.看來你的C#應該學得很不錯, 有set;get;實作的感覺.
 * 2.並沒有串接getHeigth(),getWidth()去計算Area及Perimeter, 此部分扣2分.
 * 3.小程式如果沒有要求的話, 盡量寫成一份檔案.
 * 4.Accessible的修飾字處理得很好.
 * */

import java.util.Scanner;

class RectangleTester {

	//good job!
	private double height;
	private double width;
	private double y;
	private double x;

	//RectangleTester(){this(-1,-1,-1,-1);}//若能加上這一行去實踐物件初始化會更好
	
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
		
		//或許加上try-catch是防止使用者輸入非數字而導致程式出錯會更好.
		RectangleTester rectangle1 = new RectangleTester(scanner.nextDouble(), scanner.nextDouble(),
				scanner.nextDouble(), scanner.nextDouble());
		
		RectangleTester rectangle2 = new RectangleTester(0, 12, 60, 47);

		System.out.println("\n<Your Rectangle>\n" + rectangle1.toString());
		System.out.println("\n<Example Rectangle>\n" + rectangle2.toString());
		System.out.println("\nEnd of Output!");

	}

}
