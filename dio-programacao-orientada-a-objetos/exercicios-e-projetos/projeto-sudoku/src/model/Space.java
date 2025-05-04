package model;

public class Space {

    private Integer actual;
    private final int expected;
    private final boolean fixed;

    public Space(int esperado, boolean fixado) {
        this.expected = esperado;
        this.fixed = fixado;
        if (fixado) {
            actual = esperado;
        }
    }

    public void setActual(Integer actual) {
        if (fixed) {
            return;
        }
        this.actual = actual;
    }

    public void erase() {
        setActual(null);
    }

    public Integer getActual() {
        return actual;
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
