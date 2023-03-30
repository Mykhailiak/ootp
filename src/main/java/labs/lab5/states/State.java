package labs.lab5.states;

import labs.lab5.EmployeeMonitoring;

public abstract class State {
    protected String state = "Default";
    protected EmployeeMonitoring employeeMonitoring;

    public State(EmployeeMonitoring employeeMonitoring) {
        this.employeeMonitoring = employeeMonitoring;
    }

    public String getState() {
        return this.state;
    }

    abstract public void registerTrip();

    abstract public void sendOnTrip();

    abstract public void returnFromTrip();
}
