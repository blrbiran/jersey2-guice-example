package com.feedwheel.service.impl;

import com.feedwheel.service.AnotherService;
import com.feedwheel.service.SimpleService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SimpleServiceImpl implements SimpleService {	
	@Inject
	AnotherService anotherService;

	@Override
	public String getMessage() {
		return "Howdy" + " " + anotherService.provideName();
	}
}