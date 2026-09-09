package kadai_018;

// Kato_Chapter18を継承した「花子」の子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    // givenNameに「花子」をセットする
    public void setGivenName() {
        givenName = "花子";
    }

    // 花子用の個別紹介
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}