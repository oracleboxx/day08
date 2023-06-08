
public class Test03 {

	private String id;
	private String name;
	private String addr;
	
	//기본 생성자가 생략됨0
	
	public String getId() {
		return id;
	}


	public void setId(String id) { // 값 저장 메서드인 setter() 메서드
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}



	public static void main(String[] args) {
		Test03 t =new Test03();
		t.setId("eee");
		t.setName("lee");
		t.setAddr("서울");
		System.out.println(t.getAddr());
		System.out.println(t.getName());
		System.out.println(t.getId());
		
	}

}
