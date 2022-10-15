import static org.junit.Assert.*;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void listLengthCheck(){
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        assertEquals(4, ll.length());
    }

    @Test 
    public void checkFirst(){
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        assertEquals(1, ll.first());
        assertEquals(4, ll.last());
    }

    @Test
    public void emptyList(){
        LinkedList ll = new LinkedList();

        assertEquals(0, ll.length());
    }
}