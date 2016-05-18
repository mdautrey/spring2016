package lab1.pojo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


@Component
public class DataAccess implements DataAccessInterface {
    //    private String content;
    // chemin d acces au fichier
    private String fileName = "file.txt";


    public String read() throws IOException {
        // Todo : renvoyer le contenu du fichier texte sous forme d'une String
        String text = "";
        FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);

        String line;
        while ((line = br.readLine()) != null) {
            text+= line + "\n";
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
}
