package example;

import org.junit.*;
import static org.junit.Assert.*;


/**
 *  Test suite
 */
public class ExampleTest {

    // static members


    // one-time initialization and clean-up

    @BeforeClass
    public static void oneTimeSetUp() {

    }

    @AfterClass
    public static void oneTimeTearDown() {

    }


    // members

    private Example example;


    // initialization and clean-up for each test

    @Before
    public void setUp() {
        example = new Example();
    }

    @After
    public void tearDown() {
        example = null;
    }


    // tests

    @Test
    public void testGetDefaultGreeting() {
        assertEquals(/*expected*/ "Hello", /*actual*/ example.getGreeting());
    }

    @Test
    public void testSetGetGreeting() {
        final String greeting = "Olá";
        example.setGreeting(greeting);
        assertEquals(greeting, example.getGreeting());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullGreeting() {
        // this test should throw an exception of the class above
        example.setGreeting(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyGreeting() {
        example.setGreeting("");
    }

    @Test
    public void testDefaultGreet() {
        assertEquals("Hello friend!", example.greet("friend"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetWithNullName() {
        example.greet(null);
    }

    @Test
    public void testGreetWithEmptyName() {
        // empty name should be allowed
        assertEquals("Hello!", example.greet(""));
    }

    @Test(expected=ExampleException.class)
    public void testExceptionWithAnnotation() throws Exception {

        // ... code that must throw an exception

        // JUnit expects the exception declared in the annotation
        // if it is not thrown, the test fails
    }

    @Test
    public void testExceptionWithoutAnnotation() throws Exception {
        try {

            // ... code that must throw an exception

            fail();
        } catch (Exception e) {
            // expected
            // check message of exception etc
        }
    }

}
