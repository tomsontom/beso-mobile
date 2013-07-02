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

import at.bestsolution.mobile.services.Callback;

/**
 * W3C Geolocation API
 */
public interface Geolocation {
	void getCurrentPosition(Callback<Position> successCallback);
	void getCurrentPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback);
	void getCurrentPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback, PositionOptions options);

	long watchPosition(Callback<Position> successCallback);
	long watchPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback);
	long watchPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback, PositionOptions options);

	void clearWatch(long watchId);
}
