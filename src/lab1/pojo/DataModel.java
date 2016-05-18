package lab1.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by mdautrey on 17/05/16.
 */
@Component
public class DataModel {
    private String name = "test";
    private DataAccessInterface dataAccess;

    public DataModel(DataAccessInterface dataAccess){
        this.dataAccess = dataAccess;
        this.name = "test";
    }

    public DataModel() {
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name;}
    public String getRandomString(){
        // TODO : retourner la chaine nom + espace + nombre aleatoire entre 0 et 100
        return getName() + " " + (int)(Math.random() * 100);
    }

    public void writeLines(String fileName, int lines, boolean left){

        String text = "";
        try {
            text = dataAccess.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < lines; i++){
            if(left){
                text = "\n" + this.getRandomString()  +  text;
            }else{
                text += this.getRandomString() + "\n";
            }
        }
        try {
            dataAccess.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
