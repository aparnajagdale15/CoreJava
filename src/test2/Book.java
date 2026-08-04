package test2;

public class Book {
	
	int BookID;
	String BookName;
	
	Book(String BookName,int ID){
		this.BookName=BookName;
		BookID=ID;
	}
	
	public void display() {
		System.out.println("BookName = " +BookName);
		System.out.println("BookID = " +BookID);
	}
	
	

	public static void main(String[] args) {
		Book b=new Book("MT",11);
		b.display();
		
	}

}
