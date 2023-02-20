package org.roger.pattern.AdapterPattern1;

/**
 * 現有接口的具體實現類，美國供電器 — 通過110V電壓供電
 */
public class AmericanCharger implements Adaptee {
    @Override
    public void chargeBy110V() {
        System.out.println( "美國供電器，只為你服務，正在通過 110V 電壓為您充電" );
    }
}
