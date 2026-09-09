package kadai_018;

// Kato_Chapter18を継承した「一郎」の子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // givenNameに「一郎」をセットする
    public void setGivenName() {
        givenName = "一郎";
    }

    // 一郎用の個別紹介
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}