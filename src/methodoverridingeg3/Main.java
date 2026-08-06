package methodoverridingeg3;

public class Main {

	public static void main(String[] args) {
		Person p;
		p=new Person();
		p.showRole();
        System.out.println();
        
        p=new Teacher();
        p.showRole();
        System.out.println();
        
        p=new Student();
        p.showRole();

	}

}
