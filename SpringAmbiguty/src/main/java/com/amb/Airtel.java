package com.amb;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		return "youe calling from the airtel";
	}
}
 