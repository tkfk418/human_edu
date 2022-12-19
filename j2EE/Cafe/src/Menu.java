import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> alName;  //메뉴명
	private ArrayList<Integer> alPrice; //메뉴가격 목록
	
	
	Menu(){
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
		//d:\d\menu.txt를 찾고 열어서 메뉴명/가격을 읽어들인다
		File file = new File("d:\\d\\menu.txt");
		 
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
            while (sc.hasNextLine()) {
            	String line=sc.nextLine();
            	String[] token=line.split(",");
            	this.alName.add(token[0]);
            	this.alPrice.add(Integer.parseInt(token[1]));

//                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	String getName(int n) {
		return this.alName.get(n);
	}
	int getPrice(int n) {
		return this.alPrice.get(n);
	}
	private void save() {
		//alName,alPrice의 메뉴명과 가격을 menu.txt에 쓰기
		try{
			File file = new File("d:\\d\\menu.txt");
			if(!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file);
		PrintWriter writer = new PrintWriter(fw);
		for(int i=0; i<this.alName.size(); i++) {
			writer.write(this.alName.get(i)+","+this.alPrice.get(i)+"\n");
		}
		writer.close();
		}catch(IOException e) {
            e.printStackTrace();
        }
	}
	private void add(String name, int price) {
		//	alName, alPrice 에 name,price를 추가
		this.alName.add(name);
		this.alPrice.add(price);
	}
	private	void delete(int index) {
		//	alName, alPrice 양쪽에서 index 번호를 가진것을 제거
		this.alName.remove(index);
		this.alPrice.remove(index);
	}
	private void update(int index, String name, int price) {
		//	alName, alPrice 양쪽에서 index번호의 이름과 가격을 수정
		this.alName.set(index, name);
		this.alPrice.set(index, price);
		
	}
  void display() {
		//메뉴명과 가격을 표시
//		아메리카노, 2500
for(int i=0; i<this.alName.size(); i++) {		
		System.out.println((i+1)+"."+this.alName.get(i)+","+this.alPrice.get(i));
		}

    }
	void control() {

		Scanner s1 = new Scanner(System.in); //문자열 입력전용
		Scanner s2 = new Scanner(System.in); //숫자 입력전용
		

		
		while(true) {
		System.out.print("메뉴작업을 선택하시오[c:추가,r:목록표시,u:수정,d:삭제,'':종료]:");
		String instr= s1.nextLine();
			if(instr.equals("")) {
				//while exit, program terminated
				this.save();
				break;
			}else if(instr.equals("c") ) {
			//메뉴명 입력받고 
			//가격입력받고
			//menu.add()
				String s=s1.nextLine();
				int a=s2.nextInt();
				this.add(s, a);
			}else if(instr.equals("r") ) {
				this.display();
			}else if(instr.equals("u") ) {
				//수정할 메뉴의 인덱스 번호 입력받고
				//새 이름 입력받고
				//새 가격 입력받고
				//menu.update()
				int b=s2.nextInt();
				String t=s1.nextLine();
				int c=s2.nextInt();
				this.update(b,t, c);
			}else if(instr.equals("d") ) {
				//삭제할 메뉴의 인덱스번호 입력받고
				//menu.delete()
				int d=s2.nextInt();
				this.delete(d-1);
			}
		
		}
//		System.out.println("프로그램이 종료되었습니다.");
//		s1.close();
//		s2.close();
	}
	
}
