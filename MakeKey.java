import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeKey {
    public static void main(String[] args) {
//        System.out.println("I am implement");

        updateKey("sd");

    }


    public static void updateKey(String test){
        File file = new File(".env");
        Map<String,String> map = new HashMap<>();
        try{
            Scanner scan=new Scanner(file);
            while (scan.hasNextLine()){
                String line= scan.nextLine();
                String[] array = line.split("=");
                String key = array[0].trim();
                String value = (array.length > 1) ? array[1].trim() : "";

                if (key.startsWith("SECRET_KEY")) {
                    map.put(key, "test");
                } else {
                    map.put(key, value);
                }

            }
        }catch (Exception a){

        }

        System.out.println(map.entrySet());
    }
}
