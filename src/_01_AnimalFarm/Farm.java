package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Chicken());
		farm.add(new Cow());
		farm.add(new Sheep());
		farm.add(new Pig());
		farm.add(new Chicken());
		farm.add(new Sheep());
		for(int i = 0; i < 6; i++) {
			farm.get(i).makeNoise();
		}
	}
}
