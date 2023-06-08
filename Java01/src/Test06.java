
public class Test06 {
	  
		public void a() {
			System.out.println("오버로딩");
	}
		public String a(Integer a) {
			System.out.println("오버로딩2");
			return a.toString();
		}
		
}
	public static void main(String[] args) {
		Test06 T = new Test06();
	T.a() ;
		System.out.println(T.a(3));
	}


