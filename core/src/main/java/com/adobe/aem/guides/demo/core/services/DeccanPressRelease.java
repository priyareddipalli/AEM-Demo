package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class DeccanPressRelease {
    
    private static final Logger LOG = LoggerFactory.getLogger(DeccanPressRelease.class);
    @Reference
    DeccanService has;
    
    @Activate
    public void activate() 
    {
        String result=has.printdata();
        LOG.info("DeccanPressRelease activate() started");
       // LOG.info("Result is"+result);
       LOG.info("Result{}",result);
        
    }

    
    @Deactivate
    public void deactivate() {
        LOG.info("DeccanPressRelease deactivate() ended");
    }

    @Modified
    public void modify() {
        LOG.info("DeccanPressRelease modified() started");
    }

    
}
