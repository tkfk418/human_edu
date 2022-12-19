package ClassCastExp;

public class AnimalExam {

	public static void main(String[] args) {
		Animal animal = new Dog();
		//상속관계에서의 자동타입변환
		Dog d1 = (Dog)animal;
		//강제타입변환
		d1.run();
		
		Cat c1 = (Cat)animal;
		//animal은 DOG을 기반으로 자동타입변환 한 것이므로 animal 객체는 CAT의 객체로 강제타입변환 불가하다 
		// 그래서 ClassCastException이 발생한다. 이를 방지하기 위해 instanceof 기능을 수행하거나 예외에 대한 처리를 해주어야 한다.
	}

}
