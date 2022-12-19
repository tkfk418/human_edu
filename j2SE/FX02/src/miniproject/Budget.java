package miniproject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Budget extends Application {
	private static Scanner sc = new Scanner(System.in);
	static List z1;
	@Override
	public void start(Stage primaryStage) throws Exception {
		 Scene scene = new Scene(new Group());
		 primaryStage.setTitle("데이트통장 사용내역");
		 primaryStage.setWidth(500);
		 primaryStage.setHeight(500);
	 
	        ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(z1);
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("데이트통장 사용내역");

	        ((Group) scene.getRoot()).getChildren().add(chart);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println ("************** 데이트 통장 ***************");
		System.out.println ("한 달 동안의 데이트 예산을 입력하세요");
		System.out.println ("-----------------------------------");
		int money = sc.nextInt();
		Couple cp1 = new Couple(money);
		boolean run = true;
		while (run) {
			System.out.println ("-----------------------------------");
			System.out.println ("1.지출입력 / 2.잔액조회 /3.추가 예금/4.항목별 합계 / 5.종료");
			System.out.println ("-----------------------------------");
			System.out.print(">선택?");
			
			int selectNo = sc.nextInt();
			
			 if (selectNo == 1) {
				System.out.println ("-----------------------------------");
				System.out.println ("1.식비 / 2.문화생활 / 3.쇼핑 /4.교통비 / 5.여행 / 6.기타 ");
				System.out.println ("-----------------------------------");
				System.out.print(">선택?");
				
				int pushNo = sc.nextInt();
				if (pushNo == 1) {
					System.out.print("식당 또는 카페 이름을 입력하세요");
						sc.nextLine();
						 String name= sc.nextLine();
						System.out.print("지출 비용을 입력하세요");
						int price= sc.nextInt();
						Food food = new Food(name,price); 
						cp1.buy(food);
						cp1.summary();
				}
				
				else if (pushNo == 2) {
					
					System.out.print("문화생활 내역을 입력하세요 ");
					 String name=  sc.next();
					System.out.print("지출 비용을 입력하세요");
					int price= sc.nextInt();
					Cultural cultural = new Cultural(name,price);
					cp1.buy(cultural);
					cp1.summary();
					
					}
					
				
				else if (pushNo == 3) {
				
					System.out.print("구입항목을 입력하세요");
					String name =sc.next() ;
					System.out.print("지출 비용을 입력하세요");
					int price = sc.nextInt();
					Shopping shopping = new Shopping(name,price);
					cp1.buy(shopping);
					cp1.summary();
				}
				else if (pushNo == 4) {
				
					System.out.print("교통비 지출내역을 입력하세요");
					String name =  sc.next();
					System.out.print("지출 비용을 입력하세요");
					int price = sc.nextInt();
					Transportation transportation = new Transportation(name,price);
					cp1.buy(transportation);
					cp1.summary();
				}
				else if (pushNo == 5) {
					System.out.print("여행에서의 지출내역을 입력하세요");
					String name =  sc.next();
					System.out.print("지출 비용을 입력하세요");
					int price = sc.nextInt();
					Travel travel = new Travel(name,price);
					cp1.buy(travel);
					cp1.summary();
					
				}
				else if (pushNo == 6) {
					System.out.print("기타 지출내역을 입력하세요");
					String name = sc.next();
					System.out.print("지출 비용을 입력하세요");
					int price = sc.nextInt();
					Etc etc = new Etc(name,price);
					cp1.buy(etc);
					cp1.summary();
				}
			}
			else if (selectNo == 2) {
				cp1.summary();
			}
			else if (selectNo == 3) {
				System.out.print ("입금액을 입력해주세요 : ");
				int deposit = sc.nextInt();
				int currentBalance= cp1.money;
				System.out.println("이전잔고 : "+ currentBalance);
				int nextBalance = currentBalance + deposit;
				cp1.money =nextBalance;
				System.out.println("현재잔고 : " + nextBalance);
			}
			else if (selectNo == 4) {
				z1 = cp1.cartPrint();
				
			}
			else if (selectNo == 5) {
				run = false;
			}
	
		}
		launch(args);
		
		
	}
}