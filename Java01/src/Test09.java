 class MyData09{
	int year =2023;
	int month = 5;
	int day = 31;
}
public class Test09 {

	public static void main(String[] args) {
		MyData09 d = new MyData09();
		MyData09 t = d;
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		t = new MyData09();
		t.year = 2023; t.month = 6; t.day = 12;
		System.out.println(t.year+":"+t.month+":"+t.day);
		System.out.println(t.year+":"+t.month+":"+t.day);
		
		System.out.println("=====================");
		
		d = t;
		d.year = 2023; d.month = 6; d.day = 12;
		System.out.println(d.year+":"+d.month+":"+d.day);
		System.out.println(d.year+":"+d.month+":"+d.day);
		
		
	}

}
