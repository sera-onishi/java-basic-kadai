package kadai_018;

// Kato_Chapter18を継承した「太郎」の子クラス
//「太郎クラスは、加藤家の親クラスを継承します」
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    // givenNameに「太郎」をセットする
    public void setGivenName() {
        givenName = "太郎";
    }

    // 親クラスの抽象メソッドを太郎用に実装する
    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}