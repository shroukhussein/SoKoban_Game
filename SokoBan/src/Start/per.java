package Start;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class per implements Serializable
{
 private String name;
 private int steps,level_number;

    public per() 
    {
        
    }
    public per(String name, int steps, int level_number) {
        this.name = name;
        this.steps = steps;
        this.level_number = level_number;
    }
    public String getName() {
        return name;
    }

    public int getSteps() {
        return steps;
    }

    public int getLevel_number() {
        return level_number;
    }
 
}
