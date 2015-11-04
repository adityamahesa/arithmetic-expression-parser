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
public abstract class DeterministicFiniteAutomata{
    protected final String word;
    protected String subWord;
    protected char input;
    protected int index;    
    protected class State{
        private final int number;
        private final boolean finalState;
        private State(boolean finalState){
            this.number = 0;
            this.finalState = finalState;
        }
        protected State(int number, boolean finalState){
            this.number = number;
            this.finalState = finalState;
        }
        protected int getNumber(){
            return this.number;
        }
        protected boolean isFinalState(){
            return this.finalState;
        }
    }
    protected State initialState; 
    protected State currentState;
    
    protected DeterministicFiniteAutomata(String word, boolean initialStateIsFinalState){
        identifyState();
        this.word = word;
        this.initialState = new State(initialStateIsFinalState);
        if(word.length() > 0){
            initiateState();
            operate();
        }
        else this.currentState = this.initialState;
    }
    
    protected final void initiateState(){
        this.index = 0;
        this.input = this.word.charAt(this.index);
    }
    
    protected final boolean readNext(){
        if(++this.index < word.length()){
            this.input = this.word.charAt(this.index);
            return true;
        }
        else return false;
    }
    
    protected abstract State switchState();
    
    protected final void operate(){
        this.currentState = this.initialState;
        do{
            this.currentState = switchState();
        }while(readNext());
    }
    
    protected abstract void identifyState();
    
    protected final boolean isValid(){
        return this.currentState.isFinalState();
    }
}
