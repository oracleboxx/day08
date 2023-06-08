/* 매개변수 타입이 기본자료형이여서 
 * 
 * 
 */
class Vm10{
	void change(int y ) { //y 매개변수에 값이 전달됨
		System.out.println("y"+y);
		y=10;
		System.out.println("y"+y);
	}
}
public class Test10 {

	public static void main(String[] args) {
		Vm10 v = new Vm10();
		int x =7;
		System.out.println("메소드 호출전"+x);
		v.change(x);
		System.out.println("메소드 호출전"+x); 
		
				
	}

}
