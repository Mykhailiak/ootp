package labs.lab5;

import labs.lab5.categories.DriverTypes;
import labs.lab5.categories.ScheduleType;

public class Employee {
    private String name;
    private String surname;
    private DriverTypes driverType;
    private ScheduleType scheduleType;

    public Employee(String name, String surname, DriverTypes driverType, ScheduleType scheduleType) {
        this.name = name;
        this.surname = surname;
        this.driverType = driverType;
        this.scheduleType = scheduleType;
    }

    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

    public DriverTypes getDriverType() {
        return driverType;
    }

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public String getFullInfo() {
        return String.format("Name: %s | Type: %s | Schedule days: %s", this.getFullName(), driverType, scheduleType);
    }
}
