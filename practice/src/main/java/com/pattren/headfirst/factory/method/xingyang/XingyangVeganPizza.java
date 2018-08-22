package com.pattren.headfirst.factory.method.xingyang;

import org.apache.log4j.Logger;

import com.pattren.headfirst.factory.method.Pizza;

public class XingyangVeganPizza implements Pizza {

	private Logger LOGGER = Logger.getLogger(getClass());

	@Override
	public void bake() {
		LOGGER.info("200度烤20分钟");
	}

	@Override
	public void cut() {
		LOGGER.info("切块");
	}

	@Override
	public void box() {
		LOGGER.info("打包");
	}

}
