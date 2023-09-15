package core.chap2;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
	
	private Chef chef;
	
	private Course course;
	
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
//	
//	public void setCourse(Course course) {
//		this.course = course;
//	}
	
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
