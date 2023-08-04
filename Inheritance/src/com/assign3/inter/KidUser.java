package com.assign3.inter;

public class KidUser implements LibraryUser{

    int age;

    String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setBookType(String bookType){
        this.bookType = bookType;
    }

    public String getBookType(){
        return this.bookType;
    }

    @Override
    public void registerAccount(){
        if(getAge() < 12){
            System.out.println("You have successfully registered under a kids account");
        }
        if(getAge() > 12){
            System.out.println("Sorry age must be less than 12");
        }
    }

    @Override
    public void requestBook() {
        if(getBookType().equals("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
