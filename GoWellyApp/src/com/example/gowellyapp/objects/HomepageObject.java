package com.example.gowellyapp.objects;

import android.media.Image;

/**
 * An instance is a pair of bus and stop.
 * An instance will display the three next times a bus gets to the stop
 * @author godineemma
 *
 */
public class HomepageObject {

	// data
	private String routeId;
	private String favouriteStop;
	private String time0;
	private String time1;
	private String time2;

	// imagery
	private Image background;
	private Image busRouteImage;


	public HomepageObject(String routeId, String favouriteStop) {
		super();
		this.routeId = routeId;
		this.favouriteStop = favouriteStop;

		findClosestTimes();
	}

	private void findClosestTimes(){
		// using scraper, find the times the bus will arrive at the stop
		time0 = "now";
		time1 = "soon";
		time2 = "later";
	}



}
