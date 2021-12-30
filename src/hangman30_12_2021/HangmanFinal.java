package hangman30_12_2021;

import java.util.Scanner;

import java.util.*;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class HangmanFinal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter any word for the game: ");
		String word = s.next();

		char[] wordToElements = stringToChar(word);
		boolean[] gameState = new boolean[wordToElements.length];

		System.out.print("Do you want to start a game?(true/false) ");
		boolean doYouWantToStart = s.nextBoolean();

		System.out.println();
		System.out.println("********** GAME START **********");
//mistake index		
		int mIndex = 0;

		while (doYouWantToStart && !isGameOver(gameState, mIndex)) {

			System.out.println();
			System.out.print("Enter a letter: ");
			char letter = s.next().charAt(0);

			if (isValidMove(wordToElements, gameState, letter)) {
				printWord(wordToElements, gameState, letter);
			} else {
				mIndex++;
				System.out.println();
				printHangman(mIndex);
			}

		}
		System.out.println("********** GAME OVER **********");

	}

//stringToChar
	public static char[] stringToChar(String word) {
		char[] characters = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			characters[i] = word.charAt(i);
		}
		return characters;
	}

//printWord
	public static void printWord(char[] wordToElements, boolean[] gameState, char letter) {
		for (int i = 0; i < gameState.length; i++) {
			if (gameState[i]) {
				System.out.print(wordToElements[i] + " ");
			} else {
				System.out.print(" _ ");
			}
		}
		System.out.println();
	}

//GAME OVER
	public static boolean isGameOver(boolean[] gameState, int mIndex) {
		for (int i = 0; i < gameState.length; i++) {
			if (!gameState[i] && mIndex < 6) {
				return false;
			}
		}
		return true;
	}

//follow track of gameState
	public static boolean gameStateCheck(char[] wordToElements, char letter, boolean[] gameState) {
		for (int i = 0; i < gameState.length; i++) {
			if (wordToElements[i] == letter) {
				gameState[i] = true;
			}
		}
		return false;
	}

//check if move is Valid
	public static boolean isValidMove(char[] wordToElements, boolean[] gameState, char letter) {
		boolean isValidMove = false;
		for (int i = 0; i < wordToElements.length; i++) {
			if (wordToElements[i] == letter) {
				isValidMove = true;
				gameState[i] = isValidMove;
			}
		}
		return isValidMove;
	}

//print Hangman
	public static void printHangman(int mIndex) {
		if (mIndex == 1) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|__________________________");
		} else if (mIndex == 2) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|                    |");
			System.out.println("|                    |");
			System.out.println("|                    |       ");
			System.out.println("|                    |       ");
			System.out.println("|                    |       ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|__________________________");

		} else if (mIndex == 3) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|                    |");
			System.out.println("|                 \\  |");
			System.out.println("|                  \\ |       ");
			System.out.println("|                   \\|       ");
			System.out.println("|                    |       ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|__________________________");

		} else if (mIndex == 4) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|                    |");
			System.out.println("|                 \\  |  /");
			System.out.println("|                  \\ | /      ");
			System.out.println("|                   \\|/       ");
			System.out.println("|                    |       ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|__________________________");

		} else if (mIndex == 5) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|                    |");
			System.out.println("|                 \\  |  /");
			System.out.println("|                  \\ | /      ");
			System.out.println("|                   \\|/       ");
			System.out.println("|                    |       ");
			System.out.println("|                   /        ");
			System.out.println("|                  /         ");
			System.out.println("|                 /          ");
			System.out.println("|                /          ");
			System.out.println("|__________________________");
		} else if (mIndex == 6) {
			System.out.println("Oooops... Mistake :(");
			System.out.println("___________________________");
			System.out.println("|                 __|__     ");
			System.out.println("|                /o  o \\   ");
			System.out.println("|               /  p    \\   ");
			System.out.println("|               \\  __   / ");
			System.out.println("|                \\_____/ ");
			System.out.println("|                    |");
			System.out.println("|                 \\  |  /");
			System.out.println("|                  \\ | /      ");
			System.out.println("|                   \\|/       ");
			System.out.println("|                    |       ");
			System.out.println("|                   / \\      ");
			System.out.println("|                  /   \\     ");
			System.out.println("|                 /     \\    ");
			System.out.println("|                /       \\   ");
			System.out.println("|__________________________");
		}
	}

}
