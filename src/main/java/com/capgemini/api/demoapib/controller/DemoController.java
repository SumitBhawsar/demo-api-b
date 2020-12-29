package com.capgemini.api.demoapib.controller;

import com.capgemini.api.demoapib.controller.dto.GetDetailsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
public class DemoController {

    @Value("${apia.name}")
    private String name;

    @Value("${apia.version}")
    private String version;

    @Value("${apia.secret}")
    private String secret;

    @GetMapping(value = "details",produces = APPLICATION_JSON_VALUE)
    public GetDetailsResponse getDetails(){
        return new GetDetailsResponse(name, version, secret);
    }
}
