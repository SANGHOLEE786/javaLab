package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // �۾�������
		autoSaveThread.setDaemon(true); //�۾������带 ���󽺷���� �����.// �۾�������� ���ν������ ������� �ڽ��� ���� ��� �����Ѵ�.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("���� ������ ����");
	}
}
