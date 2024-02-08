package com.bustickets;

public class RedBus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SearchForBus bs = new SearchForBus();
		bs.openPage();
		bs.searchingForBus();
		bs.close();
		
		}
}