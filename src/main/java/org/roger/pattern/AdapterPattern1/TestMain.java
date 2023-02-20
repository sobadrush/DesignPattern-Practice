package org.roger.pattern.AdapterPattern1;

/**
 * 測試-類別適配器
 */
public class TestMain {
    public static void main(String[] args) {
        // 類適配器使得代碼邏輯混亂
        // 這種情況下彷彿Adapter是一種110V的美國供電器可以直接使用不需要其他信息
        // 具體可以和對象適配器對比以下
        System.out.println("==============================");
        new Adapter().chargeBy220V();
        System.out.println("==============================");
    }
}
