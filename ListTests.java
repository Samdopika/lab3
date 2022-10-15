import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {	
    @Test
    public void filterTest(){
        StringChecker sc = new wordFunction();
        List<String> list1 = Arrays.asList("Saman", "sharon","Brian","Ashley");
        String[] expectedArr = {"Saman","Brian"};
        assertArrayEquals(expectedArr, ListExamples.filter(list1, sc).toArray());
    }

}