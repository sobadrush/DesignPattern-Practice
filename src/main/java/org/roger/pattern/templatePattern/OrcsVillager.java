package org.roger.pattern.templatePattern;

/**
 * 半獸人農夫
 */
public class OrcsVillager extends Villager {

    private static Integer ORCS_VILLAGER_ID = 101;

    public OrcsVillager() {
        this.id = ORCS_VILLAGER_ID++;
        this.raceName = "半獸人"; // 種族名稱
    }

    @Override
    public void collect() {
        System.out.println("採集果樹...");
    }

}
