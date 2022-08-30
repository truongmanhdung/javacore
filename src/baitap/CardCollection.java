package baitap;

import java.util.ArrayList;
import java.util.List;

public class CardCollection {
    private List<Card> cards = new ArrayList<>();

    public CardCollection(){

    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void showSizeCard(){
        System.out.println("Số bài trên bàn là: " + this.cards.size());
    }
}
