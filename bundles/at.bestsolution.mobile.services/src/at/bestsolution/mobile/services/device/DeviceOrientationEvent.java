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

public class DeviceOrientationEvent {
	public final Double alpha;
	public final Double beta;
	public final Double gamma;
	public final boolean absolute;
	
	/**
	 * @param absolute
	 * @param alpha
	 * @param beta
	 * @param gamma
	 */
	public DeviceOrientationEvent(boolean absolute, Double alpha, Double beta, Double gamma) {
		super();
		this.alpha = alpha;
		this.beta = beta;
		this.gamma = gamma;
		this.absolute = absolute;
	}
	
	
}
