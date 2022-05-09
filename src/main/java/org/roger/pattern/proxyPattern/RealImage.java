package org.roger.pattern.proxyPattern;

/**
 * @author RogerLo
 * @date 2022/5/9
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(){
        System.out.println("Loading " + fileName);
    }

}
