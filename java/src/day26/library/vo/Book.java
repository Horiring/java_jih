package day26.library.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Serializable{

	private static final long serialVersionUID = 1383010336056486212L;
	private String title,writer,isbn,bookNum;
	private boolean loan;//대출 여부

	@Override
	public String toString() {
		return "도서명 : "+title+"\n저자 : "+writer+"\nisbn : "+isbn+"\n도서번호 : "+bookNum+"\n대출 : "+loan;
	}
	public void loanBook() {
		this.loan=true;//setLoan(true);
	}
	public void returnBook() {
		this.loan=false;//setLoan(false);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookNum, other.bookNum);
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookNum);
	}
	public Book(String title, String writer, String isbn, String bookNum) {
		this.title = title;
		this.writer = writer;
		this.isbn = isbn;
		this.bookNum = bookNum;
	}
	
}
