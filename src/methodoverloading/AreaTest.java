package methodoverloading;

public class AreaTest {

	public static void main(String[] args) {
		Area a=new Area();
		a.calculateArea(5);
		System.out.println();
		a.calculateArea(10, 20);
		System.out.println();
		a.calculateArea(7.1);

	}

}
