package kadai_015;
// ↑「このファイルはkadai_015パッケージに所属しています」

public class CarExec_Chapter15 {
    // ↑「CarExec_Chapter15という実行用のクラスを作ります」

    public static void main(String[] args) {
        // ↑「ここからプログラムを実行します」という入口
    	
    	 Car_Chapter15 car = new Car_Chapter15();
         // ↑ Car_Chapter15という設計図から新しい車を1台作り、
         //   carという名前で管理する

         car.changeGear(3);
         // ↑ carのギアを3に変更する
         //   3がchangeGearメソッドのafterGearに渡される

         car.run();
         // ↑ carを走らせて、現在の速度を表示する

    }

}