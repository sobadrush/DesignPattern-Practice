package org.roger.pattern.compositePattern;

import lombok.ToString;

/**
 * 「個體」 和 「群體 的抽象類別
 * 部門類和員工類的抽象類
 */
@ToString
public abstract class HumanResource {

    protected Long id;
    protected Double salary;

    public HumanResource(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    /**
     * 計算「部門」薪資 or 「員工」薪資(視實作而定)
     */
    public abstract Double calculateSalary();
}
