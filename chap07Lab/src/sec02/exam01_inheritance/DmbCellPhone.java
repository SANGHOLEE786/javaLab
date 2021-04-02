package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//생성자
	DmbCellPhone (String model, String color, int channel) {
		this.model = model;      // 부모클래스로부터 model, color 상속 받았다.
		this.color = color;      // 위와 동일, 상속 받은 필드
		this.channel = channel;  // 자신의 필드
	}
	
	//메소드
	void turnOndmb () {
		System.out.println("채널"+ channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb (int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffdmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
}
