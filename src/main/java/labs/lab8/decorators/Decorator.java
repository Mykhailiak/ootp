package labs.lab8.decorators;

import labs.lab8.RequestData;

public class Decorator implements RequestData {
    private RequestData subordinate;

    public Decorator(RequestData subordinate) {
        this.subordinate = subordinate;
    }

    @Override
    public void write(String requestBody) {
        this.subordinate.write(requestBody);
    }
}
