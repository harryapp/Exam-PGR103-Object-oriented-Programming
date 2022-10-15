public class TableTennisRacket extends Equipment {
    private final boolean needNewCoating;

    public TableTennisRacket(int id, String location, boolean needToBeReplaced, boolean needNewCoating) {
        super(id, location, needToBeReplaced);
        this.needNewCoating = needNewCoating;
    }

    public boolean isNeedNewCoating() {
        return needNewCoating;
    }

    @Override
    public String toString() {
        return "TableTennisRacket{" +
                "needNewCoating=" + needNewCoating +
                "} " + super.toString();
    }
}
