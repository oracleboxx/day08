/*매개 변수 타입이 참조 레퍼런스 자료형이여서 주소값에 의한 전달방식 예제
 * 
 * 
 * 
 */
class MyDate11{
	int year = 2022;
	int month = 12;
	int day = 31;
}
class 참조클래스{
	void changeDate(MyDate11 t) {
		t.year =2023; t.month = 6; t.day =12;
	}
}
public class Test11 {

	public static void main(String[] args) {
		참조클래스 rm = new 참조클래스();
		MyDate11 d = new MyDate11();
		System.out.println(d.year+":"+d.month+":"+d.day);
		rm.changeDate(d);
		System.out.println("changeDate 메서드 호출 후:"+d.year+":"+d.month+":"+d.day);
	}

}
