package edu.byohttp;

public interface HttpRequest {
    public String getMethod();
    public String getResource();
    public String getVersion();
    public String getHeader(String llave);
}
