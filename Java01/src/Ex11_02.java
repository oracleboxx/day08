class can {
	String name;
	int price;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

}
public class Ex11_02 {
	
	
	

	public static void main(String[] args) {
		can C = new can();
		can B = new can();
	C.setName("커피");
	C.setPrice(150);
	
	B.setName("비타500");
	B.setPrice(500);
	System.out.println("출력: 자판기 => 제품목록:");
	System.out.println(C.getName()+":"+C.getPrice()+"원");
	System.out.println(B.getName()+":"+B.getPrice()+"원");
	}
	

}
