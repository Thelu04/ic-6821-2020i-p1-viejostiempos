
import java.io.OutputStream;




interface HttpResponse {
    void setVersion(String version);
    void setStatusCode(int statusCode);
    void setStatusMessage(String statusMessage);
    void appendHeader(String llave, String valor);
    OutputStream getData();
}
