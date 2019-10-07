package com.company;

public class Book
{
    private String surname, bookName;
    private int year;

    public Book(String sur, String boNa, int ye)
    {
        surname = sur;
        bookName = boNa;
        year = ye;
    }

    public String getSur()
    {
        return surname;
    }
    public String getBoo()
    {
        return bookName;
    }
    public int getYear()
    {
        return year;
    }
}
