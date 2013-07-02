/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.mobile.services.geolocation;

public class PositionError {
	public enum Code {
		PERMISSION_DENIED,
		POSITION_UNAVAILABLE,
		TIMEOUT
	}
	public final Code code;
    public final String message;
    
	/**
	 * @param code
	 * @param message
	 */
	public PositionError(Code code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
    
    
}
