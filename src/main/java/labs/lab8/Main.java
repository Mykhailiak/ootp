package labs.lab8;

import labs.lab8.decorators.*;

public class Main {
    public static void main(String[] args) {
        RequestData requestIdDecorator = new FilePrefixDecorator(
                new RequestIdDecorator(
                        new DateFieldDecorator(
                                new HttpService()
                        )
                )
        );



        requestIdDecorator.write("data.json");
    }
}
