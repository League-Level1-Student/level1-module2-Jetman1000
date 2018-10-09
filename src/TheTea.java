
public class TheTea {
public static void main(String[] args) {

	TeaBag Tea=new TeaBag("Green");
	Kettle k= new Kettle();
	Cup c= new Cup();
	Tea.getFlavor();
	k.boil();
	c.makeTea(Tea,k.getWater());

	}
}
