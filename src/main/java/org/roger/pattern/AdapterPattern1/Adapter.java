package org.roger.pattern.AdapterPattern1;

/**
 * 類適配器(轉接頭)，通過【繼承】現有接口來完成對現有接口的擴展
 */
public class Adapter extends AmericanCharger implements Target{
    @Override
    public void chargeBy220V() {
        super.chargeBy110V();
        System.out.println( "再加 110V，達到220V，衝鴨！" ); // 對現有功能【擴展】
    }
}
