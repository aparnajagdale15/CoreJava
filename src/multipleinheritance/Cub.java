package multipleinheritance;

 public class Cub implements lion,Lioness {
	
	@Override
	public void roar() {
		System.out.println("Lioness is roaring");
		
	}
	
	@Override
	public void hunt() {
		System.out.println("lion is hunting");
	}
	
	void eat() {
		System.out.println("Cub is eating");
	}

}
