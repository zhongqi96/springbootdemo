package com.tiilii.exampaper.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AsyncServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月22日 下午10:46:14
 *
 */
@Service
public class AsyncServiceImpl implements AsyncService {
	private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tiilii.exampaper.services.AsyncService#executeAsync()
	 */
	@Async("asyncServiceExecutor")
	@Override
	public void executeAsync() {
		logger.info("start executeAsync");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("end executeAsync");

	}

}
