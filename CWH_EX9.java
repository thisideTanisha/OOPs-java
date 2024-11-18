package com.company;
public class CWH_EX9 {
    public static void main(String[] args) {
        //practise set 3
        //Q1)
        String name = "Tanisha Yadav";
        String lower =name.toLowerCase();
       System.out.printf("%s\n %s",name, lower);
        //Q2)
       String text = "To Lower Case";
        String texts = text.replace(" ","_" );
        System.out.println(texts);
        //Q3)
          String name1 = "Tanisha Yadav";
        System.out.printf("letter = \" Dear %s , Thanks a lot \" ", name1);
        //Q4)
         String p = "here are double  and   triple spaces";
        System.out.println(p.indexOf("  "));
        System.out.println(p.indexOf("   "));
        //Q5)
        String letter="\"Dear Harry,This Java Course is nice .Thanks\"";
        System.out.println(letter);




    }
}
