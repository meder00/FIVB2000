package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss firstBoss = new Boss(150, 20);
        Weapon axe = new Weapon("Slashing weapon", "Axe");
        firstBoss.setWeapon(axe);
        System.out.println(firstBoss.printInfo() + " Статистика Босса ");


        Skelet skeletonKing = new Skelet(250, 40, 50);
        Weapon bow = new Weapon("Small arm", "X Bow");
        skeletonKing.setWeapon(bow);
        Skelet getSkeletonKing = new Skelet(160, 70, 80);
        Weapon xBow = new Weapon("Small arm", "X Bow");
        kingSkeleton.setWeapon(xBow);


        System.out.println(skeletonKing.printInfo() + " Статистика Короля Скелетов");

        System.out.println(kingSkeleton.printInfo() + " Статистика Короля Скелета");


//        System.out.println(firstBoss.getWeapon().getTypeOfWeapon() + " "+ firstBoss.getWeapon().getNameOfWeapon()
//                + " " + firstBoss.getHealth() + " " + firstBoss.getDamage());
    }

}


