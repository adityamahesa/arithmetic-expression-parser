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
    protected State currentState;
    
    protected DeterministicFiniteAutomata(String word){
        identifyState();
        this.word = word;
        if(word.length() > 0){
            initiateState();
        }
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
        do{
            this.currentState = switchState();
        }while(readNext());
    }
    
    protected abstract void identifyState();
    
    protected final boolean isValid(){
        return this.currentState.isFinalState();
    }
}
