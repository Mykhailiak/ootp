package labs.lab5;

import labs.lab5.states.IdleState;
import labs.lab5.states.State;

public class EmployeeMonitoring {
    private int employeeId;
    private State state;

    public EmployeeMonitoring(int employeeId) {
        this.employeeId = employeeId;
        this.state = new IdleState(this);
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public State getState() {
        return state;
    }
}
