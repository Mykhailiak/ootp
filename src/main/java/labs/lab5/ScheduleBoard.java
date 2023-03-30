package labs.lab5;

import labs.lab5.categories.DriverTypes;
import labs.lab5.categories.ScheduleType;
import labs.lab5.iterators.EmployeeIterator;

import java.util.ArrayList;

public class ScheduleBoard {
    private ArrayList<Employee> list;

    public ScheduleBoard(ArrayList<Employee> list) {
        this.list = list;
    }

    public void getSchedule(DriverTypes driverType, ScheduleType scheduleType) {
        StringBuilder output = new StringBuilder();
        EmployeeIterator iterator = new EmployeeIterator(list, driverType, scheduleType);

        while (iterator.hasNext()) {
            Employee employee = iterator.getNext();

            if (employee != null) {
                String line = String.format("%s\n", employee.getFullInfo());

                output.append(line);
            }
        }

        System.out.println(output);
    }
}
