package com.tiilii.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import com.tiilii.util.WebServiceClient;


public class WebContextListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		//WebServiceResourceClient.start();
    	//WebServiceMessageClient.start();
    	WebServiceClient.start();
		
	}

}
