package ex04;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book book=new Book();
       System.out.println(book.getBookInfo());
       Book book1=new Book("수학의 정석","호날두",50000);
       System.out.println(book1.getBookInfo());
       
	}

}
