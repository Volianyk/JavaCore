package com.softserve.academy.homeWorks.progect;

import com.softserve.academy.homeWorks.progect.controller.OrderController;
import com.softserve.academy.homeWorks.progect.dataSource.BookDataSource;

public class Output {
    private BookDataSource bookDataSource;
    private OrderController bookController;

    public Output(BookDataSource bookDataSource, OrderController bookController) {
        this.bookDataSource = bookDataSource;
        this.bookController = bookController;
    }

    public void printTotalPrice() {
        String message = String.format("Total price of all orders: %.2f", bookController.calculateTotalPrice());
        System.out.println(message);
    }
}
