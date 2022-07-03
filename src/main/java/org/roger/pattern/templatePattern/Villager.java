package org.roger.pattern.templatePattern;

/**
 * 上層村民類別
 */
public class Villager {

    // 編號
    protected Integer id;

    // 種族
    protected String raceName;

    protected void collect() {
        System.out.println(">>> 村民 - 採集資源");
    }

}
