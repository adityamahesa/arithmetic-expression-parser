/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathvalidator;

/**
 *
 * @author USER
 */
public class State {
    private final int number;
    private final boolean finalState;
    private final Token token;
        
    public State(int number, boolean finalState){
        this.number = number;
        this.finalState = finalState;
        this.token = null;
    }
    
    public State(int number, boolean finalState, Token token) {
        this.number = number;
        this.finalState = finalState;
        this.token = token;
    }
    public int getNumber(){
        return this.number;
    }
    public boolean isFinalState(){
        return this.finalState;
    }
    public Token getToken(){
        return this.token;
    }
}
