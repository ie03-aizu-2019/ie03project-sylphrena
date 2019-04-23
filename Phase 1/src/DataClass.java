import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

class DataClass {
    private Line[] LineList;

    DataClass (String Filename) {


        Scanner scan = null;
        File file = new File("Phase 1/in/" + Filename);
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(Objects.requireNonNull(scan).hasNextDouble())
        {
            //System.out.println( scan.nextDouble() );
            int N = scan.nextInt();
            int M = scan.nextInt();
            int P = scan.nextInt();
            int Q = scan.nextInt();
            Point[] pointList = new Point[N];
            for(int i = 0; i < pointList.length; i++){
                pointList[i] = new Point(scan.nextDouble(),scan.nextDouble());
            }
            LineList = new Line[M];
            for(int i = 0; i < LineList.length; i++){
                LineList[i] = new Line(pointList[scan.nextInt()-1], pointList[scan.nextInt()-1]);
            }
        }
    }

    private boolean printFindCrossPoint(Line A, Line B){

        double interX = (A.getYh()-B.getYh())/(A.getM()-B.getM());
        double interY = A.getM() * interX + A.getYh();

        //System.out.println("inter point = ( " + interX + ", " + interY + " )");

        if(((A.getPointA().getX() >= interX && interX >= A.getPointB().getX()) || (A.getPointA().getX() <= interX && interX <= A.getPointB().getX()))&&((B.getPointA().getX() >= interX && interX >= B.getPointB().getX()) || (B.getPointA().getX() <= interX && interX <= B.getPointB().getX()))&&((A.getPointA().getY() >= interY && interY >= A.getPointB().getY()) || (A.getPointA().getY() <= interY && interY <= A.getPointB().getY()))&&((B.getPointA().getY() >= interY && interY >= B.getPointB().getY()) || (B.getPointA().getY() <= interY && interY <= B.getPointB().getY()))) {
            new Point(interX, interY).printPoint();
            return true;
        }
        else return false;


    }

    void printAllCrossPoint(){
        int FoundCpunt = 0;
        for(int i = 0; i < LineList.length -1 ; i++ ){
            for(int j = i + 1 ; j < LineList.length; j++){
                if(printFindCrossPoint(LineList[i], LineList[j])) {
                    FoundCpunt++;
                }
            }
        }
        if(FoundCpunt == 0){
            System.out.println("NA");
        }
    }


}