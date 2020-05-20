
import java.io.OutputStream;




interface HttpResponse {
    void setVersion(String version);
    void setStatusCode(int StatusCode);
    void setStatusMessage(String StatusMessage);
    void appendHeader(String llave, String valor);
    OutputStream getData();
}
