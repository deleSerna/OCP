/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insatnceof;

import java.util.List;

/**
 *
 * @author ntv
 */
class Animal {
    
}


class Hippo extends Animal {
    
}
public class InsatnceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object h = new Hippo();
        Hippo h1 = null;
        Animal a = new Animal();
        if (h1 instanceof List ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
}
