package labs.lab5.states;

import labs.lab5.EmployeeMonitoring;

abstract public class State {
    protected String state = "Default";
    protected EmployeeMonitoring employeeMonitoring;

    public State(EmployeeMonitoring employeeMonitoring) {
        this.employeeMonitoring = employeeMonitoring;
    }

    public String getState() {
        return this.state;
    }

    public void registerTrip() {

    }

    public void sendOnTrip() {

    }

    public void returnFromTrip() {

    }
}
