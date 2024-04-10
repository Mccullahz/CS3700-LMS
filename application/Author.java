//Written by ALiilani McGuire

package application;

public class Author {
    private String first_name, last_name;

    public Author() {
        first_name = "John";
        last_name = "Doe";
    }

    public Author(String fn, String ln) {
        first_name = fn;
        last_name = ln;
    }

    public void setFirstName(String fn) { first_name = fn; }
    public void setLastName(String ln) { last_name = ln; }
    public String getFirstName() { return first_name; }
    public String getLastName() { return last_name; }
}