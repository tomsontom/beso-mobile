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
package at.bestsolution.mobile.services.screen;

import at.bestsolution.mobile.services.Callback;

public interface Screen {
	public enum Orientation {
		PORTRAIT_PRIMARY,
		PORTRAIT_SECONDARY,
		LANDSCAPE_PRIMARY,
		LANDSCAPE_SECONDARY
	}
	
	public Orientation getOrientation();
	
	public void setOnOrientationChange(Callback<Orientation> callback);
}
