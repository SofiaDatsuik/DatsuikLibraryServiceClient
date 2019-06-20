package api;

import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.implementation.ServiceException;
import com.epam.web.soap.model.Book;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindBookByAuthorNameAPITest {

    public Logger LOGGER = Logger.getLogger(FindBookAPITest.class);
    public Book[] books = {new Book("A Game of Thrones", "George Martin", "fantasy"),
            new Book("A Clash of Kings", "George Martin", "fantasy"),
            new Book("A Feast for Crows", "George Martin", "fantasy"),
            new Book("A Dance with Dragons", "George Martin", "fantasy"),
            new Book("The Winds of Winter", "George Martin", "fantasy")};

    @BeforeMethod
    public void setUP() {
        LibraryService service = ConnectionFactory.getLibraryService("REST");
        try {
            service.takeBook(books[0]);
            service.takeBook(books[1]);
            service.takeBook(books[2]);
            service.takeBook(books[3]);
            service.takeBook(books[4]);
        } catch (ServiceException e) {
            LOGGER.info(e.getMessage());
        }

    }

    @Test
    public void getFiveAuthorsBooksRest() {
        LOGGER.info("getFiveAuthorsBooks");
        LibraryService service = ConnectionFactory.getLibraryService("REST") ;
        List<Book> bookList = null;
        try {
            bookList = service.getBooksByAuthor("George Martin");
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(bookList);

        Assert.assertTrue(bookList.size() == 5);
    }

//    @Test
//    public void getFiveAuthorsBooksSoap() {
//        LOGGER.info("getFiveAuthorsBooks");
//        LibraryService service = ServiceFactory.getLibraryService(ServiceFactory.SOAP);
//        List<Book> bookList = null;
//        try {
//            bookList = service.getAuthorBooks("George Martin", 5);
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        }
//
//        Assert.assertNotNull(bookList);
//
//        Assert.assertTrue(bookList.size() == 5);
//    }
//
//    @Test(expectedExceptions = ServiceException.class)
//    public void getAuthorsBooksFaultNumberRest() throws ServiceException {
//        LOGGER.info("getFiveAuthorsBooks");
//        LibraryService service = ServiceFactory.getLibraryService(ServiceFactory.REST);
//        List<Book> bookList = null;
//
//        bookList = service.getAuthorBooks("George Martin", 100);
//
//        Assert.assertNull(bookList);
//
//        Assert.assertTrue(bookList.size() > 5);
//    }
//
//    @Test(expectedExceptions = ServiceException.class)
//    public void getAuthorsBooksFaultNumberSoap() throws ServiceException {
//        LOGGER.info("getFiveAuthorsBooks");
//        LibraryService service = ServiceFactory.getLibraryService(ServiceFactory.SOAP);
//        List<Book> bookList = null;
//
//        bookList = service.getAuthorBooks("George Martin", 1000);
//
//        Assert.assertNull(bookList);
//
//        Assert.assertTrue(bookList.size() > 5);
//    }
//
//    @AfterMethod
//    public void after() {
//        LibraryService service = ServiceFactory.getLibraryService(ServiceFactory.REST);
//        try {
//            service.removeBook(books[0].getName());
//            service.removeBook(books[1].getName());
//            service.removeBook(books[2].getName());
//            service.removeBook(books[3].getName());
//            service.removeBook(books[4].getName());
//        } catch (ServiceException e) {
//            LOGGER.info(e.getMessage());
//        }
//    }
}
