package methodoverloading;

public class Message {
	
	void sendMessage(String text) {
        System.out.println("Message: " + text);
    }

    void sendMessage(String text, String sender) {
        System.out.println("Message: " + text);
        System.out.println("Sender: " + sender);
    }

    void sendMessage(String text, String sender, String receiver) {
        System.out.println("Message: " + text);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
    }

	public static void main(String[] args) {
		Message m=new Message();
		m.sendMessage("Hello!");
		System.out.println();
		m.sendMessage("HI", "Aparna");
		System.out.println();
		m.sendMessage("Hello", "Aparna", "Sandip");

	}

}
