package baitap;

import java.util.ArrayList;

public class Desk  extends  CardCollection{
    private String nameDesk;
    public Desk(String nameDesk){
        super();
        this.nameDesk = nameDesk;
        for (int i = 0 ; i < 4; i ++){
            for (int j = 0; j < 13; j ++){
                super.addCard(new Card(j, i));
            }
        }
    }

    @Override
    public void showSizeCard() {
        super.showSizeCard();
        System.out.println("Tên bàn là: " + this.nameDesk);
    }
}
