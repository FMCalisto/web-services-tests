package example;

/**
 *  This example class stores a greeting and
 *  produces greetings with name.
 */
public class Example {

    // main

    public static void main(String[] args) throws Exception {
        Example example = new Example();
        example.setGreeting("Hi");
        String result = example.greet("friend");
        System.out.println(result);
    }

    // members

    private String greeting = "Hello";

    // accessors

    public void setGreeting(String greeting) {
        if (greeting == null || greeting.length() == 0)
            throw new IllegalArgumentException();
        this.greeting = greeting;
    }

    public String getGreeting() {
        return this.greeting;
    }

    // other methods

    public String greet(String name) {
        if (name == null)
            throw new IllegalArgumentException();
        if (name.length() == 0)
            return this.greeting + "!";
        return this.greeting + " " + name + "!";
    }

}
