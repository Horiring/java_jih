package day26.library.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.LoanBrowsing;

public class LibraryController implements Program{
	private static final int EXIT=4;
	private static Scanner sc = new Scanner(System.in);
	private	List<Book> list = new ArrayList<>();
	List<LoanBrowsing> loanList=new ArrayList<>();
	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:	
			bookRegistration();
			break;
		case 2:
			bookLoans();
			break;
		case 3:
			bookReturn();
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		case 5:
			print();
			break;
		default:
			System.out.println("Wrong menu!");
		}
	}

	private void bookReturn() {
		sc.nextLine();
		//반납도서 번호를 입력
		System.out.print("반납할 도서번호 입력 : ");
		String bookNum=sc.nextLine();
		//대출한 도서가 아니면 반납을 X
		int index = list.indexOf(new Book(null, null, null, bookNum));
		if(index == -1) {
			System.out.println("대출한 도서가 아닙니다.");
			return;
		}
		//맞으면 반납
		Book returnBook = list.get(index);
		returnBook.returnBook();
		
		//대출열람 리스트에서 대출한 도서에 반납일을 오늘날짜로 수정
		//반납한 도서의 대출 열람을 찾아야 함.
		int lbIndex = loanList.lastIndexOf(new LoanBrowsing(returnBook, null, 14));
		LoanBrowsing tmpLb = loanList.get(lbIndex);
		tmpLb.setReturnDate(new Date());
		System.out.println("반납완료");
		System.out.println("대출일 : " +tmpLb.getLoanDateStr());
		System.out.println("반납일 : " +tmpLb.getReturnDateStr());
	}

	private void bookLoans() {
		//대출 가능한 도서들을 조회
		//Stream<Book> stream = list.stream();
		list.stream()
			.filter(b->!b.isLoan()) //대출 가능한 도서만 추출
			.forEach(b->{			//추출한 도서를 출력
			System.out.println("============");
			System.out.println(b);
			System.out.println("============");
		});
		/*
		for(Book tmp : list) {
			if(!tmp.isLoan()) {
				System.out.println("============");
				System.out.println(tmp);
				System.out.println("============");
			}
		}
		*/
		sc.nextLine();
		System.out.print("대출할 도서번호 입력 : ");
		String bookNum=sc.nextLine();
		//대출을 신청
		//도서 번호가 올바른지 확인
		//번호에 맞는 도서가 있는지 확인
		
		//도서가 없으면 올바르지 않음
		
		//도서가 있으면 대출중인지 확인
		boolean possible = 
				list.stream().filter(b->!b.isLoan() && b.getBookNum().equals(bookNum)).count()>0;
		
		//올바르지 않으면(없는 도서번호이거나,대출중인 도서인 경우)
		//대출할수 없다고 출력
		if(!possible) {
			System.out.println("대출할 수 없습니다.");
			return;
		}
					
		//올바르면 대출을 진행
		//도서 대출 객체를 생성 도서,대출일 ,대출기간
		int index = list.indexOf(new Book(null, null, null, bookNum));
		Date loanDate = new Date();
		LoanBrowsing lb = 
				new LoanBrowsing(list.get(index),loanDate,14);
		
		
		
		//대출일을 출력
		loanList.add(lb);
		list.get(index).loanBook();//도서에 대출했다고 수정
		System.out.println("대출일 : " +lb.getLoanDateStr());
		//반납예정일 출력
		System.out.println("반납일 : " +lb.getEstimatedDateStr());
	}

	private void bookRegistration() {
		System.out.print("도서명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String writer = sc.nextLine();
		System.out.print("isbn : ");
		String isbn = sc.nextLine();
		System.out.print("도서번호 : ");
		String bookNum = sc.nextLine();
		Book book = new Book(title, writer, isbn, bookNum);
		if(list.contains(book)) {
			System.out.println("이미 등록된 도서 번호입니다. 확인해주세요.");
			return;
		}
		//도서 리스트에 도서 객체를 추가
		list.add(book);
		System.out.println("등록완료");
	}

	@Override
	public void run() {
		String bookfileName= "src/day26/library/book.txt";
		String loanfileName= "src/day26/library/loan.txt";
		load(bookfileName);
		loadLoan(loanfileName);
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
		}
		while(menu != EXIT );	
		save(bookfileName);
		saveLoan(loanfileName);
	}

	private void save(String fileName) {
		try(
				FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(Book tmp: list) {
					oos.writeObject(tmp);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	private void saveLoan(String fileName) {
		try(
				FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(LoanBrowsing tmp: loanList) {
					oos.writeObject(tmp);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	private void loadLoan(String fileName) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
				while(true) {
					LoanBrowsing tmp = (LoanBrowsing)ois.readObject();
					loanList.add(tmp);
				}
			} catch (FileNotFoundException e) {
				System.out.println("불러올 파일이 없습니다.");
			} catch (EOFException e) {
				System.out.println("불러오기 완료");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("LoanBrowsing 클래스를 찾을 수 없습니다.");
			} 
	}
	private void load(String fileName) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
				while(true) {
					Book tmp = (Book)ois.readObject();
					list.add(tmp);
				}
			} catch (FileNotFoundException e) {
				System.out.println("불러올 파일이 없습니다.");
			} catch (EOFException e) {
				System.out.println("불러오기 완료");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Book 클래스를 찾을 수 없습니다.");
			} 
	}

	@Override
	public void printMenu() {
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 대출");
		System.out.println("3. 도서 반납");
		System.out.println("4. 프로그램 종료");
		System.out.print("Select Menu : ");
	}
	public void print() {
		for(Book tmp2 : list) {
			System.out.println(tmp2);
		}
		for(LoanBrowsing tmp3 : loanList) {
			System.out.println(tmp3);
		}
	}
}
