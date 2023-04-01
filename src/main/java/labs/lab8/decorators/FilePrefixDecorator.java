package labs.lab8.decorators;

import labs.lab8.RequestData;

public class FilePrefixDecorator extends Decorator {
    public FilePrefixDecorator(RequestData subordinate) {
        super(subordinate);
    }

    @Override
    public void write(String requestBody) {
        String prefixedBody = String.format("FILE=%s;", requestBody);

        super.write(prefixedBody);
    }
}
