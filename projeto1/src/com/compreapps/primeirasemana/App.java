package com.compreapps.primeirasemana;
public class App {
    public static void main(String[] args) {

        String firstName = "jonatas";
        String secondName = "almeida";

        String nomeCompleto =  nomeCompleto(firstName, secondName);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String firstName, String secondName){
        return "Resultado do método: " + firstName.concat(" ").concat(secondName) ;
    }
}
