package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "Lord of the Rings";
		
		String wordChoice = "Ring";
		
		if(bookTitle.contains("Rings")) {
			System.out.print("The book contains the word" + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("\nThe browser is chrome");
		}
		
		String firstName = "Pao";
		String lastName = "Hernani";
		String SSN = "123456789";
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(SSN.substring(5));
	}
}
