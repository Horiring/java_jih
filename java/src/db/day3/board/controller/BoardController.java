package db.day3.board.controller;

import java.util.List;
import java.util.Scanner;

import db.day3.board.service.BoardService;
import db.day3.board.service.BoardServiceImp;
import db.day3.board.vo.BoardVO;

public class BoardController {
	private BoardService boardService = new BoardServiceImp();
	
	public void run() {
		int menu;
		final int EXIT = 5;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);	
		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			updateBoard();
			break;
		case 3:
			deleteBoard();
			break;
		case 4:
			selectBoard();
			break;
		case 5:
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");			
		}		
	}

	private void selectBoard() {
		List<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO tmp : boardList) {
			System.out.println(tmp);
		}
	}

	private void deleteBoard() {
		//수정할 게시글 정보(게시글 번호, 제목)
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 게시글 번호 : ");
		int num = sc.nextInt();
		System.out.print("작성자 아이디 : ");
		String id = sc.next();
		BoardVO board = new BoardVO(num,null,id);
		if(boardService.deleteBoard(board)) {
			System.out.println("[게시글 삭제 성공]");
		}
		else {
			System.out.println("[게시글 삭제 실패]");
		}
	}

	private void updateBoard() {
		//수정할 게시글 정보(게시글 번호, 제목)
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 게시글 번호 : ");
		int num = sc.nextInt();
		System.out.print("수정할 게시글 제목 : ");
		sc.nextLine();
		String title = sc.nextLine();
		
		BoardVO board = new BoardVO(num,title,null);
		if(boardService.updateBoard(board)) {
			System.out.println("[게시글 수정 성공]");
		}
		else {
			System.out.println("[게시글 수정 실패]");
		}
		
	}

	private void insertBoard() {
	//게시글 정보를 입력(제목, 작성자아이디)
	Scanner sc = new Scanner(System.in);
	System.out.print("제목 : ");
	String title = sc.nextLine();
	System.out.print("아이디 : ");
	String id = sc.next();
	
	BoardVO board = new BoardVO(title,id);
	if(boardService.insertBoard(board)) {
		System.out.println("[게시글 작성 성공]");
	}
	else {
		System.out.println("[게시글 작성 실패!]");
	}
	
	}

	private void printMenu() {
		System.out.println("====게시판관리====");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 조회");
		System.out.println("5. 뒤로가기");
		System.out.print("메뉴 입력 : ");
		
	}

}
