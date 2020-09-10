package com.ywu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author <a href="mailto:wuy@dydf.cn">天明</a>
 * @date 2020/8/21 15:32
 */
@Component
public class LoopService2 {

	@Autowired
	private LoopService1 loopService1;

}
