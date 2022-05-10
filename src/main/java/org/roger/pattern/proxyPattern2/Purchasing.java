package org.roger.pattern.proxyPattern2;

/**
 * Proxy-Pattern
 * 「REAL SUBJECT」物件
 */
public class Purchasing implements IPurchasing {
    @Override
    public void purchaseRequest() {
        System.out.println("... Shopping in JAPAN ...");
    }
}
