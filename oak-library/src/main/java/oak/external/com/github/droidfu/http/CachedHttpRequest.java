package oak.external.com.github.droidfu.http;

import org.apache.http.client.methods.HttpUriRequest;

import java.net.ConnectException;

public class CachedHttpRequest implements BetterHttpRequest {

    private String url;

    public CachedHttpRequest(String url) {
        this.url = url;
    }

    public String getRequestUrl() {
        return url;
    }

    public BetterHttpRequest expecting(Integer... statusCodes) {
        return this;
    }

    public BetterHttpRequest retries(int retries) {
        return this;
    }

    public BetterHttpResponse send() throws ConnectException {
        return new CachedHttpResponse(url);
    }

    public HttpUriRequest unwrap() {
        return null;
    }

    public BetterHttpRequest withTimeout(int timeout) {
        return this;
    }
}
