package com.feedwheel.service.impl;

import com.feedwheel.service.AnotherService;

public class AnotherServiceImpl implements AnotherService {
	@Override
	public String provideName() {
		return "foo";
	}
}