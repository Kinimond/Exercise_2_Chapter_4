package com.company;

public class Main {
    //Exercise 2
    public static void main(String[] args) {                 //1
        zippo("rattle", 13);                      //2
    }                                                        //13
    public static void baffle(String blimp) {                //8
        System.out.println(blimp);                           //9
        zippo("ping", -5);                        //10
    }                                                        //14
    public static void zippo(String quince, int flag) {      //3
        if (flag < 0) {                                      //4
            System.out.println(quince + " zoop");            //11
        } else {                                             //5
            System.out.println("ik");                        //6
            baffle(quince);                                  //7
            System.out.println("boo-wa-ha-ha");              //12
        }
    }
}
// parameter blimp has the value "rattle" when flag is larger than 0, and "ping" when less than 0

//Output is:
// ik
// rattle
// ping zoop
// boo-wa-ha-ha
