package com.feedwheel.guiceconfig;

import com.google.inject.AbstractModule;
import com.feedwheel.service.AnotherService;
import com.feedwheel.service.SimpleService;
import com.feedwheel.service.impl.AnotherServiceImpl;
import com.feedwheel.service.impl.SimpleServiceImpl;

public class GuiceModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(SimpleService.class).to(SimpleServiceImpl.class);
		bind(AnotherService.class).to(AnotherServiceImpl.class);
	}
}