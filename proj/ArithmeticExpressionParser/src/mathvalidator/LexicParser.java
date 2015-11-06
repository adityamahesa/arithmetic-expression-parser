/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathvalidator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class LexicParser extends DeterministicFiniteAutomata {

    private State
            A,B,C,D,E,
            F,G,H,I,J,
            K,L,M,N,O,
            P,Q,R,S,T,
            U,V,W,X
            ;
    private List<Lexic> lexicList;
    private String subWord;

    public LexicParser(String word) {
        super(word);
        lexicList = new ArrayList<>();
        subWord = "";
        super.operate();
        if(super.currentState.isFinalState()){
            if(subWord.length() > 0) storeSubWord(currentState.getToken());
        }
        else lexicList.clear();
            
    }
    
    @Override
    protected State switchState() {
        switch(super.currentState.getNumber()){
            /** TRANSITION FOR A */
            case 0: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.D;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR B */
            case 1: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.J;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.K;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR C */
            case 2: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.M;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    appendSubWord();
                    return this.H;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR D */
            case 3: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.D;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR E */
            case 4: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.D;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR F */
            case 5: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.D;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR G */
            case 6: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.D;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR H */
            case 7: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.I;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.I;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR I */
            case 8: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.N;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.O;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR J */
            case 9: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.J;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.V;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR K */
            case 10: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.J;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.K;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR L */
            case 11: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    lexicList.add(new Lexic(subWord.substring(0, subWord.length()-2), Token.BILANGAN));
                    subWord = String.valueOf(subWord.charAt(subWord.length()-1));
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.R;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    appendSubWord();
                    return this.P;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    lexicList.add(new Lexic(subWord.substring(0, subWord.length()-2), Token.BILANGAN));
                    subWord = String.valueOf(subWord.charAt(subWord.length()-1));
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR M */
            case 12: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.C;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.M;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    appendSubWord() ;
                    return this.H;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR N */
            case 13: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.N;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.U;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR O */
            case 14: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.N;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.O;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR P */
            case 15: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.Q;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    return this.X;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR Q */
            case 16: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.Q;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.T;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR R */
            case 17: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.R;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.W;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR S */
            case 18: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR T */
            case 19: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.Q;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.T;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR U */
            case 20: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.N;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.U;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.L;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR V */
            case 21: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.J;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.V;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            /** TRANSITION FOR W */
            case 22: switch(super.input){
                /**
                 * option for variable (except e)
                 */
                case 'a': case 'b': case 'c': case 'd': case 'f': 
                case 'g': case 'h': case 'i': case 'j': case 'k': 
                case 'l': case 'm': case 'n': case 'o': case 'p': 
                case 'q': case 'r': case 's': case 't': case 'u': 
                case 'v': case 'w': case 'x': case 'y': case 'z': 
                case 'A': case 'B': case 'C': case 'D': case 'F': 
                case 'G': case 'H': case 'I': case 'J': case 'K': 
                case 'L': case 'M': case 'N': case 'O': case 'P': 
                case 'Q': case 'R': case 'S': case 'T': case 'U': 
                case 'V': case 'W': case 'X': case 'Y': case 'Z': 
                case '_':
                /**
                 * action for variable (except e)
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for 1 until 9
                 */
                case '1': case '2': case '3': case '4': case '5': 
                case '6': case '7': case '8': case '9': 
                /**
                 * action for 1 until 9
                 */
                    appendSubWord();
                    return this.R;
                /**
                 * end of option
                 */
                /**
                 * option for zero
                 */
                case '0':
                /**
                 * action for zero
                 */
                    appendSubWord();
                    return this.W;
                /**
                 * end of option
                 */
                /**
                 * option for * and /
                 */
                case '*': case '/': 
                /**
                 * action for * and /
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for + and -
                 */
                case '+': case '-': 
                /**
                 * action for + and -
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.G;
                /**
                 * end of option
                 */
                /**
                 * option for (
                 */
                case '(':
                /**
                 * action for (
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.E;
                /**
                 * end of option
                 */
                /**
                 * option for )
                 */
                case ')':
                /**
                 * action for )
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.F;
                /**
                 * end of option
                 */
                /**
                 * option for e
                 */
                case 'e': case 'E': 
                /**
                 * action for e
                 */
                    storeSubWord();
                    appendSubWord();
                    return this.B;
                /**
                 * end of option
                 */
                /**
                 * option for point (.)
                 */
                case '.':
                /**
                 * action for point (.)
                 */
                    return this.X;
                /**
                 * end of option
                 */
                default: return this.X;
            }
            default: return this.X;
        }
    }

    @Override
    protected void identifyState() {
        A = new State(0, false, Token.NOT_FINAL_STATE);
        B = new State(1, true, Token.VARIABEL);
        C = new State(2, true, Token.BILANGAN);
        D = new State(3, true, Token.BILANGAN);
        E = new State(4, true, Token.KURUNG_BUKA);
        F = new State(5, true, Token.KURUNG_TUTUP);
        G = new State(6, true, Token.OPERATOR);
        H = new State(7, false, Token.NOT_FINAL_STATE);
        I = new State(8, true, Token.BILANGAN);
        J = new State(9, true, Token.VARIABEL);
        K = new State(10, true, Token.VARIABEL);
        L = new State(11, false, Token.NOT_FINAL_STATE);
        M = new State(12, true, Token.BILANGAN);
        N = new State(13, true, Token.BILANGAN);
        O = new State(14, true, Token.BILANGAN);
        P = new State(15, false, Token.NOT_FINAL_STATE);
        Q = new State(16, true, Token.BILANGAN);
        R = new State(17, true, Token.BILANGAN);
        S = new State(18, true, Token.NOT_FINAL_STATE);
        T = new State(19, true, Token.BILANGAN);
        U = new State(20, true, Token.BILANGAN);
        V = new State(21, true, Token.VARIABEL);
        W = new State(22, true, Token.BILANGAN);
        X = new State(99, false, Token.NOT_FINAL_STATE);
        
        super.currentState = A;
    }
    
    private void appendSubWord(){
        this.subWord += super.input;
    }
    
    private void flushSubWord(){
        this.subWord = "";
    }
    
    private void storeSubWord(Token token){
        this.lexicList.add(new Lexic(subWord, token));
        flushSubWord();
    }
    
    private void storeSubWord(){
        this.lexicList.add(new Lexic(subWord, currentState.getToken()));
        flushSubWord();
    }
    
    public List<Lexic> getLexicList(){
        return this.lexicList;
    }
    
}
