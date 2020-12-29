package com.capgemini.api.demoapib.controller.dto;

public class DownStreamResponse {

    private GetDetailsResponse downstreamApiInfo;

    private GetDetailsResponse selfInfo;

    public GetDetailsResponse getDownstreamApiInfo() {
        return downstreamApiInfo;
    }

    public void setDownstreamApiInfo(GetDetailsResponse downstreamApiInfo) {
        this.downstreamApiInfo = downstreamApiInfo;
    }

    public GetDetailsResponse getSelfInfo() {
        return selfInfo;
    }

    public void setSelfInfo(GetDetailsResponse selfInfo) {
        this.selfInfo = selfInfo;
    }
}
