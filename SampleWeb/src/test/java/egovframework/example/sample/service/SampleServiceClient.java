package egovframework.example.sample.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.AdvancedSampleServiceImpl;

public class SampleServiceClient {
	public static void main(String[] args) throws Exception {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"egovframework/spring/context-common.xml");
		
		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 Lookup한다.
		AdvancedSampleServiceImpl sampleService = (AdvancedSampleServiceImpl) container.getBean("sampleService");
		sampleService.addSample();
		sampleService.getSampleList();
		
		// 3. Spring 컨테이너를 종료한다.
		container.close();
	}
}
