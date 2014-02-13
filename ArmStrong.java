package com.anuj.algorithms;

/**
 *
 * @author Anuj Patel
 * @Desc http://goldenpackagebyanuj.blogspot.in/2012/10/how-to-check-number-is-armstrong-or-not.html
 */
public class ArmStrong {

    protected void checkIsArmStrongNumber(int num) {
        int sum = 0, reminder = 0;
        int original = num;

        while (num > 0) {
            //take reminder
            reminder = num % 10;

            //cube the reminder and add it to sum
            sum = sum + reminder * reminder * reminder;

            //retrieve pending number to be eveluated
            num = num / 10;
        }

        if (original == sum) {
            System.out.println("Number " + original + " is armstrong");
        } else {
            System.out.println("Number " + original + " is not armstrong");
        }
    }

    public static void main(String[] args) {
        ArmStrong armStrong = new ArmStrong();
        armStrong.checkIsArmStrongNumber(153);
        armStrong.checkIsArmStrongNumber(154);
    }
} 
