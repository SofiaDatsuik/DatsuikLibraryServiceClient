package api;

import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.implementation.ServiceException;
import com.epam.web.soap.model.Book;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GetAllBookAPITest extends FunctionalityTest {
    private  LibraryService libraryService;
    private Logger LOG = Logger.getLogger(GetAllBookAPITest.class);

    @Test(dataProvider = "getService")
    public void getAllUsersTest() throws ServiceException {
        LOG.info("getAllUsersTest");
        libraryService = ConnectionFactory.getLibraryService("REST");
        List<Book> books = libraryService.getAllBooks();
        Assert.assertTrue(books.size()!=0);
    }
}
