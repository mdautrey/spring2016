package lab1.pojo;

import javafx.scene.chart.PieChart;

import java.io.*;

/**
 * Created by mdautrey on 17/05/16.
 */
public class DataAccess implements DataAccessInterface {
    //    private String content;
    // chemin d acces au fichier
    private String fileName;
    private static DataAccess dataAccess;

    private DataAccess(String fileName){
        this.fileName = fileName;

    }
    public static DataAccess getInstanceOf(String fileName){
        if(dataAccess == null){
            dataAccess = new DataAccess(fileName);
        }
        return dataAccess;
    }

    public String read() throws IOException {
        // Todo : renvoyer le contenu du fichier texte sous forme d'une String
        String text = "";
        FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);

        String line;
        while ((line = br.readLine()) != null) {
            text+= line;
        }
        in.close();
        return text;
    }
    public void write(String text) throws IOException {
        PrintWriter out = new PrintWriter(fileName);
        out.print(text);
        out.close();

    }
    public DataAccess getInstance(String file){
        // Todo : retourner un objet de type data access qui permette de lire/ecrire dans le fichier
        return null;
    }
    public void syncCache(){
        // met les donnees en cache
    }
    public void writeIntoCache(String text){
        // ecrit dans le cache
    }
    public String readIntoCache(){
        // lit en cache
        return null;
    }
    public void flushCache(){
        // ecrit le cache dans le fichier
    }
    public static void main(String args[]){
        String fileName = "file.txt";
        DataAccess da = new DataAccess(fileName);
        try {
            System.out.println(da.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            da.write("\nnouveau test\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(da.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
