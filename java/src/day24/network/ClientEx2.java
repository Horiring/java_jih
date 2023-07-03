package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx2 {

	public static void main(String[] args) {
		int port = 5001;//1.포트번호 설정
		String ip = "192.168.30.208";//1-1 서버 IP설정
		Socket socket = new Socket();//2. 소켓 생성
		try{
			//3. 서버에게(Ip,posrt) 연결 요청
			socket.connect(new InetSocketAddress(ip,port));;
			Thread sendThread = new Thread(()->{
				Scanner sc =new Scanner(System.in);
				try {
					//서버에서 클라이언트로 전송하는 작업을 무한히 반복. socket 연결이 끊길때까지
					//=> 클라이언트가 접속 종료를 할 떄까지
					while(true) {
					//콘솔에서 입력
					String str = sc.nextLine();
					//입력받은 문자열을 전송하기 위해 byte로 변환
					byte [] bytes = str.getBytes();
					OutputStream os = socket.getOutputStream();
					//변환된 byte들을 전송
					os.write(bytes);
					os.flush();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			});
			//4-2 클라이언트에서 보낸 데이터를 읽어오는 스레드 생성 및 실행
			sendThread.start();
			Thread readThread =	new Thread(()->{
				try {
					InputStream is=socket.getInputStream();
					//데이터를 받는 작업을 무한히 반복. 클라이언트 연결이 끊길 때까지
					while(true) {
					byte [] bytes = new byte[1024];
					is.read(bytes);
					String str=new String(bytes);
					System.out.println("client : " + str);
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			});
			readThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
