class Data13{
	int a;
}
class Value13{
	void change(Data13 d) {
		d.a = 1000;
	}
}



public class Test13 {

	public static void main(String[] args) {
		Data13 t13 =new Data13();
		Value13 v13 = new Value13();
		t13.a =100;
		System.out.println(t13.a);
		v13.change(t13);
		System.out.println(t13.a);
		
	}

}
