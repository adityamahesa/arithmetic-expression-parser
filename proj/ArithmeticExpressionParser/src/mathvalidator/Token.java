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
public enum Token {
    NOT_FINAL_STATE(0),VARIABEL(1),BILANGAN(2),OPERATOR(3),KURUNG_BUKA(4),KURUNG_TUTUP(5);
    
    private final int value;
    
    Token(int value){
        this.value = value;
    }
    
    int getValue(){
        return this.value;
    }
}
