/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package IntegerSort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class SortTest {

    private List<Integer> intList() {
        return Arrays.asList();
    }

    private void assertSorted(List<Integer> unsorted, List<Integer> sorted) {
        assertThat(sort(unsorted), is(sorted));
    }

    @Test
    public void sortings() throws Exception {
        assertSorted(intList(), intList());
    }

    private List<Integer> sort(List<Integer> list) {
        return null;
    }
}
