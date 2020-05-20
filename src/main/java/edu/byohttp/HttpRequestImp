package edu.byohttp;

import java.io.InputStream;
import java.util.Map;
import java.io.DataInputStream;

public class HttpRequestImp {

    private String method;
    private String resource;
    private String version;
    private Map<String,String> header;

    public HttpRequestImp(InputStream dataStream){
        this.header = new HashMap<>();

        while((data = dataStream.read() != -1)){

        }

        this.version = "test";
        this.resource = "test";
        this.method = "test";

    }
    private Void inputStreamReader(InputStream stream){
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
