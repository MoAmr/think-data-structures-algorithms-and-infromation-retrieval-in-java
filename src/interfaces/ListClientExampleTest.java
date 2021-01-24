package interfaces;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 25/01/2021 - 01:10
 * @project think-data-structures
 */
public class ListClientExampleTest {

    /**
     * Test method for {@link ListClientExample}.
     */
    @Test
    public void testListClientExample() {

        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        assertThat(list, instanceOf(ArrayList.class));
    }
}
