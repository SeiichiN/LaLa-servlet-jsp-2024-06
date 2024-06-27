package test;

import java.util.ArrayList;
import java.util.List;

import model.Human;

public class HumanTest2 {

	public static void main(String[] args) {
		List<Human> humanList = new ArrayList<>();
		humanList.add(new Human("湊 雄輔", 23));
		humanList.add(new Human("綾部 みゆき", 22));
		for (Human h : humanList) {
			System.out.println
			  (h.getName() + ":" + h.getAge());
		}

	}

}
