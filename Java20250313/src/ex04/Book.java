package ex04;

public class Book {
	private String title;
	private String author;
	private int price;
	Book(){
		title = "자바의 정석";
	}
    String getBookInfo(){
	return title+" "+author+" "+price;	
  }
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}
