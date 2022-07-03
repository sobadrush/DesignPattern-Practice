package org.roger.pattern.templatePattern;

/**
 * 蟲族農夫 - 工蟲
 */
public class ZergVillager extends Villager {

    private static Integer ZERG_VILLAGER_ID = 901;

    public ZergVillager() {
        this.id = ZERG_VILLAGER_ID++;
        this.raceName = "蟲族"; // 種族名稱
    }

    @Override
    protected void collect() {
        System.out.println("採集高能瓦斯...");
    }

}
