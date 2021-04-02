package sec02.exam01_inheritance;

import java.util.Iterator;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone 객체 생성
		//타입    		변수     		new         	연산자로 생산자 호출 
		DmbCellPhone dmbCellPhone= new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델"+dmbCellPhone.model);
		System.out.println("색상"+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널"+dmbCellPhone.channel);
				
		//CellPhone으로부터 상속 받은 메소드 필드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.recieveVoice("안녕하세요!");
		dmbCellPhone.sendVoice("좋은아침입니다");
		dmbCellPhone.turnOffdmb();

		//DmbCellPhone 메소드
		dmbCellPhone.turnOndmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffdmb();
		
		
		
	}

}
