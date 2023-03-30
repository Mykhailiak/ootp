package labs.lab5.iterators;

import labs.lab5.categories.DriverTypes;
import labs.lab5.Employee;
import labs.lab5.categories.ScheduleType;

import java.util.ArrayList;

public class EmployeeIterator implements Iterator {
    private DriverTypes requestedDriverType;
    private ScheduleType requestedScheduleType;
    private ArrayList<Employee> list;
    private int currentPosition = 0;

    public EmployeeIterator(ArrayList<Employee> list, DriverTypes driverType, ScheduleType scheduleType) {
        this.list = list;
        this.requestedDriverType = driverType;
        this.requestedScheduleType = scheduleType;
    }

    @Override
    public boolean hasNext() {
        return currentPosition <= list.size() - 1;
    }

    @Override
    public Employee getNext() {
        if (!hasNext()) {
            return null;
        }

        while (hasNext()) {
            Employee employee = list.get(currentPosition);
            DriverTypes employeeDriverType = employee.getDriverType();
            ScheduleType employeeScheduleType = employee.getScheduleType();

            currentPosition++;

            if (employeeDriverType == requestedDriverType && employeeScheduleType == requestedScheduleType) {
                return employee;
            }
        }

        return null;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
