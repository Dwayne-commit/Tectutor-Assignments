package com.assign3.inter;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        KidUser kf = new KidUser(10,"Kids");
        KidUser kf1 = new KidUser(18,"Fiction");
        AdultUser sf = new AdultUser(5,"Kids");
        AdultUser sf1 = new AdultUser(23,"Fiction");

        kf.registerAccount();
        kf.requestBook();
        kf1.registerAccount();
        kf1.requestBook();
        sf.registerAccount();
        sf.requestBook();
        sf1.registerAccount();
        sf1.requestBook();
    }
}
