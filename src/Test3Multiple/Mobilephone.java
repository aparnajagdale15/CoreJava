package Test3Multiple;

public class Mobilephone implements Camera,Gps{
	
	public void capturePhoto() {
        System.out.println("Photo clicked.");
    }

    public void showLocation() {
        System.out.println("Current location is shown.");
    }
	
}
