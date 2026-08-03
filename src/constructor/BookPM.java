package constructor;

public class BookPM {

	String title;
	String author;
	int price;
	
	BookPM(String title,String a,int p){
		this.title=title;
		author=a;
		price=p;
		}
		
		public void displayDetails() {
			System.out.println("Book title is: "+title);
			System.out.println("Book Author name is: "+author);
			System.out.println("Book price is : "+price);	
		}

	public static void main(String[] args) {
		BookPM b1=new BookPM("Alchemist","P. Coelho",350);
		b1.displayDetails();

	}

}
