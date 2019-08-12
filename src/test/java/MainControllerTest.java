import com.cinimex.test.controller.MainController;
import com.cinimex.test.model.InputString;
import com.cinimex.test.model.OutputString;
import com.cinimex.test.service.StringService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {
    @InjectMocks
    MainController mainController;

    @Mock
    StringService stringService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getMainControllerTest() {
        InputString inputString = new InputString("Asdf   fDf   F e");
        OutputString outputString = new OutputString("asdf fdf f e");
        when(stringService.getOutputString(inputString)).thenReturn(outputString);
        assertEquals(outputString,mainController.getFormattedString(inputString));
    }
}
