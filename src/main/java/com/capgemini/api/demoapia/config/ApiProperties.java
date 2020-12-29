package com.capgemini.api.demoapia.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "apia")
public class ApiProperties {
    private String name;

    private String version;

    private String secret;

    private String downstreamUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getDownstreamUrl() {
        return downstreamUrl;
    }

    public void setDownstreamUrl(String downstreamUrl) {
        this.downstreamUrl = downstreamUrl;
    }
}
