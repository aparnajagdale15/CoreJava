package constructor;

public class Book {
	String title;
	String author;
	int price;
	
	Book(){
		title="Automation Testing";
		author="Aparna";
		price=100;
	}
	
	public void display() {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("Price: "+ price);
	}

	public static void main(String[] args) {
		Book b1= new Book();
		

	}

}
