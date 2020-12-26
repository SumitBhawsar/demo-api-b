package com.capgemini.api.demoapia.controller.dto;

import org.springframework.beans.factory.annotation.Value;

public class GetDetailsResponse {
    private String name;

    private String version;

    private String secret;


    public GetDetailsResponse() {
    }
    public GetDetailsResponse(String name, String version, String secret) {
        this.name = name;
        this.version = version;
        this.secret = secret;
    }

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
}
