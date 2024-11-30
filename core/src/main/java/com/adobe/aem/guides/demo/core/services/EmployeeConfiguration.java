package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "EmployeeConfiguration",description = "about EmployeeConfiguration")
public @interface EmployeeConfiguration {
   
    @AttributeDefinition(name = "empId",
    description = "about empId",
    defaultValue = "Please Enter Emp Id",
    type = AttributeType.STRING
    )
    public String empId();

    @AttributeDefinition(name = "empName",
    description = "about empName",
    defaultValue = "Please Enter Emp Name",
    type = AttributeType.STRING
    )
    public String empName();

    @AttributeDefinition(name = "empNumber",
    description = "about empNumber",
    defaultValue = "Please Enter Emp Number",
    type = AttributeType.STRING
    )
    public String empNumber();

    @AttributeDefinition(name = "empRestApi",
    description = "about empRestApi",
    defaultValue = "Please Enter empRestApi",
    type = AttributeType.STRING
    )
    public String empRestApi();
}
