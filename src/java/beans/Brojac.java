/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Obuka
 */
@Named(value="brojac")
@Dependent
public class Brojac {

    public Brojac() {
    }
    
    public String poruka () {
        return "nova poruka brojaca";
    }
    
}
