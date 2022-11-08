package com.softserve.academy.homeWorks.progect;

import com.softserve.academy.homeWorks.progect.controller.OrderController;
import com.softserve.academy.homeWorks.progect.dataSource.BookDataSource;

public class Program {
    public static void main(String[] args) {
        Output output = new Output(new BookDataSource(), new OrderController(new BookDataSource()));
        output.printTotalPrice();

    }
}
