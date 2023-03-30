package labs.lab5.states;

import labs.lab5.EmployeeMonitoring;

public class TripRegisteredState extends State {
    public TripRegisteredState(EmployeeMonitoring employeeMonitoring) {
        super(employeeMonitoring);
        System.out.println(String.format("Id: %s is registered for the new trip", employeeMonitoring.getEmployeeId()));
    }

    @Override
    public void sendOnTrip() {
        employeeMonitoring.changeState(new TripInProgressState(employeeMonitoring));
    }
}
