package com.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesser implements BeanPostProcessor
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Initializing bean before init");
		if(beanName.startsWith("bean")) {
			DemoCustomInit init=(DemoCustomInit)bean;
			init.setMessage("New message from before initialization");
		}
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Initializing bean after init");
		if(beanName.startsWith("bean")) {
			DemoCustomInit init=(DemoCustomInit)bean;
			init.setMessage("New message from after initialization");
		}
		return bean;
	}
}
