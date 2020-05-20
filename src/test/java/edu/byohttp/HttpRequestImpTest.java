package edu.byohttp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;

public class HttpRequestImpTest {

    @Test public void testHttpRequestHasMethodI() {
        InputStream inputStream = new InputStream();
        HttpRequestImp httpRequest = new HttpRequest(inputStream);
        assertNotNull("httpRequest should have a method", httpRequest.getMethod());
    }
    @Test public void testHttpRequestHasResource() {
        InputStream inputStream = new InputStream();
        HttpRequestImp httpRequest = new HttpRequest(inputStream);
        assertNotNull("httpRequest should have a resource", httpRequest.getResource());
    }
    @Test public void testHttpRequestHasRVersion() {
        InputStream inputStream = new InputStream();
        HttpRequestImp httpRequest = new HttpRequest(inputStream);
        assertNotNull("httpRequest should have a version", httpRequest.getVersion());
    }
    @Test public void testHttpRequestHasHeader() {
        InputStream inputStream = new InputStream();
        HttpRequestImp httpRequest = new HttpRequest(inputStream);
        assertNotNull("httpRequest should have a header", httpRequest.getHeader("test"));
    }
    
}
