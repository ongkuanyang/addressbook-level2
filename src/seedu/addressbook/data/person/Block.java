package seedu.addressbook.data.person;

public class Block {

    public final String value;

    public Block(String block) {
        this.value = block;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
