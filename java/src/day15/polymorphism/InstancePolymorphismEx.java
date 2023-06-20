package day15.polymorphism;

public class InstancePolymorphismEx {

	public static void main(String[] args) {
		//RemoteControl remocon = new RemoteControl();
		/*
		TV tv = new TV();
		AirConditioner aircons[] = new AirConditioner[2];
		Radio radios [] = new Radio[3];
		
		
		for(int i = 0 ; i<aircons.length; i++) {
			aircons[i] = new AirConditioner();
		}
		for(int i = 0 ; i<radios.length; i++) {
			radios[i] = new Radio();
		}
		remocon.turnOn(tv);//매개변수의 다형성
		for(AirConditioner aircon : aircons) {
			remocon.turnOn(aircon);
		}
		for(Radio radio : radios) {
			remocon.turnOn(radio);
		}
		*/
		//포함 다형성 예제, 객체 다형성 예제
		RemoteControl1 remocon1 = new RemoteControl1();
		int tvCount = 1, airconCount = 2 , radioCount = 3;
		int total = tvCount + airconCount+radioCount;
		HomeAppliances homeAppliances[] = new HomeAppliances[total];
		int count = 0; //현재 만들어진 제품 대수
		//tv 1대 생성
		for(int i = 0; i< tvCount;i++) {
			homeAppliances[count++]= new TV1();//업캐스팅
		}
		//aircon 2대 생성
		for(int i = 0; i< airconCount;i++) {
			homeAppliances[count++]= new AirConditioner1();//업캐스팅
		}
		//라디오 3대 생성
		for(int i = 0; i< radioCount;i++) {
			homeAppliances[count++]= new Radio1();//업캐스팅
		}
		for(HomeAppliances homeAppliance : homeAppliances) {
			remocon1.turnOn(homeAppliance);
		}
		//모든 라디오의 전원을 끔
		for(HomeAppliances homeAppliance : homeAppliances) {
			//라디오로 다운캐스팅이 가능한 객체만 끔 = > 라디오만 끔
			if(homeAppliance instanceof Radio1) {
			remocon1.turnOff(homeAppliance);
			}
		}
		
		
	}

}

class RemoteControl {
	public void turnOn(TV tv) {
		tv.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}

	public void turnOn(AirConditioner aircon) {
		aircon.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}

	public void turnOn(Radio radio) {
		radio.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
}

class TV {
	boolean power;
	int channel;

	void turnOn() {
		power = true;
	}
}

class AirConditioner {
	boolean power;
	double CurrentTemperature;
	double desiredTemperature;

	void turnOn() {
		power = true;
	}
}

class Radio {
	boolean power;
	double frequency;

	void turnOn() {
		power = true;
	}
}

class HomeAppliances {
	boolean power;

	void turnOn() {
		power = true;
	}

	void turnOff() {
		power = false;
	}
}

class RemoteControl1 {
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		System.out.println("전원이 켜졌습니다.");

	}

	public void turnOff(HomeAppliances appliance) {
		appliance.turnOff();
		System.out.println("전원이 꺼졌습니다.");
	}
}

class TV1 extends HomeAppliances {
	int channel;
}

class AirConditioner1 extends HomeAppliances {
	double CurrentTemperature;
	double desiredTemperature;
}

class Radio1 extends HomeAppliances {
	double frequency;
}