package edu.leandro.primeirasemana;

public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6)
            System.out.println("REPROVDO");
        else if (mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
