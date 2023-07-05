package day26.library.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


//대출 열람(도서대출 기록)
@Data
@AllArgsConstructor
public class LoanBrowsing implements Serializable{
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate=date;
		this.returnDate=date;
	}
	
	private static final long serialVersionUID = 5727853102283059898L;
	private Book book;//대출 도서
	private Date loanDate;//대출일
	private Date returnDate;//반납일
	
	public String getLoanDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(loanDate);
	}
	public String getReturnDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(returnDate);
	}
}
