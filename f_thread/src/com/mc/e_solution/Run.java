package com.mc.e_solution;

public class Run {

	public static void main(String[] args) {
		School school = new School();
		Home home = new Home(school);
		school.setHome(home);
		
		Bottle bottle = new Bottle();
		Thread coffee = new Thread(new CoffeeThread(bottle));
		Thread soi = new Thread(new SoiThread(bottle));
		
		coffee.setName("커피소년");
		soi.setName("간장소녀");
		
		coffee.start();
		soi.start();
	}

}
