package day11_12;
import java.util.Random;
public class DeckOfCard {
//            import java.util.*;
                public static void main(String[] args) {
                    String []suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
                    String []rank={"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
                    int deckOfCard = suits.length*rank.length;
                    String deck[] = new String[deckOfCard];

//                    / initialize the deck of cards
                    for (int i = 0; i < rank.length; i++) {
                        for (int j = 0; j < suits.length; j++) {
                            deck[suits.length * i + j] = rank[i] + " of " + suits[j];
                        }
                    }
                    // shuffle cards
                    Random random=new Random();
                    for(int i=deckOfCard-1;i>0;i--){
                        int j = random.nextInt(i+1);
                        String temp = deck[i];
                        deck[i] = deck[j];
                        deck[j] = temp;
                    }
                    // asign value to each player
                    String [][]players =new String[4][9];
                    int index=0;
                    for(int i=0;i<4;i++){
                        for(int j=0;j<9;j++){
                            players[i][j]=deck[index++];
                        }
                    }
                    // print players
                    for (int i=0;i<4;i++){
                        System.out.println("player : "+i);
                        for(int j=0;j<9;j++){
                            System.out.println(players[i][j]);
                        }
                        System.out.println();
                    }
                }
}
