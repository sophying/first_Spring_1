package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		
		CollectionBean collectionBean = (CollectionBean) factory.getBean("collectionBean");
		
		Set<String> addressList = collectionBean.getAddressList();
//		List<String> addressList = collectionBean.getAddressList();
		
		for (String address : addressList) {
			System.out.println(address.toString());
		}
		
	}

}
