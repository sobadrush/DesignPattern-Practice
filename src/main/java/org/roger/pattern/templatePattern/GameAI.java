package org.roger.pattern.templatePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 遊戲AI抽象類別
 */
public abstract class GameAI {

    // 村民
    protected List<Villager> villagers = new ArrayList<>();

    // 你的回合(樣板方法-定義了一連串的方法框架)
    public void yourTurn() {
        System.out.println("Step 1:");
        this.collectResources(); // 採集
        System.out.println("Step 2:");
        this.buildStructures(); // 建造建築
        System.out.println("Step 3:");
        this.buildUnits(); // 生產單位
        System.out.println("Step 4:");
        this.attack(); // 攻擊
    }

    // 發動所有村民採集資源
    private void collectResources() {
        for (Villager villager : villagers) {
            System.out.print(String.format("\t>>> [%s]: %d - ", villager.raceName, villager.id));
            villager.collect();
        }
    }

    // 建造建築
    protected abstract void buildStructures();

    // 建造單位
    protected abstract void buildUnits();

    // 攻擊他族單位
    protected abstract void attack();

}
