package com.nebo.nb_spider.service.impl;

import com.nebo.nb_spider.entity.Page;
import com.nebo.nb_spider.service.IStoreService;
/**
 * 数据存储实现类
 * @author NeboFeng
 *
 */
public class ConsoleStoreService implements IStoreService {

	public void store(Page page) {
		System.out.println("allnumber="+page.getAllnumber());
		System.out.println("commentnumber="+page.getCommentnumber());
		System.out.println("supportnumber="+page.getSupportnumber());
	}

}