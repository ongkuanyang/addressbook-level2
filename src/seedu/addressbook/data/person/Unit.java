package seedu.addressbook.data.person;

public class Unit {

    public final String value;

    public Unit(String unit) {
        this.value = unit;
    }

    @Override
    public String toString() {
        return this.value;
    }
}