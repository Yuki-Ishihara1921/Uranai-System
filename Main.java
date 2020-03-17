import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ques1();
        ques2();
        int ans3 = ques3();
        switch (ans3) {
            case 1:
            int ans4 = ques4();
            switch (ans4) {
                case 1:
                ques7();
                break;
                case 2:
                ques9();
                break;
                case 3:
                ques8();
                break;
            }
            break;
            case 2:
            int ans5 = ques5();
            switch (ans5) {
                case 1:
                ques7();
                break;
                case 2:
                ques8();
                break;
                case 3:
                ques9();
                break;
            }
            break;
            case 3:
            int ans6 = ques6();
            switch (ans6) {
                case 1:
                ques7();
                break;
                case 2:
                ques8();
                break;
                case 3:
                ques9();
                break;
            }
            break;
        }
    }

    public static void ques1() {
        System.out.println("★" +  "今日の運勢" + "★");
		System.out.println("① __ " + "名前を入力して下さい" );
        Scanner s = new Scanner(System.in);
        String scan1 = s.nextLine();
    }
    public static void ques2() {
        System.out.println("② __ " + "年齢を入力して下さい") ;
        Scanner s = new Scanner(System.in);
        int scan2 = s.nextInt();
    }
    public static int ques3() {
        System.out.println("③ __ " + "あなたは犬派ですか？猫派ですか？(記号でお答え下さい)");
        System.out.println("1：犬派　　2：どちらでもない　 3：猫派");
        Scanner s = new Scanner(System.in);
        int scan3 = s.nextInt();
        while (scan3 < 1 || scan3 > 3) {
		    System.out.println("もう一度入力し直して下さい。");
		    System.out.println("③ __ " + "あなたは犬派ですか？猫派ですか？(記号でお答え下さい)");
		    System.out.println("1：犬派　　2：どちらでもない　 3：猫派");
            scan3 = new java.util.Scanner(System.in).nextInt();
        }
        return scan3;
    }
    public static int ques4() {
        System.out.println("④ __ " + "好きな食べ物は？(記号でお答え下さい)");
        System.out.println("1：カレーライス　　2：チャーハン　　3：お茶漬け");
        Scanner s = new Scanner(System.in);
        int scan4 = s.nextInt();
        while (scan4 < 1 || scan4 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("④ __ " + "好きな食べ物は？(記号でお答え下さい)");
            System.out.println("1：カレーライス　　2：チャーハン　　3：お茶漬け");    		    
            scan4 = s.nextInt();
        }
        return scan4;
    }
    public static int ques5() {
        System.out.println("④ __ " + "観たい映画のジャンルは？(記号でお答え下さい)");
        System.out.println("1：恋愛系　　2：ホラー系　　3：アクション系");
        Scanner s = new Scanner(System.in);
        int scan5 = s.nextInt();
        while (scan5 < 1 || scan5 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("④ __ " + "観たい映画のジャンルは？(記号でお答え下さい)");
            System.out.println("1：恋愛系　　2：ホラー系　　3：アクション系");
            scan5 = s.nextInt();
        }
        return scan5;
    }
    public static int ques6() {
        System.out.println("④ __ " + "好きなスポーツは？(記号でお答え下さい)");
        System.out.println("1：野球　　2：サッカー　　3：ラグビー");
        Scanner s = new Scanner(System.in);
        int scan6 = s.nextInt();
        while (scan6 < 1 || scan6 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("④ __ " + "好きなスポーツは？(記号でお答え下さい)");
            System.out.println("1：野球　　2：サッカー　　3：ラグビー");
            scan6 = s.nextInt();
        }
        return scan6;
    }
    public static void ques7() {
        System.out.println("⑤ __ " + "今行きたいのはどこ？(記号でお答え下さい)");
        System.out.println("1：ディズニーランド　　2：富士急ハイランド　　3：USJ");
        Scanner s = new Scanner(System.in);
        int scan7 = s.nextInt();
        while (scan7 < 1 || scan7 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("⑤ __ " + "今行きたいのはどこ？(記号でお答え下さい)");
            System.out.println("1：ディズニーランド　　2：富士急ハイランド　　3：USJ");
            scan7 = new java.util.Scanner(System.in).nextInt();
        }
        switch (scan7) {
            case 1:
            suekichi();
            break;
            case 2:
            daikichi();
            break;
            case 3:
            kichi();
            break;
        }
    }
    public static void ques8() {
        System.out.println("⑤ __ " + "遊ぶならどれで遊ぶ？(記号でお答え下さい)");
        System.out.println("1：トランプ　　2：将棋　　3：かるた");
        Scanner s = new Scanner(System.in);
        int scan8 = s.nextInt();
        while (scan8 < 1 || scan8 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("⑤ __ " + "遊ぶならどれで遊ぶ？(記号でお答え下さい)");
            System.out.println("1：トランプ　　2：将棋　　3：かるた");
            scan8 = new java.util.Scanner(System.in).nextInt();
        }
        switch (scan8) {
            case 1:
            kyou();
            break;
            case 2:
            daikyou();
            break;
            case 3:
            kyou();
            break;
        }
    }
    public static void ques9() {
        System.out.println("⑤ __ " + "今聴きたい音楽は？(記号でお答え下さい)");
        System.out.println("1：J-Pop　　2：ロック　　3：クラシック");
        Scanner s = new Scanner(System.in);
        int scan9 = s.nextInt();
        while (scan9 < 1 || scan9 > 3) {
            System.out.println("もう一度入力し直して下さい。");
            System.out.println("⑤ __ " + "今聴きたい音楽は？(記号でお答え下さい)");
            System.out.println("1：J-Pop　　2：ロック　　3：クラシック");
            scan9 = new java.util.Scanner(System.in).nextInt();
        }
        switch (scan9) {
            case 1:
            suekichi();
            break;
            case 2:
            kichi();
            break;
            case 3:
            daikichi();
            break;
        }
    }

    public static void daikichi() {
        System.out.println("今日のあなたは　「大吉」！！");
        System.out.println("楽しいことがたくさん起こりそう！　とにかく行動に起こしてみることで運気UP！！");
    }
    public static void kichi() {
        System.out.println("今日のあなたは　「吉」！");
        System.out.println("新たな発見や出会いがあるかも！　周囲の様々なことに興味を持っていこう！");
    }
    public static void suekichi() {
        System.out.println("今日のあなたは　「末吉」！");
        System.out.println("普段通りの充実した一日を過ごせそう！　衛生習慣を忘れずに！");
    }
    public static void kyou() {
        System.out.println("今日のあなたは　「凶」！");
        System.out.println("優柔不断はNG！　早めの決断を心がけて！");
    }
    public static void daikyou() {
        System.out.println("今日のあなたは　「大凶」！！");
        System.out.println("今日は物事が上手くいかない予感...！　落ち着いて行動しよう！");
    }
}