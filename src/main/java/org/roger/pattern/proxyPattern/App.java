package org.roger.pattern.proxyPattern;

/**
 * @author RogerLo
 * @date 2022/5/9
 */
public class App {

    public static void main(String[] args) {
        Image image = new ProxyImage("RogerNFT.jpg");
        image.display();
        System.out.println("---------");
        image.display();
    }

}
