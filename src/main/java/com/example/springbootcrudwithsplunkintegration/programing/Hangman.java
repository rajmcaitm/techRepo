package com.example.springbootcrudwithsplunkintegration.programing;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private String word;
    private char[] guessedWord;
    private int lives;

    public Hangman() {
        word = "java";
        guessedWord = new char[word.length()];
        lives = 6;
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (lives > 0 && !isWordGuessed()) {
            printHangman();
            System.out.println("Lives: " + lives);
            System.out.println("Word: " + new String(guessedWord));
            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);
            if (isLetterInWord(letter)) {
                updateGuessedWord(letter);
            } else {
                lives--;
            }
        }
        if (isWordGuessed()) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Game over, the word was " + word);
        }
    }

    private void printHangman() {
        switch (lives) {
            case 6:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 5:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" /|   |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 2:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" /|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                break;
            case 1:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("     |");
                break;
            case 0:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("     |");
                break;
        }
    }

    private boolean isLetterInWord(char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    private void updateGuessedWord(char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord[i] = letter;
            }
        }
    }

    private boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.playGame();
    }
}