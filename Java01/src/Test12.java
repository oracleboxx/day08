// change() 메서드 매개변수 타입이 기본자료형이여서 값에 의한 전달


class Data12{
	int x;
	
	
	
}
class Value12{
	void change(int x ) {
		System.out.println("x:"+x);
		x =1000;
		System.out.println("x:"+x);
	}
}


public class Test12 {

	public static void main(String[] args) {
			Data12 d = new Data12();
			Value12 v = new Value12();
			d.x=100;
			System.out.println("change 메서드 호출 전 :"+d.x);
			v.change(d.x);
			System.out.println("호출 후 :"+d.x);
	}

}
