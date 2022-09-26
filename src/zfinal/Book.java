package zfinal;

// 책 정보에 대한 정보를 관리하기 위해 Book 이라는 클래스를 만들고, 
// 책제목, 저자, 출판사에 대한 정보를 저장하고,
// 각각의 정보에 값을 지정하고 출력할 수 있도록 클래스를 설계하시오.

public class Book {

	private String title; // 책제목
	private String writer; // 저자
	private String publisher; // 출판사

	Book() {};
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
