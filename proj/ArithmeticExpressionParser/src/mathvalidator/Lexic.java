package mathvalidator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adityamahesa
 */
public class Lexic {
    private String word;
    private Token token;
    
    public Lexic(){}
    
    public Lexic(String word, Token token){
        this.word = word;
        this.token = token;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the token
     */
    public Token getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(Token token) {
        this.token = token;
    }
    
}
