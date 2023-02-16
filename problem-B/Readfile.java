import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {    public static void main(String[] args)throws FileNotFoundException {



            String[] arr = new String[1000];
            int numOfLine =0;
           String Filepath="src/file.txt";
           readFile("src/file.txt",arr,numOfLine);

        }

        public static void readFile(String FilePath , String[] arr , int numOfLine) throws FileNotFoundException {
            File file = new File(FilePath);
            Scanner dazai = new Scanner(file);
            for (int i = 0; i < 1000; i++) {
                try {
                    arr[i] = dazai.nextLine();
                    System.out.println("["+i+"]"+" "+ arr[i]);
                    numOfLine++;
                }catch (Exception e){
                    break;
                }
            }
            System.out.println("Number of line is: " + numOfLine);


   }
}
