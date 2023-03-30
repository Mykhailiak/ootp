package labs.lab5.states;

import labs.lab5.EmployeeMonitoring;

public class IdleState extends State {
    protected String state = "Idle";

    public IdleState(EmployeeMonitoring employeeMonitoring) {
        super(employeeMonitoring);
        System.out.println(String.format("Id: %s is in idle state", employeeMonitoring.getEmployeeId()));
    }

    @Override
    public void registerTrip() {
        employeeMonitoring.changeState(new TripRegisteredState(employeeMonitoring));
    }

    @Override
    public void returnFromTrip() {

    }

    @Override
    public void sendOnTrip() {

    }
}
