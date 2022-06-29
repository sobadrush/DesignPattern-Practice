package org.roger.pattern.compositePattern;

/**
 * 葉子節點
 */
public class Employee extends HumanResource {

    public Employee(Long id, Double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public Double calculateSalary() {
        return this.salary;
    }

}
