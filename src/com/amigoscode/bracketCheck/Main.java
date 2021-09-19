package com.amigoscode.bracketCheck;

public class Main {

    public static void main(String[] args) {

        BracketChecker bc = new BracketChecker();

        System.out.println(bc.checkBracket("({()})"));
        System.out.println(bc.checkBracket("({})"));
        System.out.println(bc.checkBracket("()"));
        System.out.println(bc.checkBracket("({( })"));
        System.out.println(bc.checkBracket("({()}"));
        System.out.println(bc.checkBracket("<({[]})>"));

        System.out.println(bc.checkBracket(""));
        System.out.println(bc.checkBracket("aaa"));
        System.out.println(bc.checkBracket("<>{}"));

    }

}
