package com.test;

import org.apache.log4j.Logger;

public class Test {

	private static Logger logger=Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.info("info----信息");
		logger.debug("debug--信息");
		logger.error("錯誤--信息");
	}
}
