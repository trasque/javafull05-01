public class HelloWorld {
    public static void main(String args[]) {
        //10回くりかえして出力、その後 Hello! を出力
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, world.");
        }
        System.out.println("Hello!");

        System.out.println("====TEST====");

        //同様の処理でIFも使用
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                System.out.println("Hello!");
            } else {
                System.out.println("Hello, world.");
            }
        }
    }
}