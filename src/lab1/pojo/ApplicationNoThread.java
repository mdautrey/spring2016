package lab1.pojo;

import java.io.IOException;

/**
 * Created by mdautrey on 17/05/16.
 */
public class ApplicationNoThread {
    public static void main(String args[]){
        java.util.Scanner entree =   new java.util.Scanner(System.in);
        String fileName = args[0];
        int lines;

        System.out.println("Entrer le nombre de lignes : ");
        lines = entree.nextInt();

        DataAccess da = DataAccess.getInstanceOf(fileName);

        // creer un objet DataModel writer 1
        // ecrire 1000 lignes en debut de fichier de type numero ligne = getRandomString
        // chaque nouvelle ligne est au dessus de la precedente
        DataModel writer1 = new DataModel("writer1");
        ApplicationNoThread.writeLines(writer1, da, lines, true);


        // creer un objet DataModel writer 2
        // ecrire 1000 lignes en fin de fichier de type numero ligne = getRandomString
        // chaque nouvelle ligne est en dessous de la precedente
        DataModel writer2 = new DataModel("writer2");
        ApplicationNoThread.writeLines(writer2, da, lines, false);
    }
    public static void writeLines(DataModel writer, DataAccess da, int lines, boolean left){
        String text = "";
        try {
            text = da.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < lines; i++){
            if(left){
                text = writer.getRandomString() + "\n" +  text;
            }else{
                text += writer.getRandomString() + "\n";
            }
        }
        try {
            da.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
