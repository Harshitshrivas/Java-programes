import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filee {
    public static void main(String[] args) throws IOException {

        // creating a file
        File myfile = new File("Harshit.txt");
        myfile.createNewFile();

        // writing a file 
        try (FileWriter filewriter = new FileWriter("Harshit.txt")) {
            filewriter.write("My name is Harsht And i am a boy \n hogyaaa");
        }

        // reading a file
        File Myfile = new File("Harshit.txt");
        Scanner sc = new Scanner(Myfile);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line); 
        }

        // checking a  files
        File f = new File("Harshit.txt");
        System.out.println(f.exists());

        // deleting a file 
        // File deletFile = new File("Harshit.txt");
        //   //  deletFile.delete();  , yesa direct delete kardo ,ya nicha ki tarh check karlo 
        // if(deletFile.delete()){
        //     System.out.println("File was deleted" + deletFile.getName());
        // }else{
        //     System.out.println("Some error are occured");
        // }
    
    }
}
