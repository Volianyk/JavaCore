package com.softserve.academy.homeWorks.homeWork_9.lecture;

public class Program {
    public static void main(String[] args) {
        //System.out.println(MyEnum.myEnum.values());
        for (MyEnum.myEnum e : MyEnum.myEnum.values()){
            System.out.println(e);
        }
    }
}
