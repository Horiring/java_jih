package day23.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수를 1부터 10까지 파일에 저장하는 코드를 작성하세요/
		//파일명은 output1.txt
		//파일에 쓰인 값 전부 읽음
		try(FileOutputStream fis = new FileOutputStream("output1.txt")){
			for(int i = 1; i<=10; i++) {
				fis.write(i);
			}
			System.out.println("File Writer success");
		} catch (FileNotFoundException e1) {
			System.out.println("File Not Found!!");
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(FileInputStream fis2 = new FileInputStream("output1.txt")){
			int data;
			while((data = fis2.read()) != -1 ) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(1);
		System.out.println((int)'1');
		
		try(FileWriter fw = new FileWriter("output2.txt")){
			for(int i = 0; i<=10; i++) {
				fw.write(i+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileReader fr = new FileReader("output2.txt")){
			char ch[] = new char[1024];
			int len;
			while((len = fr.read(ch)) != -1) {
				/*
				for(int i = 0; i<len; i++) {
					System.out.print(ch[i]);
				}*/
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
