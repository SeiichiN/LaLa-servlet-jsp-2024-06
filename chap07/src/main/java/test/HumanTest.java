package test;

import model.Human;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("湊 雄輔");
		h.setAge(23);
		Human h2 = new Human("綾部 みゆき", 22);
		System.out.println
		  (h.getName() + ":" + h.getAge());
		
		

	}

}
