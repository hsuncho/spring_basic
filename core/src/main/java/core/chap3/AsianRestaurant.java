package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
	
	@Autowired
	@Qualifier("asianChef")
	private Chef chef;
	
	@Autowired
	@Qualifier("sushi")
	private Course course;
	
//	@Autowired
//	public AsianRestaurant(@Qualifier("asianChef") Chef chef, @Qualifier("sushi") Course course) {
//		super();
//		this.chef = chef;
//		this.course = course;
//	}
	
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}

}
