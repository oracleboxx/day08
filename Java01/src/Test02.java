class Member01{
	String name;
	int age;
	/*
	 * 1. class 키워드로 클래스명 Member01을 정의
	 * 2. 클래스명 첫글자는 관례적으로 영문대문자로 한다.
	 * 3. 
	 */
	
	
}
public class Test02 {
 int x ;

 
	
	
	
	
	public static void main(String[] args) {
		Member01 men = new Member01();
		Test02 t = new Test02();
				
		men.name = "펭귄";
		men.age = 12;
		t.x = 10;
		System.out.print("이름 : "+men.name+"  ,  ");
		System.out.println("이름 :"+men.age);
		System.out.println("x: "+t.x);
		/*1.System.out은 모니터 출력장치
		 * 2.print()는 출력하라는 메서드  ,ln은 줄바꿈
		 * 3.;은 한문장 끝을 의미함. + 는 문자열 연산 기호
		 */
	}

}
