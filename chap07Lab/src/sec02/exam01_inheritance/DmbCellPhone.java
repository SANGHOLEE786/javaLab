package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {

	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone (String model, String color, int channel) {
		this.model = model;      // �θ�Ŭ�����κ��� model, color ��� �޾Ҵ�.
		this.color = color;      // ���� ����, ��� ���� �ʵ�
		this.channel = channel;  // �ڽ��� �ʵ�
	}
	
	//�޼ҵ�
	void turnOndmb () {
		System.out.println("ä��"+ channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb (int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffdmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
	
	
}
