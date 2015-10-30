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
    private String unit;
    private int token;
    
    public Lexic(){}
    
    public Lexic(String word, String unit, int token){
        this.word = word;
        this.unit = unit;
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
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the token
     */
    public int getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(int token) {
        this.token = token;
    }
}
