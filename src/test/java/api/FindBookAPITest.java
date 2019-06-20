package api;


import com.epam.utils.listener.Listener;
import com.epam.web.ConnectionFactory;
import com.epam.web.LibraryService;
import com.epam.web.soap.implementation.ServiceException;
import com.epam.web.soap.model.Book;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class FindBookAPITest extends FunctionalityTest {
    public Logger LOG = Logger.getLogger(FindBookAPITest.class);

    @Test(dataProvider = "getService")
    public void searchBookWithWrongTitle(String service) throws ServiceException {
        Book book = null;
        LOG.info("Search book with uncorrect input data");
        LibraryService libraryService = ConnectionFactory.getLibraryService(service);
        String bookTitle = "Split";
        LOG.info("Incorrect bookTitle is:" + bookTitle);
        book = libraryService.getBook(bookTitle);
    }

}


