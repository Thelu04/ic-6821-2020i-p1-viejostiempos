package edu.byohttp;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.io.DataInputStream;

public class HttpRequestImp implements HttpRequest{

    private String method;
    private String resource;
    private String version;
    private HashMap<String,String> header;

    public HttpRequestImp(InputStream dataStream){
        this.header = new HashMap<>();
        this.header.put("test","test");
        this.version = "test";
        this.resource = "test";
        this.method = "test";

    }
    private void inputStreamReader(InputStream stream){
        BufferedInputStream buffer = new BufferedInputStream(stream);
        DataInputStream data = new DataInputStream(buffer);
    }
    public String getMethod() {
        return this.method;
    }

    public String getResource() {
        return this.resource;
    }

    public String getVersion() {
        return this.version;
    }

    public String getHeader(String llave) {
        String valor;
        valor = this.header.get(llave);
        return valor;
    }

}
