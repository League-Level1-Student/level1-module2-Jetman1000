package extra;

public class PixelRunner {
public static void main(String[] args) {
	
	PixelParty pp=new PixelParty();	
pp.getRandomColor();
pp.drawCircle(10, 10, 10);
pp.drawRectangle(10, 10, 50, 50);
pp.drawTriangle(10, 10, 10, 10, 10, 10);
	}
}
