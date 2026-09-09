package kadai_021;

import java.util.HashMap;

// 英単語の辞書を管理するクラス
public class Dictionary_Chapter21 {

    // 英単語と日本語の意味を保存するHashMap
    HashMap<String, String> dictionary = new HashMap<String, String>();

    // 辞書に英単語と意味を登録するメソッド
    public void addWords() {

        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 渡された英単語を順番に辞書で調べるメソッド
    public void search(String[] words) {

        // 配列に入っている英単語を1つずつ調べる
        for (String word : words) {

            // 辞書に英単語が存在するか確認
            if (dictionary.containsKey(word)) {

                // 存在する場合は意味を取得して表示
                System.out.println(word + "の意味は" + dictionary.get(word));

            } else {

                // 存在しない場合
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}