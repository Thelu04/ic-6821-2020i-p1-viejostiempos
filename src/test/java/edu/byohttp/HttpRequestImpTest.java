package edu.byohttp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class HttpRequestImpTest {

    @Test public void testHttpRequestHasMethodI() {
        try {
            InputStream inputStream = new FileInputStream("test.txt");
            HttpRequestImp httpRequest = new HttpRequestImp(inputStream);
            assertNotNull("httpRequest should have a method", httpRequest.getMethod());
        }catch (Exception e){

        }

    }
    @Test public void testHttpRequestHasResource() {
            try {
                InputStream inputStream = new FileInputStream("test.txt");
                HttpRequestImp httpRequest = new HttpRequestImp(inputStream);
                assertNotNull("httpRequest should have a resource", httpRequest.getResource());
            }catch (Exception e){

            }
    }
    @Test public void testHttpRequestHasRVersion() {
            try {
                InputStream inputStream = new FileInputStream("test.txt");
                HttpRequestImp httpRequest = new HttpRequestImp(inputStream);
                assertNotNull("httpRequest should have a version", httpRequest.getVersion());
            }catch (Exception e){

            }
    }
    @Test public void testHttpRequestHasHeader() {
            try {
                InputStream inputStream = new FileInputStream("test.txt");
                HttpRequestImp httpRequest = new HttpRequestImp(inputStream);
                assertNotNull("httpRequest should have a header", httpRequest.getHeader("test"));
            }catch (Exception e){

            }
    }
    
}
