package org.roger.pattern.templatePattern;

/**
 * @author RogerLo
 * @date 2022/7/2
 */
public class Demo {

    public static void main(String[] args) {
        GameAI orcsAI = new OrcsAI();
        orcsAI.yourTurn();

        System.out.println("====================================================");

        GameAI zergAI = new ZergAI();
        zergAI.yourTurn();
    }

}
