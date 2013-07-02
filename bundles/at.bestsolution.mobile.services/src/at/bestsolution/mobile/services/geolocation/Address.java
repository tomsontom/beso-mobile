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

public class Address {
	public final String country;
	public final String region;
	public final String county;
	public final String city;
	public final String street;
	public final String streetNumber;
	public final String premises;
	public final String postalCode;
	
	/**
	 * @param country
	 * @param region
	 * @param county
	 * @param city
	 * @param street
	 * @param streetNumber
	 * @param premises
	 * @param postalCode
	 */
	public Address(String country, String region, String county, String city, String street, String streetNumber, String premises, String postalCode) {
		super();
		this.country = country;
		this.region = region;
		this.county = county;
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
		this.premises = premises;
		this.postalCode = postalCode;
	}
	
	
}
