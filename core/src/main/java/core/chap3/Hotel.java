package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hotel {
	
	private Restaurant restaurant;
	
	private Chef headChef;
	
	public Hotel() {}
	
	public Hotel(Restaurant restaurant, Chef headChef) {
		super();
		this.restaurant = restaurant;
		this.headChef = headChef;
	}
	
	/*
    # @Autowired
    - 객체를 자동 주입할 때 사용하는 아노테이션입니다.
    - 스캔 명령을 통해 객체를 찾아 주입하는데, 타입 이름으로 검색합니다.
    - 타입을 찾아내지 못하면 이름(id 속성값)을 통해 검색합니다.
    - 생성자, 메서드, 필드에 적용 가능합니다.
    
    # @Qualifier("bean id")
    - Autowired를 사용할 때 동일 타입의 빈이 여러 개 있는 경우
    어떤 빈을 주입해야 하는 지 선택해 주는 추가 아노테이션 입니다.
    */
	
	@Autowired
	@Qualifier("asianChef") //넣고자 하는 bean의 아이디 -> 이거 주입해줘
	public void setHeadChef(Chef headChef) {
		this.headChef = headChef;
	}
	
	@Autowired
	@Qualifier("asianRes")
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
