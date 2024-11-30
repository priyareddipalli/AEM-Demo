package com.adobe.aem.guides.demo.core.models;

import java.util.Date;
import java.util.List;

public interface DeccanModel {

    public String getDeccanTitle();

    public String getDeccanDes();

    public String getDeccanImage();

    public Date getDeccanPublishDate();

    public int getDeccanNumber();

    public List<String> getDeccanMultifield();

    public String getPageName();

    public String getJcrCreated();
}