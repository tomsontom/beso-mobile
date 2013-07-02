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
package at.bestsolution.mobile.services.robomvm.device;

import at.bestsolution.mobile.services.Callback;
import at.bestsolution.mobile.services.device.DeviceMotionEvent;
import at.bestsolution.mobile.services.device.DeviceOrientation;
import at.bestsolution.mobile.services.device.DeviceOrientationEvent;

public class RoboVMDeviceOrientation implements DeviceOrientation {

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.device.DeviceOrientation#setOnDeviceOrientation(at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public void setOnDeviceOrientation(Callback<DeviceOrientationEvent> callback) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see at.bestsolution.mobile.services.device.DeviceOrientation#setOnDeviceMotion(at.bestsolution.mobile.services.Callback)
	 */
	@Override
	public void setOnDeviceMotion(Callback<DeviceMotionEvent> callback) {
		// TODO Auto-generated method stub
		
	}

}
