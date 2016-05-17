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
    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name;}
    public String getRandomString(){
        // TODO : retourner la chaine nom + espace + nombre aleatoire entre 0 et 100
        return getName() + " " + (int)(Math.random() * 100);
    }


    public static void main(String args[]){
        DataModel dm = new DataModel("test");
        for(int i = 0; i < 10; i++){
            System.out.println(dm.getRandomString());
        }
    }

}
