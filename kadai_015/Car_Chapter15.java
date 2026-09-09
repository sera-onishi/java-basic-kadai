package kadai_015;
//「車をクラスとして作って、メソッドを使ってギアを3に変え、時速30kmと表示させてください」
//↑「このファイルは kadai_015 というパッケージに所属しています」

public class Car_Chapter15 {
// ↑「Car_Chapter15 という車の設計図を作ります」
	
    private int gear = 1;
    // ↑「整数を入れられる gear という箱を用意して、最初は1を入れておく」
    // gearは現在のギアを覚えておくためのフィールド

    private int speed = 10;
    // ↑「整数を入れられる speed という箱を用意して、最初は10を入れておく」
    // speedは現在の速度を覚えておくためのフィールド
    

    public void changeGear(int afterGear) {
        // ↑ changeGearというメソッド
        // ↑ 変更したいギアの数字をafterGearで受け取る

        System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
        // ↑ 今のギアと、変更後のギアを表示する
    
	    gear = afterGear;
	    // ↑「現在のギアgearを、受け取ったafterGearに変更する」
	    // afterGearが3なら → gear = 3 になる
	
	
	    switch (gear) {
	        // ↑「現在のgearの数字によって、処理を分ける」
	
	        case 1:
	            speed = 10;
	            break;
	            // ↑ gearが1なら、速度を10にする
	
	        case 2:
	            speed = 20;
	            break;
	            // ↑ gearが2なら、速度を20にする
	
	        case 3:
	            speed = 30;
	            break;
	            // ↑ gearが3なら、速度を30にする
	
	        case 4:
	            speed = 40;
	            break;
	            // ↑ gearが4なら、速度を40にする
	
	        case 5:
	            speed = 50;
	            break;
	            // ↑ gearが5なら、速度を50にする
	
	        default:
	            speed = 10;
	            break;
	            // ↑ 1〜5以外なら、速度を10にする
	    }
    }
	      
public void run() {
 // ↑「runという、車を走らせるメソッド」
 // ↑ ()の中が空なので、引数は受け取らない
// ↑ voidなので、戻り値もない
	System.out.println("速度は時速" + speed + "kmです");
	// ↑ 現在speedに入っている速度を表示する
	}      
	            
	            
 }

    


