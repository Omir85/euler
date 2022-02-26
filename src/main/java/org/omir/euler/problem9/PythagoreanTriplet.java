package org.omir.euler.problem9;

import lombok.Data;

@Data
public class PythagoreanTriplet {

	public PythagoreanTriplet(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double a;

	private double b;

	private double c;

}
