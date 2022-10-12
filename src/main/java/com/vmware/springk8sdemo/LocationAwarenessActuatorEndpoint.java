package com.vmware.springk8sdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
@Endpoint(id="location", enableByDefault = true)
public class LocationAwarenessActuatorEndpoint{
    @Value("${datacenter.name:novaluefound}")
    private String datacenterName;

    @Value("${dns.suffix:nosuffix}")
    private String dnsSuffix;

    @ReadOperation
    public String datacenter(){
        return "{\n\tdatacenter: \"" + datacenterName + "\", \n\tdns-suffix: \"" + dnsSuffix + "\"\n}";
    }
}
