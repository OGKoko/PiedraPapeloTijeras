package com.company;


public class GamePrinter {

    public static void printInstructions(){

        System.out.println("");
        System.out.println("Escoja Piedra(0), Papel(1) or Tijera(2).");


    }

    public static void optionNotValid() {
        System.out.println("Has de introducir un numero entre 0 y 2");
    }

    public static void printComputerMove(Move move){
        System.out.println("El pecé escojeee...: " + move);
    }


    public static void printResult(Result result, GameState game){
        if (result.equals(Result.COMPUTER) || result.equals(Result.HUMAN)) {
            System.out.println(result.name() + " Ganaste!!!");
        }
        else {
            System.out.println("Empate :/");
        }

        System.out.println("Puntuacion actual: ");
        System.out.println("Tú: " + game.getHumanScore());
        System.out.println("puntuación de la pesé: " + game.getComputerScore());


    }

    public static void printWinner(Result result){
        System.out.println( result.name() + " Ha ganado");
    }

}
