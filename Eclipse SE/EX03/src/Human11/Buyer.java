package Human11;

public class Buyer {
	public int money;
	public Product[] cart = new Product[10];
	public int index;
	
	public Buyer(int money) {
		this.money=money;
		this.index=0;
	}
	
	public void buy(Product product) { // 자동타입변환
		//Product product = tv 
		//Product product = new TV(tvPrice, "Tv")
		if(this.money-product.price<0) {
			System.out.println("잔고가 부족하여 추가구매가 어렵습니다.");
			System.out.printf("현재잔액:%d / 제품(%s):%d \n", this.money,product.name,product.price);
				return;
		}
		else {
		this.money=this.money-product.price;
		this.add(product);
		}
	}
	public void add (Product product) {
		this.cart[index] = product;
		System.out.printf("cart[%d]: %s(%d) \n", this.index, product.name,product.price);
		this.index= this.index+1;
	}
	public void summary() {
		String itemList="";
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			if(this.cart[i]==null) {
				break;
			}
			itemList = itemList+this.cart[i].name+", ";
			//this.cart[i]는 product 객체
		sum= sum+this.cart[i].price;	
		}
		System.out.printf("구입한물건: %s \n", itemList);
		System.out.printf("총사용금액: %d \n", sum);
		System.out.printf("현재잔고: %d \n", this.money);
	}
}