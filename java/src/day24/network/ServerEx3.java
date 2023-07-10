package day24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 {

	public static void main(String[] args) {
		int port = 5001;//1. 포트번호 지정
		
		//2. ServerSocket 생성
		try(ServerSocket serverSocket = new ServerSocket(port);
				){
			while(true) {
				//3.연결 대기 후 요청이 오면 수락
				System.out.println("[Waiting...]");
				Socket socket = serverSocket.accept();
				System.out.println("[Connect!]");
				//4. 작업
				//연결한 클라이언트와 읽고 쓰기를 함.
				//서버와 클라이언트의 기능이 다르면 Server 클래스를 추가해서
				//아래부분을 Client가 아닌 Server로 수정
				//read()/send()순서 중요하지 않음. 어차피 스레드를 이용해서
				Client client = new Client(socket);
				client.read();
				client.send();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
