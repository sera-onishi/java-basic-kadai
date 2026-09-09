package kadai_018;

// 家族3人の共通部分をまとめる親クラス
public abstract class Kato_Chapter18 {

    // 姓を入れるフィールド
    public String familyName = "加藤";

    // 名を入れるフィールド
    public String givenName = "";

    // 住所を入れるフィールド
    public String address = "東京都中野区〇×";
    
 // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 子クラスごとに内容を変えるための抽象メソッド
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }
}
