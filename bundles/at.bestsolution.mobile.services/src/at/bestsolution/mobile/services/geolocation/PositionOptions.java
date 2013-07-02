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

public class PositionOptions {
	public final Boolean enableHighAccuracy;
	public final Long timeout;
	public final Long maximumAge;
	public boolean requireCoords;
	public boolean requestAddress;
	
	/**
	 * @param enableHighAccuracy
	 * @param timeout
	 * @param maximumAge
	 */
	public PositionOptions(Boolean enableHighAccuracy, Long timeout, Long maximumAge, boolean requireCoords, boolean requestAddress) {
		super();
		this.enableHighAccuracy = enableHighAccuracy;
		this.timeout = timeout;
		this.maximumAge = maximumAge;
		this.requireCoords = requireCoords;
		this.requestAddress = requestAddress;
	}
	
	public static PositionOptions timeout(long timeout) {
		return new PositionOptions(null, timeout, null, true, false);
	}
	
	public static PositionOptions timeoutAndAge(long timeout, long maximumAge) {
		return new PositionOptions(null, timeout, maximumAge, true, false);
	} 
}
