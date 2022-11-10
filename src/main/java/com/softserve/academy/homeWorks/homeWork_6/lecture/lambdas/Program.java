package com.softserve.academy.homeWorks.homeWork_6.lecture.lambdas;

public class Program {

    public static void main(String[] args) {
//        FunctionInterf fi = (x, y) -> x + y;
//        int res = fi.calculate(2, 5);
//        System.out.println(res);
//        int res1= fi.calculate(2,9);
//        System.out.println(res1);

//        String message="samples";
//        FunctionInterf fi=s->
//        fi.printInfo(message);
//        int x = -2;
//        int y = 10;
//        FunctionInterf fi = () -> {
//
//            return x + y;
//        };
//        int res = fi.calculate();
//        System.out.println(res);

        FunctionInterf fi = (s) -> {
            String res = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                res += s.charAt(i);
            }
            return res;
        };
        System.out.println(fi.reverse("hscn"));
    }

}
