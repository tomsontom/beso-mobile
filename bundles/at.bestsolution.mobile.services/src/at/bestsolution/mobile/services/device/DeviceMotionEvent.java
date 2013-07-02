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

public class DeviceMotionEvent {
	public final DeviceAcceleration acceleration;
	public final DeviceAcceleration accelerationIncludingGravity;
	public final DeviceRotationRate rotationRate;
	public final Double interval;
	
	/**
	 * @param acceleration
	 * @param accelerationIncludingGravity
	 * @param rotationRate
	 * @param interval
	 */
	public DeviceMotionEvent(DeviceAcceleration acceleration, DeviceAcceleration accelerationIncludingGravity, DeviceRotationRate rotationRate, Double interval) {
		super();
		this.acceleration = acceleration;
		this.accelerationIncludingGravity = accelerationIncludingGravity;
		this.rotationRate = rotationRate;
		this.interval = interval;
	}
	
	
}
