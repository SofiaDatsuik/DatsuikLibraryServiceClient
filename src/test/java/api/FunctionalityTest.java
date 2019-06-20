package api;

import com.epam.web.ConnectionFactory;
import org.testng.annotations.DataProvider;

public class FunctionalityTest {


    @DataProvider
    protected Object[] getService() {
        return new Object[]{ConnectionFactory.getLibraryService("REST"),
                            ConnectionFactory.getLibraryService("SOAP")};
    }
}
