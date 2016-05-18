package lab1.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lab1/pojo/spring-config.xml");
        DataModel dataModel = (DataModel) applicationContext.getBean(DataModel.class);
        dataModel.setName("writer1");

        // creer un objet DataModel writer 1
        // ecrire 1000 lignes en debut de fichier de type numero ligne = getRandomString
        // chaque nouvelle ligne est au dessus de la precedente
        dataModel.writeLines(fileName, lines, true);


        // creer un objet DataModel writer 2
        // ecrire 1000 lignes en fin de fichier de type numero ligne = getRandomString
        // chaque nouvelle ligne est en dessous de la precedente
        dataModel.setName("writer2");
        dataModel.writeLines(fileName, lines, false);
    }
}
