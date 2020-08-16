import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Datos {
    private static List<String[]> data = new ArrayList<>();

    public static void LeerArchivo(){
        File dataFile = new File("lite.csv");
        try {
            FileReader fr = new FileReader(dataFile);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine())!=null) {
                data.add(line.split(";"));
            } 
        } catch (IOException x) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        Datos.LeerArchivo();
        for (String[] a : data) {
            for (String a2 : a) {
                System.out.print(a2);
            }
            System.out.println();
        }
    }
}