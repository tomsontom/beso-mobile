/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.mobile.services.geolocation;

public class Coordinates {
	public final double latitude;
	public final double longitude;
	public final Double altitude;
	public final double accuracy;
	public final Double altitudeAccuracy;
	public final Double heading;
	public final Double speed;
	public final Double verticalSpeed;
	
	/**
	 * @param latitude
	 * @param longitude
	 * @param altitude
	 * @param accuracy
	 * @param altitudeAccuracy
	 * @param heading
	 * @param speed
	 */
	public Coordinates(double latitude, double longitude, Double altitude, double accuracy, Double altitudeAccuracy, Double heading, Double speed, Double verticalSpeed) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.accuracy = accuracy;
		this.altitudeAccuracy = altitudeAccuracy;
		this.heading = heading;
		this.speed = speed;
		this.verticalSpeed = verticalSpeed;
	}
	
	
}
