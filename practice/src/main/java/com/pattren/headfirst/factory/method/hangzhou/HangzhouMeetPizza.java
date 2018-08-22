package com.pattren.headfirst.factory.method.hangzhou;

import org.apache.log4j.Logger;

import com.pattren.headfirst.factory.method.Pizza;

public class HangzhouMeetPizza implements Pizza {

	private Logger LOGGER = Logger.getLogger(getClass());

	@Override
	public void bake() {
		LOGGER.info("250度烤30分钟");
	}

	@Override
	public void cut() {
		LOGGER.info("切成很多小块");
	}

	@Override
	public void box() {
		LOGGER.info("打包");
	}

}
