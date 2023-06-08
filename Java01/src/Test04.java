class Tv03{
	String color; 
	int channel; 
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class Test04 { 

	public static void main(String[] args) {
		Tv03 tv1 =new Tv03();
		Tv03 tv2= new Tv03();

		tv1.channel =8;
		tv2 = tv1;
		
		
		
		
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		
	}

}
