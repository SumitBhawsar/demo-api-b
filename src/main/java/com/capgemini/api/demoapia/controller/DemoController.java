package com.capgemini.api.demoapia.controller;

import com.capgemini.api.demoapia.config.ApiProperties;
import com.capgemini.api.demoapia.controller.dto.DownStreamResponse;
import com.capgemini.api.demoapia.controller.dto.GetDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RefreshScope
public class DemoController {

    @Value("${apia.name}")
    private String name;

    @Value("${apia.version}")
    private String version;

    @Value("${apia.secret}")
    private String secret;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiProperties apiProperties;

    @GetMapping(value = "/details",produces = APPLICATION_JSON_VALUE)
    public GetDetailsResponse getDetails(){
        return new GetDetailsResponse(name, version, secret);
    }

    @GetMapping(value = "/details/confprop",produces = APPLICATION_JSON_VALUE)
    public GetDetailsResponse getDetailsconfProp(){
        return new GetDetailsResponse(apiProperties.getName(), apiProperties.getVersion(), apiProperties.getSecret());
    }

    @GetMapping(value = "/downstream/info",produces = APPLICATION_JSON_VALUE)
    public DownStreamResponse callDownStream(){
        DownStreamResponse downStreamResponse = new DownStreamResponse();
        downStreamResponse.setDownstreamApiInfo(restTemplate.getForObject(apiProperties.getDownstreamUrl() + "/details/confprop", GetDetailsResponse.class));
        downStreamResponse.setSelfInfo( new GetDetailsResponse(apiProperties.getName(), apiProperties.getVersion(), apiProperties.getSecret()));
        return downStreamResponse;
    }
}
