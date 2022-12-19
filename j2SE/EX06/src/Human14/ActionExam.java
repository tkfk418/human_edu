package Human14;

public class ActionExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Action a1 = new Receive();
		a1.execute();
		System.out.println("----------------");
		
		String str1= "Human14.Receive";
		Class clazz1= Class.forName(str1);
		Action action1=(Action)clazz1.newInstance();
		action1.execute();
		System.out.println("----------------");
		
		String[] str2 = {"Human14.Receive,Human14.Send"};
		for (int i=0; i<str2.length; i++ ) {
			Class calzz2 = Class.forName(str2[i]);
			Action action2 = (Action) calzz2.newInstance();
			action2.execute();
		}
		
		

	}

}
