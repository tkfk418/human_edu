package Human17;

public class MathRandomExam {

	public static void main(String[] args) {
		//Math.random() 0~1사이의 난수
		//0<=Math.random()<1
		//0*6<=Math.random()*6<1*6  ==>0~6
		//0*6+1<=Math.random+1()*6<1*6+1 ==>1~7
		//현상태에서 소수점 버림
		double temp1= Math.random()*6+1;
		double num1=Math.floor(temp1);    //내림값으로 소수점 버림
		System.out.printf("주사위의 눈 : %d \n",(int)num1);
		
		//로또번호(1~45 사이의 수)
		System.out.printf("1~45의 숫자 : %d \n",(int)Math.floor(Math.random()*45+1));
		
		
	}

}
