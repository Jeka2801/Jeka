package com.company;

/**
 * Created by Евгений on 04.04.2015.
 */
public class Stacan
{
    public String imia;
    public int gitkost;


         public static String material = "Bumaga";
        public  static  int visota = 10;

       public Stacan (String a){
           imia =a;



       }
    public int procentZapolneniia (){
        return gitkost;
    }
    public void nalit (int a){
        gitkost = a;


    }
}
