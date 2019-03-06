/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.bean;

import org.carlosreyes.interfaces.IVisualizable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Book extends Publication implements IVisualizable {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book() {
    }

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial);
        super.setAuthors(authors);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", isbn=" + isbn + ", readed=" + readed + ", timeReaded=" + timeReaded + '}';
    }

    public String IsReaded(String readed) {
        return readed;

    }

    public static ArrayList<Book> makeBookList() {
        return null;
    }

    @Override
    public Date startToSee(Date datel) {
        return datel;
    }

    @Override
    public void stopToSee(Date datel, Date dateF) {
        Long valor = datel.getTime() - datel.getTime();
        this.timeReaded = valor.intValue();
    }

}
