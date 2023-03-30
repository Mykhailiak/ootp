package labs.lab5.states;

import labs.lab5.EmployeeMonitoring;

public class TripInProgressState extends State {
    public TripInProgressState(EmployeeMonitoring employeeMonitoring) {
        super(employeeMonitoring);
        System.out.println(String.format("Id: %s is on trip", employeeMonitoring.getEmployeeId()));
    }

    @Override
    public void returnFromTrip() {
        employeeMonitoring.changeState(new IdleState(employeeMonitoring));
    }
}
