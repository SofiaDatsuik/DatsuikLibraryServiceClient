package com.epam.web;

import com.epam.web.soap.implementation.ServiceException;
import com.epam.web.soap.model.Book;

import java.util.List;

public interface LibraryService {

    List<Book> getAllBooks() throws ServiceException;

    Book getBook(String title) throws ServiceException;

    boolean deleteBook(String title);

    List<Book> getBooksByAuthor(String authorName) throws ServiceException;

    boolean takeBook(Book book) throws ServiceException;
}
