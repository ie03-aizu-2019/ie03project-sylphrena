class Line {
    private Point A, B;
    //Y = MX + Yh
    private double M;
    private double Yh;
    Line(Point A, Point B){
        this.A = A;
        this.B = B;
        //System.out.println("(" + A.getY() + "-" + B.getY() + ")/(" + A.getX() + "-" + B.getX() +")");
        M = (A.getY()-B.getY())/(A.getX()-B.getX());
        Yh = M * A.getX() - A.getY();
    }

    Point getPointA(){
        return A;
    }

    Point getPointB(){
        return B;
    }

    double getM(){
        return M;
    }

    double getYh(){
        return Yh;
    }

}
