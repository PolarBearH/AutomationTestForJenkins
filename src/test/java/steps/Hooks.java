package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.SortedMap;

public class Hooks {

    @Before
    public void beforeS (){
        System.out.println("---- BEFORE ----");
    }

    @After
    public void afterS (){
        System.out.println("---- AFTER ----");
    }


}
