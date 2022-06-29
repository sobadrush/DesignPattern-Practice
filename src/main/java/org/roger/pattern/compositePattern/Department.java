package org.roger.pattern.compositePattern;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 樹枝節點(可包含 葉子節點 or 樹枝節點)
 */
@ToString(callSuper = true)
public class Department extends HumanResource {

    // 構件容器(可存放 Employee & Department)
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(Long id) {
        super(id);
    }

    @Override
    public Double calculateSalary() {
        // @formatter:off
        return this.subNodes.stream()
                .map(hr -> hr.calculateSalary())
                .reduce((salaryA, salaryB) -> salaryA + salaryB)
                .orElse(0d);
        // @formatter:on
    }

    // 增加一個葉子節點或者樹枝節點
    public void addSubNode(HumanResource hrObj) {
        this.subNodes.add(hrObj);
    }

    // 刪除一個葉子節點或者樹枝節點
    public void addSubNode(HumanResource... hrObjs) {
        this.subNodes.addAll(Arrays.asList(hrObjs));
    }

    // 獲取此節點下，所有葉子節點和樹枝節點
    public List<HumanResource> getAllSubNodes() {
        return this.subNodes;
    }

}
