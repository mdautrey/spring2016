package lab1.pojo;

/**
 * Created by mdautrey on 17/05/16.
 */
public class DataAccess {
    public String read(){
        // Todo : renvoyer le conteu du fichier texte sous forme d'une String
        return null;
    }
    public void write(String text){
        // Todo : ecrire texte dans le fichier

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
