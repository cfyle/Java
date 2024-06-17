// 
public class Rectangle {
	private int width;
	private int length;
	private int centerX;
	private int centerY;
	
	public Rectangle(int width, int length, int centerX, int centerY) {
		super();
		this.width = width;
		this.length = length;
		this.centerX = centerX;
		this.centerY = centerY;
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	public int getCenterY() {
		return centerY;
	}
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public int getArea() {
		return width * length;
	}
	
}
