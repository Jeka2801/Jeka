package com.company;

/**
 * Created by Евгений on 04.04.2015.
 */
public class StaMain {
    public static int o = 10;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(o == 10);
        int res = sum(2, 4);
        System.out.println(res);
        res = sum(22, 41);
        System.out.println(res);
        res = sum(555, 0);
        System.out.println(res);

        String j;
        String h = "jashdjhas";
        j = h;

        int i;
        int u;

        i = 110;
        u = i; // u = 110;

        /*Stacan s = new Stacan("Super");
        Stacan k = new Stacan("Bigger");
        System.out.println("s: " + s.imia); //s: Super
        // s: Super
        s.imia = "Hello";
        System.out.println("s: " + s.imia); //s: Super
        // s: Hello
        System.out.println("k: " + k.imia);
        System.out.println("Stakan: " + Stacan.material);
        // k: Bigger
        // Stakan: Bumaga
        System.out.println("Stakan: " + Stacan.visota);
        System.out.println("s: " + s.procentZapolneniia());
        // s: 0
        s.nalit(30);
        System.out.println("s: " + s.procentZapolneniia());
        // s: 30
        s.nalit(k.vylit());
        System.out.println("s: " + s.procentZapolneniia());
        System.out.println("k: " + k.procentZapolneniia());
        // s: 30
        // k: 0
*/


    }


}
