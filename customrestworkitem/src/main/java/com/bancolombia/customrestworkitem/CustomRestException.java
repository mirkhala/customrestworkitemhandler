package com.bancolombia.customrestworkitem;

public class CustomRestException extends RuntimeException {
    private static final long serialVersionUID = -2461370884711166642L;

    private int status;
    private String response;
    private String endoint;

    public CustomRestException(int status,
                                String response,
                                String endoint) {
        super("Unsuccessful response from REST server (status " + status + ", endpoint " + endoint + ", response " + response + "");
        this.status = status;
        this.response = response;
        this.endoint = endoint;
    }

    public int getStatus() {
        return status;
    }

    public String getResponse() {
        return response;
    }

    public String getEndoint() {
        return endoint;
    }
}
