package sec02.exam01_inheritance;

import java.util.Iterator;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone ��ü ����
		//Ÿ��    		����     		new         	�����ڷ� ������ ȣ�� 
		DmbCellPhone dmbCellPhone= new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��"+dmbCellPhone.model);
		System.out.println("����"+dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��"+dmbCellPhone.channel);
				
		//CellPhone���κ��� ��� ���� �޼ҵ� �ʵ�
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.recieveVoice("�ȳ��ϼ���!");
		dmbCellPhone.sendVoice("������ħ�Դϴ�");
		dmbCellPhone.turnOffdmb();

		//DmbCellPhone �޼ҵ�
		dmbCellPhone.turnOndmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffdmb();
		
		
		
	}

}
