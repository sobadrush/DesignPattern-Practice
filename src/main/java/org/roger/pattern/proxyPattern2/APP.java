package org.roger.pattern.proxyPattern2;

/**
 * @author RogerLo
 * @date 2022/5/10
 * Proxy-Pattern 測試
 */
public class APP {

    public static void main(String[] args) {
        ProxyBuyer proxyBuyer = new ProxyBuyer();
        proxyBuyer.purchaseRequest();
    }

}
