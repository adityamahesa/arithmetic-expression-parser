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
        try {
            String word = args[0];
            LexicParser parser = new LexicParser(word);
            System.out.println("Validasi Tahap - 1:\t"+parser.isValid());
            System.out.println("Kata\t\tLexic\t\tToken Lexic");
            for (Lexic lexic : parser.getLexicList()) {
                System.out.println(lexic.getWord()+"\t\t"+lexic.getToken()+"\t"+lexic.getToken().getValue());
            }
        } catch (Exception e) {
            System.out.println("Hint: java -jar ArithmeticExpressionParser.jar <your_arithmetic_expression>");
        }
    }
    
}
