package kadai_021;

// 辞書を実行するクラス
public class DictionaryExec_Chapter21 {

    // Javaプログラムのスタート地点
    public static void main(String[] args) {

        // Dictionary_Chapter21のオブジェクトを作る
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 辞書に10個の英単語と意味を登録する
        dictionary.addWords();

        // 調べたい4つの英単語を配列に入れる
        String[] words = {"apple", "banana", "grape", "orange"};

        // 4つの英単語を辞書で調べる
        dictionary.search(words);
    }
}