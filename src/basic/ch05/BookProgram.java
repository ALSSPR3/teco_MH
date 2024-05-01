package basic.ch05;

public class BookProgram {

	public static void main(String[] args) {
		
		Book bookBox1 = new Book();
		Book bookBox2 = new Book();
		
		System.out.println(bookBox1);
		System.out.println(bookBox2);
		
		bookBox1.title = "플러터UI실전";
		bookBox1.author = "김근호";
		bookBox1.publishYear = 2022;
		bookBox1.totalPage = 230;
		
		System.out.println("----------------------");
		System.out.println(bookBox1.title);
		System.err.println(bookBox1.author);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		bookBox2.title = "PowerJava 3판";
		bookBox2.author = "천인국";
		bookBox2.publishYear = 2022;
		bookBox2.totalPage = 778;
		
		System.out.println("----------------------");
		System.out.println(bookBox2.title);
		System.err.println(bookBox2.author);
		System.out.println(bookBox2.publishYear);
		System.out.println(bookBox2.totalPage);
		 
	}
}
