package org.roger.pattern.AdapterPattern2;

/**
 * 物件適配器 - 測試
 */
public class TestMain {
    public static void main(String[] args) {
        // 現在我們有一個美國110V供電站，但我們無法使用
        Adaptee adaptee = new AmericanCharger();

        // 我們將這個供電器物件，交給適配器，適配器轉換為 220V 供電器
        Adapter adapter = new Adapter(adaptee);

        // 接下來我們通過適配器充電就好了
        System.out.println("==================================");
        adapter.chargeBy220V();
        System.out.println("==================================");
    }
}
