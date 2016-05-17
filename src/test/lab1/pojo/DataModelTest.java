package test.lab1.pojo; 

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import lab1.pojo.DataModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* DataModel Tester. 
* 
* @author <Authors name> 
* @since <pre>mai 17, 2016</pre> 
* @version 1.0 
*/ 
public class DataModelTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
    DataModel dm = new DataModel("toto");
    Assert.assertEquals(dm.getName(), "toto");

} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception {
    DataModel dm = new DataModel("toto");
    // avant
    Assert.assertEquals(dm.getName(), "toto");
    dm.setName("tutu");
    Assert.assertEquals(dm.getName(), "tutu");

} 

/** 
* 
* Method: getRandomString() 
* 
*/ 
@Test
public void testGetRandomString() throws Exception { 
//TODO: Test goes here...
    // je verifie que cela renvoie bien name + un nombre aleatoire


    DataModel dm = new DataModel("test1");

    // je verifie que la methode renvoie bien une chaine de caracteres commencant
    // par le nom getName

    // verifier que getRandomString contient bien le name de l objet
    assert(dm.getRandomString().contains(dm.getName()));

    // verifier que le getRandomString renvoie bien une chaine de caracteres commencant par des lettres
    // puis espace puis 1 a 2 chiffres
    assert(dm.getRandomString().matches("^[a-zA-Z0-9]+ [0-9]{1,2}$"));

} 


} 
