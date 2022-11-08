package com.softserve.academy.homeWorks.progect.dataSource;

import com.softserve.academy.homeWorks.progect.model.Book;
import com.softserve.academy.homeWorks.progect.model.Order;

import java.util.ArrayList;

public class BookDataSource implements iBookDataSource {
    private ArrayList<Book> listBooks = new ArrayList<>();
    private ArrayList<Order> listOrders = new ArrayList<>();

    public BookDataSource() {
        initialData();
    }

    public void initialData() {
        listBooks.add(new Book(11, "Red queen", "Aveyard V.", 290, "Thriller", 100));
        listBooks.add(new Book(128, "Seraphina", "Hartman R.", 160, "Thriller", 200));
        listBooks.add(new Book(134, "Egyptian Art", "Aldred A.", 300, "Art", 150));
        listBooks.add(new Book(140, "The Masterworks by Bruce Brooks Pfeiffer", "Wright F.L.", 290, "Art", 150));
        listBooks.add(new Book(158, "Islamic Arts", "Bloom J.", 110, "Art", 150));

        listOrders.add(new Order(1, 11111, 21112, new int[]{140, 128}));
        listOrders.add(new Order(2, 11112, 21111, new int[]{140}));
        listOrders.add(new Order(3, 11111, 21113, new int[]{158, 11, 134}));
        listOrders.add(new Order(4, 11113, 21114, new int[]{128, 134}));
        listOrders.add(new Order(5, 11113, 21115, new int[]{11, 138}));
    }

    @Override
    public ArrayList<Book> getBooks() {
        return listBooks;
    }

    @Override
    public ArrayList<Order> getOrders() {
        return listOrders;
    }
}
