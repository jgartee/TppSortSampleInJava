/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package IntegerSort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTest {

    private List<Integer> intList(Integer... ints) {
        return Arrays.asList(ints);
    }

    private void assertSorted(List<Integer> unsorted, List<Integer> sorted) {
        assertThat(sort(unsorted), is(sorted));
    }

    @Test
    public void sortings() throws Exception {
        assertSorted(intList(), intList());
        assertSorted(intList(1), intList(1));
        assertSorted(intList(2, 1), intList(1, 2));
    }

    private List<Integer> sort(List<Integer> list) {
        List<Integer> sorted = new ArrayList<Integer>();

        if (list.size() <= 1) {
            return list;
        }

        if (list.get(0) > list.get(1)) {
            sorted.add(list.get(1));
            sorted.add(list.get(0));
        } else {
            sorted.add(list.get(0));
            sorted.add(list.get(1));
        }

        return sorted;
    }
}
