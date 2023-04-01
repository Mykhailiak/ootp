package labs.lab8.decorators;

import labs.lab8.RequestData;

public class RequestIdDecorator extends Decorator {
    public RequestIdDecorator(RequestData subordinate) {
        super(subordinate);
    }

    @Override
    public void write(String requestBody) {
        int minRandomValue = 50;
        int maxRandomValue = 1000;
        int requestId = (int)Math.floor(Math.random() * (minRandomValue + maxRandomValue + 1) + minRandomValue);
        String transformedBody = String.format("%sREQUEST_ID=%s", requestBody, requestId);

        super.write(transformedBody);
    }
}
