package lab1.pojo;

import java.io.*;

/**
 * Created by mdautrey on 17/05/16.
 */
public class DataAccess {
    //    private String content;
    // chemin d acces au fichier
    private String fileName;

    public DataAccess(String fileName){
        this.fileName = fileName;

    }

    public String read() throws IOException {
        // Todo : renvoyer le contenu du fichier texte sous forme d'une String
        String text = "";
        FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);

        while (br.readLine() != null) {
            text+= br.readLine();
        }
        in.close();
        return text;
    }
    public void write(String text) throws IOException {
        FileWriter out = new FileWriter(fileName);
        out.write(text);

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
