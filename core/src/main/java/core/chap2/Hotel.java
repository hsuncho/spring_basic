package core.chap2;

public class Hotel {
	
	//제어의 역전(Inversion of Control): 객체 생성의 제어권을 외부로 넘긴다.
	//의존성 주입(DI): 외부에서 생성된 객체를 주입받는 개념
	
	private Restaurant restaurant;
	
	private Chef headChef;
	
	public Hotel() {}
	
	//생성자 주입
	public Hotel(Restaurant restaurant, Chef headChef) {
		super();
		this.restaurant = restaurant;
		this.headChef = headChef;
	}
	
	//setter 주입
	public void setHeadChef(Chef headChef) {
		this.headChef = headChef;
	}
	
	//setter 주입
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void inform() {
		System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n"
				, restaurant.getClass().getSimpleName()
				, headChef.getClass().getSimpleName());
		restaurant.order();
	}
	
}
