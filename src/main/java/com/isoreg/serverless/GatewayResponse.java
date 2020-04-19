package com.isoreg.serverless;

import com.isoreg.serverless.models.RE_Register;

/**
 * POJO containing response object for API Gateway.
 */
public class GatewayResponse {

    private final String body;
    // private final Map<String, String> headers;
    private final int statusCode;

    public GatewayResponse(final Iterable<RE_Register> body, final int statusCode) {
        this.statusCode = statusCode;
        this.body = "[\"aaa\",\"ccc\",\"ggg\",\"bbb\",\"ddd\"]";
        // this.headers = Collections.unmodifiableMap(new HashMap<>(headers));
    }

    public String getBody() {
        return body;
    }

    /*
     * public Map<String, String> getHeaders() { return headers; }
     */

    public int getStatusCode() {
        return statusCode;
    }
}