class Point {
    private double X;
    private double Y;
    Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    double getX() {
        return X;
    }

    double getY() {
        return Y;
    }

    void printPoint(){
        System.out.println("( " + X + ", " + Y + " )");
    }
}
