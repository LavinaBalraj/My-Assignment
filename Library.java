package week1.day3;

public class Library {
	 public String addBook (String bookTitle) {
	  return bookTitle;
	 }
	 public void issueBook () {
		 System.out.println("Book issued successfully");
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library libObject= new Library();
		System.out.println(libObject.addBook("Book added successfully"));
		libObject.issueBook();
		
	}

}
