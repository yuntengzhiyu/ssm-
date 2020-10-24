package com.pojo;

public class Books {
    private int bookID, bookCounts;
    private String bookName, detail;

    public Books() {
    }

    public Books(int bookID, int bookCounts, String bookName, String detail) {
        this.bookID = bookID;
        this.bookCounts = bookCounts;
        this.bookName = bookName;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", bookCounts=" + bookCounts +
                ", bookName='" + bookName + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
