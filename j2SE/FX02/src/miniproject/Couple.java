package miniproject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.scene.chart.PieChart;

public class Couple {
	public int money;
	public Expenses [] cart = new Expenses[100];
	public int index;
	
	
	public Couple(int money) {
		this.money=money;
		this.index=0;
		
	}
	
	public void buy(Expenses expenses) { 
		if(this.money-expenses.price<0) {
			System.out.println("예산 초과입니다. 예산을 변경하거나 데이트 비용을 줄이는 것을 권장드립니다.");
			this.money=this.money-expenses.price;
			System.out.printf("현재잔액:%d / 지출(%s):%d￦ \n", this.money,expenses.name,expenses.price);
			this.add(expenses);
		}
		else {
		    this.money=this.money-expenses.price;
			System.out.printf("현재잔액:%d / 지출(%s):%d￦ \n", this.money,expenses.name,expenses.price);
			this.add(expenses);

		}
	 
		
	}
	public void add (Expenses expenses) {
		this.cart[index] = expenses;
		System.out.printf("cart[%d]: %s(%d￦) \n", this.index, expenses.name,expenses.price);
		this.index= this.index+1;
	}
	public void summary() {
		String expenditureList = "";
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			if(this.cart[i]==null) {
				break;
			}
			expenditureList = expenditureList+this.cart[i].name+", ";
		sum= sum+this.cart[i].price;	
		}
		System.out.println ("-----------------------------------");
		Date now = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		System.out.printf("사용처: %s \n", expenditureList);
		System.out.printf("총사용금액: %d￦ \n", sum);
		System.out.printf("현재잔고: %d￦ \n", this.money);
	}
//	public int sum() {
//		int sum = 0;
//		for(int i=0; i<cart.length; i++) {
//			if(this.cart[i]==null) {
//				break;
//			}
//			sum= sum+this.cart[i].price;		
//	}
//		return sum;
//	}
	public List cartPrint() {
		List a = new ArrayList();
		List b1 = new ArrayList();
		
		for(int i=0; i<cart.length; i++){
			if(this.cart[i]==null) {
				break;
			}
			if (a.contains(cart[i].getClass().toString())) {
				continue;
			}
			else {
				a.add(cart[i].getClass().toString());
			}
		}

		for (int z=0 ; z<a.size() ; z++) {
			String b = (String)a.get(z);
			int sum = 0;
			for(int i=0; i<cart.length; i++){
				if(this.cart[i]==null) {
					break;
				}
				if(cart[i].getClass().toString().equals(b)) {
					System.out.println(cart[i].name+" : "+cart[i].price+"￦");
				}
				if(cart[i].getClass().toString().equals(b)) {
					sum= sum+cart[i].price;
				}	
			}
			System.out.println(b + ": "+sum+"￦" );
			b1.add(new PieChart.Data(b+ ": "+sum, sum));


		}
		return b1;
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

