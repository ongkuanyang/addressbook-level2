package seedu.addressbook.data.person;

public class PostalCode {

    public final String value;

    public PostalCode(String postalCode) {
        this.value = postalCode;
    }

    @Override
    public String toString() {
        return this.value;
    }
}