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
package at.bestsolution.mobile.services.robomvm.geolocation;

import at.bestsolution.mobile.services.Callback;
import at.bestsolution.mobile.services.geolocation.Geolocation;
import at.bestsolution.mobile.services.geolocation.Position;
import at.bestsolution.mobile.services.geolocation.PositionError;
import at.bestsolution.mobile.services.geolocation.PositionOptions;

public class RoboVMGeolocation implements Geolocation {

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#getCurrentPosition(at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public void getCurrentPosition(Callback<Position> successCallback) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#getCurrentPosition(at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public void getCurrentPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#getCurrentPosition(at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.geolocation.PositionOptions)
	 */
	@Override
	public void getCurrentPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback, PositionOptions options) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#watchPosition(at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public long watchPosition(Callback<Position> successCallback) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#watchPosition(at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public long watchPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#watchPosition(at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.Callback, at.bestsolution.mobile.services.geolocation.PositionOptions)
	 */
	@Override
	public long watchPosition(Callback<Position> successCallback, Callback<PositionError> errorCallback, PositionOptions options) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.geolocation.Geolocation#clearWatch(long)
	 */
	@Override
	public void clearWatch(long watchId) {
		// TODO Auto-generated method stub
		
	}

}
