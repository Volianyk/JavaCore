package com.softserve.academy.homeWorks.homeWork_3.lecture;

public class Program {
    public static void main(String[] args) {
        Student st; //це тільки змінна цього класу, не обєкт
        st = new Student(); //відпрацьовує конструктор за замовчуванням і ініціалізує поля дефолтними значеннями
        st.firstName = "Pol";
        st.lastName = "Kerry";
        st.age = 35;
        st.login = "CODE";
        st.printInfo();
        Student st1 = new Student("PeT", "KOl", 78, "iamD", "98758");
        st1.printInfo();
        System.out.println(st1.getPassword());
    }
}
