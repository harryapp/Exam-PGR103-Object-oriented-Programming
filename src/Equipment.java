public abstract class Equipment {
    private final int id;
    private final String location;
    private final boolean needToBeReplaced;

    public Equipment(int id, String location, boolean needToBeReplaced) {
        this.id = id;
        this.location = location;
        this.needToBeReplaced = needToBeReplaced;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isNeedToBeReplaced() {
        return needToBeReplaced;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", needToBeReplaced=" + needToBeReplaced +
                '}';
    }
}
