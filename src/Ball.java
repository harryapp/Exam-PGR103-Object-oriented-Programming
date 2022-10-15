public class Ball extends Equipment {
    private final BallType ballType;
    private final boolean needAirRefill;

    public Ball(int id, String location, boolean needToBeReplaced, BallType ballType, boolean needAirRefill) {
        super(id, location, needToBeReplaced);
        this.ballType = ballType;
        this.needAirRefill = needAirRefill;
    }

    public BallType getBallType() {
        return ballType;
    }

    public boolean isNeedAirRefill() {
        return needAirRefill;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballType=" + ballType +
                ", needAirRefill=" + needAirRefill +
                "} " + super.toString();
    }
}
