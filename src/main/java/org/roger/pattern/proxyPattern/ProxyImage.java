package org.roger.pattern.proxyPattern;

/**
 * @author RogerLo
 * @date 2022/5/9
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.fileName);
        }
        realImage.display();
    }
}
