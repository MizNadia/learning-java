package file;

import java.io.*;

/**
 * Created by nadezhda on 26/09/17.
 */
public class FileExample {

    public static void main(String[] args) {
//        File file = new File(".idea//misc1.xml");
//        System.out.println(file.exists());
//        File dir = new File(".idea");
//        System.out.println("dir exists = " + dir.exists());
//        System.out.println("Is dir = " + file.isDirectory());
//        System.out.println("Is file = " + file.isFile());
//
//        File newFile = new File("text.txt");
//        File newDir = new File("test");
//
//        newDir.mkdir();
//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("text.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader(file)
            );

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
        } finally {
        if(reader != null){
            try{
                reader.close();
            } catch (IOException e)
        }
    }
}
