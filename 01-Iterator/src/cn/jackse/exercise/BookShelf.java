package cn.jackse.exercise;

import java.util.ArrayList;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月27日 12:44
 */
public class BookShelf implements Aggregate {

//    private Book[] books;
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int initialize) {
//        this.books = new Book[maxsize];
        this.books = new ArrayList<Book>(initialize);
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
//        this.books[last] = book;
        this.books.add(book);
        last++;
    }

    public int getLength() {
//        return last;
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

