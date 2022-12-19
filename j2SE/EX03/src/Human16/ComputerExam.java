package Human16;

public class ComputerExam {

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.turnOn();
		dt.typing();
		dt.display();
		dt.turnOff();
		
		
		MyNotebook nb= new MyNotebook();
		nb.turnOn();
		nb.typing();
		nb.display();
		nb.turnOff();

	}

}
