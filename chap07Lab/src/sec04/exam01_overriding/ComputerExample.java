package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r =10;
		Calculator calculator = new Calculator();  //�θ�ü
		System.out.println("������:"+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //�ڽ� ��ü
		System.out.println("������:" + computer.areaCircle(r));
		
	}

		
	
}
