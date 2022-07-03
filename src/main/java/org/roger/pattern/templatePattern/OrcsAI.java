package org.roger.pattern.templatePattern;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 半獸人AI
 */
public class OrcsAI extends GameAI {

    // 初始給半獸人3個農民
    public OrcsAI() {
        this.villagers.addAll(
                Stream.of(new OrcsVillager(), new OrcsVillager(), new OrcsVillager())
                        .collect(Collectors.toList()));
    }

    @Override
    protected void buildStructures() {
        System.out.println("\t>>>【半獸人AI】建造「半獸人農場」");
    }

    @Override
    protected void buildUnits() {
        System.out.println("\t>>>【半獸人AI】生產「半獸人農夫」");
        this.villagers.addAll(
                Stream.of(new OrcsVillager(), new OrcsVillager(), new OrcsVillager())
                .collect(Collectors.toList()));
    }

    @Override
    protected void attack() {
        System.out.println("\t>>>【半獸人AI】攻擊「蟲族-軍事單位」");
    }

}
