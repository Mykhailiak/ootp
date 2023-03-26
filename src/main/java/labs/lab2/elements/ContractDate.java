package labs.lab2.elements;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContractDate {
    LocalDateTime date;

    public ContractDate() {
        LocalDateTime now = LocalDateTime.now();

        this.date = now;
    }

    public String getDateString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return dtf.format(this.date);
    }
}
