package org.roger.pattern.AdapterPattern2;

/**
 * 物件適配器，通過繼承現有接口來完成對現有接口的擴展，使得能夠110V供電
 */
public class Adapter implements Target {

    private Adaptee adaptee; // 持有現有接口具體實現對象的引用

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void chargeBy220V() {
        adaptee.chargeBy110V(); //該對象的現有功能
        System.out.println("再加110V，達到220V，衝鴨！"); //對現有功能擴展
    }
}
