package conditions;

public class Assignment3Q14 {

	public static void main(String[] args) {
		int marks = 85;
		int mathScore =75;
		if (marks >=80) {
			System.out.println("You are eligible for admission");
			if (mathScore >=75) {
				System.out.println("Eligible bcoz mathscore");
			} else {
				System.out.println("Not eligible bcoz mathScore");
			}
		} else {
			System.out.println("Not eligible for admission");
		}

	}

}
