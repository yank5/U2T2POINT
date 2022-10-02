public class Point {
    private int setX;
    private int setY;
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x) {
        this.x = x;
        this.y = x;
    }

    Point() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String coordinate() {
        return "(" + getX() + "," + getY() + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        }
        if (x < 0 && y > 0) {
            return "II";
        }
        if (x < 0 && y < 0) {
            return "III";
        }
        if (x > 0 && y < 0) {
            return "IV";
        }
        if (x == 0 || y == 0) {
            if (x == 0 && y == 0) {
                return "on origin";
            }
            return "on axis";
        } else {
            return null;
        }
    }
}