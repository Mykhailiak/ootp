package labs.lab8;

public class HttpService implements RequestData {
    @Override
    public void write(String requestBody) {
        System.out.println("HTTP call has been sent. Payload: " + requestBody);
    }
}
