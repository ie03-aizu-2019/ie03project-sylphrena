import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class readInput
{

    readInput(String Filename) throws FileNotFoundException {

        Scanner scan;
        File file = new File("Phase 1/in/" + Filename);
        scan = new Scanner(file);

        while(scan.hasNextDouble())
        {
            System.out.println( scan.nextDouble() );
        }
    }
}