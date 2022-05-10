package org.roger.pattern.proxyPattern2;

/**
 * Proxy-Pattern
 * 「PROXY」物件
 */
public class ProxyBuyer implements IPurchasing {

    // 代理物件中，嵌入「REAL SUBJECT」物件
    private Purchasing purchasing;

    public ProxyBuyer() { // 預設建構子

    }

    @Override
    public void purchaseRequest() {
        if (purchasing == null) {
            purchasing = new Purchasing();
        }
        // ---
        this.preHandling(); // 代理物件自訂的其他方法
        purchasing.purchaseRequest(); //「REAL SUBJECT」物件 的方法
        this.postHandling(); // 代理物件自訂的其他方法
    }

    private void preHandling() {
        System.out.println("... 【PROXY】進行採買前置作業(preHandling) ...");
    }

    private void postHandling() {
        System.out.println("... 【PROXY】進行採買前置作業(postHandling) ...");
    }
}
