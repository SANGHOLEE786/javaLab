package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r =10;
		Calculator calculator = new Calculator();  //부모객체
		System.out.println("원면적:"+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //자식 객체
		System.out.println("원면적:" + computer.areaCircle(r));
		
	}

		
	
}
