package com.softserve.academy.homeWorks.progect.dataSource;

import com.softserve.academy.homeWorks.progect.model.Book;
import com.softserve.academy.homeWorks.progect.model.Order;

import java.util.ArrayList;

public interface iBookDataSource {
    ArrayList<Book> getBooks();

    ArrayList<Order> getOrders();
}
