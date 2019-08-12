import com.cinimex.test.model.InputString;
import com.cinimex.test.model.OutputString;
import com.cinimex.test.service.StringService;
import com.cinimex.test.service.impl.StringServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class StringServiceTest {
    @InjectMocks
    private StringServiceImpl stringService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getStringServiceTest() {
        InputString inputString = new InputString("ASdf   fF");
        assertEquals(new OutputString("asdf ff"), stringService.getOutputString(inputString));
    }
}
