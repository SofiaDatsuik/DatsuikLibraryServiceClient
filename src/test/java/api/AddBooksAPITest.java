package api;

import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.Book;
import com.epam.web.soap.ServiceException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBooksAPITest extends FunctionalDataProvider {
    Book book = new Book("Sa", "jfd", "jfdj");


    @Test(dataProvider = "getData")
    public void addBookTestService(LibraryService libraryService) throws ServiceException {
        libraryService = ConnectionFactory.getLibraryService("REST");
        libraryService.takeBook(book);
        Assert.assertNotNull(libraryService);
    }

    @Test(dataProvider = "getData")
    public void deleteBookTestService(LibraryService libraryService) throws ServiceException{
        libraryService = ConnectionFactory.getLibraryService("SOAP");
        libraryService.deleteBook("jfdj");
        Assert.assertFalse(book.getTitle()==null);
    }
}
