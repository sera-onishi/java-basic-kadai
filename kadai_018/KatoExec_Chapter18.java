package kadai_018;

// 3人の紹介を実行するクラス
public class KatoExec_Chapter18 {

    // Javaプログラムのスタート地点
    public static void main(String[] args) {

        // 太郎のオブジェクトを作る
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();

        // 太郎という名前をセットする
        taro.setGivenName();

        // 太郎の紹介を実行する
        taro.execIntroduce();


        // 一郎のオブジェクトを作る
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();

        // 一郎という名前をセットする
        ichiro.setGivenName();

        // 一郎の紹介を実行する
        ichiro.execIntroduce();


        // 花子のオブジェクトを作る
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

        // 花子という名前をセットする
        hanako.setGivenName();

        // 花子の紹介を実行する
        hanako.execIntroduce();
    }
}