public class point {
    private int x;
    private int y;
    int z;

    public point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] z = new int[2];
        z[0] = x;
        z[1] = y;
        return z;

    }

    public static void main(String[] args) {
        point p1 = new point(3, 5);
        System.out.println(" X is" + p1.getX());
        System.out.println(" Y is" + p1.getY());
        p1.setX(5);
        System.out.println(" X is" + p1.getX());
        p1.setY(10);
        System.out.println(" Y is" + p1.getY());
        p1.setXY(2, 4);
        int[] data = p1.getXY();
        System.out.println(" X is" + data[0]);
        System.out.println(" Y is" + data[1]);
    }
}