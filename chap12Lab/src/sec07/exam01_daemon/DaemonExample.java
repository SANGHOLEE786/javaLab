package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // 작업스레드
		autoSaveThread.setDaemon(true); //작업스레드를 데몬스레드로 만든다.// 작업스레드는 메인스레드와 관계없이 자신의 일을 계속 수행한다.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
