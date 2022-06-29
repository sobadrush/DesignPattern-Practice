package org.roger.pattern.compositePattern;

import java.util.function.Function;

/**
 * 測試「組合模式」
 */
public class Demo {

    public static void main(String[] args) {
        // 1. 建立總部門
        Function<Long, Department> func = Department::new;
        Department rootDept = func.apply(101L);

        // 2. 建立子部門
        Department branchDept = new Department(202L);

        // 3. 建立員工
        Employee empA = new Employee(7001L, 22000d);
        Employee empB = new Employee(7002L, 49050d);

        // 組合
        rootDept.addSubNode(branchDept);
        branchDept.addSubNode(empA, empB);

        // 測試
        System.err.println("rootDept.calculateSalary() = " + rootDept.calculateSalary());
    }

}
