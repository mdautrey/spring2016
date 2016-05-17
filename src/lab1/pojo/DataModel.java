package lab1.pojo;

/**
 * Created by mdautrey on 17/05/16.
 */
public class DataModel {
    private String name;

    // constructeur
    public DataModel(String name){
        this.name = name;
    }
    public String getRandomString(){
        // TODO : retourner la chaine nom + espace + nombre aleatoire entre 0 et 100
        return name;

    }

}
