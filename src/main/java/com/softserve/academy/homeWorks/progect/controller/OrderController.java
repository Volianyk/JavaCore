package com.softserve.academy.homeWorks.progect.controller;

import com.softserve.academy.homeWorks.progect.dataSource.BookDataSource;
import com.softserve.academy.homeWorks.progect.model.Book;
import com.softserve.academy.homeWorks.progect.model.Order;

public class OrderController {
    private BookDataSource bookDataSource;

    public OrderController(BookDataSource bookDataSource) {
        this.bookDataSource = bookDataSource;
    }

    public double getPriceOrder(Order order) {
        double price = 0;
        for (int id : order.getBooks()) {
            Book book = getBookElement(id);
            if (book != null) {
                price += book.getPrice();
            }
        }
        return price;
    }

    private Book getBookElement(int id) {
        for (Book book : bookDataSource.getBooks()) {
            if (book.getIdBook() == id) {
                return book;
            }
        }
        return null;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Order order : bookDataSource.getOrders()) {
            totalPrice += getPriceOrder(order);
        }
        return totalPrice;
    }
}
