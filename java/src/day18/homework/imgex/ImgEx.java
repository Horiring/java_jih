package day18.homework.imgex;

import java.util.Scanner;

public class ImgEx {

	public static void main(String[] args) {
		/*
		파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요.
		이미지 확장자 : jpg, bmp, png(더 있지만 간단하게 3개만 체크)
		(package : day18.homework, file : ImgEx)
		input : dog.jpg
		dog.jpg : Image

		input : dog.exe
		dog.exe : Not image
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String str = sc.nextLine();
		
		if(str.contains("jpg")||str.contains("bmp")||str.contains("png")){
			System.out.println(str+" : Image");
		}
		else {
			System.out.println("Not image");
		}
		
		sc.close();
		

	}

}
