import javax.swing.JOptionPane;

public class PopcornMaker {
	
	
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
		String time = JOptionPane.showInputDialog("how long do you want to cook it?");
		int t = Integer.parseInt(time);
		Popcorn p = new Popcorn(flavor);
		Microwave m = new Microwave();
		m.putInMicrowave(p);
		m.setTime(2);
		m.startMicrowave();
		p.applyHeat();
		p.eat();
	}
}
