package miniproject02;

public class Child {
	int marbleCnt; 
	
	public Child(int marbleCnt) {
		if (marbleCnt>=0) {
			this.marbleCnt=marbleCnt;
		}
		else {
			this.marbleCnt=0;
		}
	}
	public void winMarble(Child child, int cnt) {
		int winnerGetMarble;
	
		if(child.marbleCnt>=cnt) {
			winnerGetMarble = cnt;
		}
		else {
			winnerGetMarble=child.marbleCnt;
		}
		this.marbleCnt+= winnerGetMarble;
		child.loseMarble(winnerGetMarble);
	}
	
	public void loseMarble(int lostCnt) {
	this.marbleCnt-=lostCnt;
	}
	
	public void checkMarble(Child child) {
		System.out.println("-----------------------");
		System.out.println("어린이1 갖고 있는 구슬 개수 : " + this.marbleCnt);
		System.out.println("어린이2 갖고 있는 구슬 개수 : " + child.marbleCnt);
	}
	


}
