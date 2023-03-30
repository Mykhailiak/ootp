package labs.lab5;

import labs.lab5.categories.DriverTypes;
import labs.lab5.categories.ScheduleType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeesList = getEmployeesList();
        ScheduleBoard scheduleBoard = new ScheduleBoard(employeesList);

        scheduleBoard.getSchedule(DriverTypes.TRUCK, ScheduleType.EVEN);
        
        EmployeeMonitoring employeeMonitoring = new EmployeeMonitoring(54);
        employeeMonitoring.getState().registerTrip();
        employeeMonitoring.getState().sendOnTrip();
        employeeMonitoring.getState().returnFromTrip();
    }

    public static ArrayList<Employee> getEmployeesList() {
        ArrayList<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee("John", "Doe", DriverTypes.BUS, ScheduleType.EVEN));
        employeesList.add(new Employee("Jason", "Voorhees", DriverTypes.TRUCK, ScheduleType.EVEN));
        employeesList.add(new Employee("Tony", "Stark", DriverTypes.BUS, ScheduleType.ODD));
        employeesList.add(new Employee("Ace", "Ventura", DriverTypes.TRUCK, ScheduleType.ODD));
        employeesList.add(new Employee("Bruce", "Wayne", DriverTypes.TRUCK, ScheduleType.EVEN));

        return employeesList;
    }
}
