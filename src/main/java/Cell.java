public class Cell {

    private boolean uncovered = false;
    private boolean safe = true;

    public Cell(boolean safe) {
        this.safe = safe;
    }

    public boolean isUncovered() {
        return uncovered;
    }

    public void setUncovered(boolean uncovered) {
        this.uncovered = uncovered;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
}
