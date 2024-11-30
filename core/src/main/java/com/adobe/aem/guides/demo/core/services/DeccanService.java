package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(service = DeccanService.class,immediate = true, enabled = true)
public class DeccanService {

    private static final Logger LOG = LoggerFactory.getLogger(DeccanService.class);

    
    @Activate
    public void activate() {
        LOG.info("DeccanService activate() started");
    }

    
    @Deactivate
    public void deactivate() {
        LOG.info("DeccanService deactivate() ended");
    }

    @Modified
    public void modify() {
        LOG.info("DeccanService modified() started");
    }
    public String printdata()
    {
        return "Print Data of DeccanPressRelease";
    }
}
