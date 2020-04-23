package pti.gyak;

public enum Operation {
    ADD("+"),
    SUBSTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    REMAINDER("%"),
    POWER("^"),
    SQRT("sqrt"),
    clear("C");

    private String text;

    Operation(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
