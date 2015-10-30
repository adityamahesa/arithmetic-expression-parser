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
public class DFA {
    private final String word;
    private char symbol;
    private int index;
    private boolean valid;
    
    private enum State {
        q0(false),q1(false),q2(false),q3(true),q4(false);
        private State(boolean finalState){
            this.finalState = finalState;
        }
        private final boolean finalState;
        private boolean isFinalState(){
            return this.finalState;
        }
    }
    
    public DFA(String word){
        this.word = word;
        this.index = 0;
        this.symbol = this.word.charAt(this.index);
        operate();
    }
    
    public boolean isValid(){
        return this.valid;
    }
    
    private boolean readNext(){
        if(++this.index < this.word.length()){
            this.symbol = this.word.charAt(this.index);
            return true;
        }
        else return false;
    }
    
    private void operate(){
        State state = State.q0;
        do{
            state = switchState(state);
        }while(readNext());
        this.valid = state.isFinalState();
    }
    
    private State switchState(State state){
        switch(state){
            case q0 : 
                switch(symbol){
                    case '0' : return State.q1;
                    case '1' : return State.q0;
                }
            case q1 :
                switch(symbol){
                    case '0' : return State.q2;
                    case '1' : return State.q0;
                }
            case q2 :
                switch(symbol){
                    case '0' : return State.q2;
                    case '1' : return State.q3;
                }
            case q3 :
                switch(symbol){
                    case '0' : return State.q1;
                    case '1' : return State.q0;
                }
            default : return State.q4;
        }
                
    }
    
    
}
