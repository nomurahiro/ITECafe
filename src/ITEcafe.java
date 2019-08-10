
import java.util.Calendar;

import java.util.Scanner;

public class ITEcafe {

    public static void main(String[] args) {

        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item iceCoffee = new Item(3, "アイスコーヒー", 200);
        Item iceTea = new Item(4, "アイスティー", 260);
        Item shortCake = new Item(5, "ショートケーキ", 400);
        Item cheeseCake = new Item(6, "チーズケーキ", 400);
        Item chocolateCake = new Item(7, "チョコレートケーキ", 450);
        Item chocolateBananaParfait = new Item(8, "チョコレートバナナパフェ", 390);
        Item StrawberryParfait = new Item(9, "いちごパフェ", 390);
        Item meatPasta = new Item(10, "ミートパスタ", 650);

        Item[] items = new Item[10];

        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = iceCoffee;
        items[3] = iceTea;
        items[4] = shortCake;
        items[5] = cheeseCake;
        items[6] = chocolateCake;
        items[7] = chocolateBananaParfait;
        items[8] = StrawberryParfait;
        items[9] = meatPasta;

        while (true) {
            System.out.println("ITEカフェシステム");

            int goukei = 0;
            String input;
            Scanner sc = new Scanner(System.in);
            int num;

            while (true) {
                System.out.println("商品番号を入力してください");

                input = sc.next();
                num = Integer.parseInt(input);

                int price = items[num - 1].getPrice();

                System.out.println("数量を入力してください");
                input = sc.next();
                num = Integer.parseInt(input);

                goukei += price * num;
                System.out.println("合計金額" + goukei);

                System.out.println("以上なら1を入力");
                input = sc.next();
                num = Integer.parseInt(input);
                if (num == 1) {
                    break;
                }
            }

            System.out.println("預り金を入力してください");
            input = sc.next();
            num = Integer.parseInt(input);

            System.out.println("お釣りは" + (num - goukei) + "円です");
            System.out.println("ありがとうございました");
            
            System.out.println("システムを終了するには2を押してください");
            input = sc.next();
            num = Integer.parseInt(input);
            
            if(num == 2){
                break;1
            }
        }

    }
}
