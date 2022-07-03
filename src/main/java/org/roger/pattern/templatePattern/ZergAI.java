package org.roger.pattern.templatePattern;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 蟲族AI
 */
public class ZergAI extends GameAI {

    // 初始給蟲族3個工蟲
    public ZergAI() {
        this.villagers.addAll(
                Stream.of(new ZergVillager(), new ZergVillager(), new ZergVillager()
                ).collect(Collectors.toList())
        );
    }

    @Override
    protected void buildStructures() {
        System.out.println("\t>>>【蟲族AI】建造「王蟲」");
    }

    @Override
    protected void buildUnits() {
        System.out.println("\t>>>【蟲族AI】生產「工蟲」");
        this.villagers.addAll(
                Stream.of(new ZergVillager(), new ZergVillager(), new ZergVillager()
                ).collect(Collectors.toList())
        );
    }

    @Override
    protected void attack() {
        System.out.println("\t>>>【蟲族AI】攻擊「半獸人-軍事單位」");
    }

}
