/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathvalidator;

/**
 *
 * @author adityamahesa
 */
public class ArithmeticExpressionParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = "";
        System.out.println(new LexicParser("((()))+-+-+/*/*/").isValid());
    }
    
}
