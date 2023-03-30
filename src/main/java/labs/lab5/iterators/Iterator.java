package labs.lab5.iterators;

import labs.lab5.Employee;

public interface Iterator {
    Employee getNext();

    boolean hasNext();

    void reset();
}
