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
package at.bestsolution.mobile.services.device;

import at.bestsolution.mobile.services.Callback;

public interface DeviceOrientation {
	public void setOnDeviceOrientation(Callback<DeviceOrientationEvent> callback);
	public void setOnDeviceMotion(Callback<DeviceMotionEvent> callback);
}