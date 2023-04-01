package labs.lab8.decorators;

import labs.lab8.RequestData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFieldDecorator extends Decorator {
    public DateFieldDecorator(RequestData subordinate) {
        super(subordinate);
    }

    @Override
    public void write(String requestBody) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String datedRequestBody = String.format("%s;DATE=%s;", requestBody, dtf.format(now));

        super.write(datedRequestBody);
    }
}
