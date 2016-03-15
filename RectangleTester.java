public class RectangleTester {

	private double height ;
	private double width ;
	private double y;
	private double x;
	
	public RectangleTester(double X,double Y,double Width,double Height){
		this.height= Height;
		this.width = Width;
		this.x = X;
		this.y = Y; }
	
	public String toString(){
		return "\nRectangle"+"[X="+this.x+",Y="+this.y+",Width="+this.width+",Height="+this.height+"]\n"
				+"Area="+this.height*this.width+"\nPerimeter="+(this.height+this.width)*2;
		
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

	
		
