public class Main{
  public static void main(String[] args){
    System.out.println("メゾットを呼び出します");
    hello("奏");
    hello("飛鳥");
    hello("菅原");
    System.out.println("メゾットの呼び出しが終わりました。");
  }
  public static void hello(String name){
    System.out.println(name + "さん、こんにちは");
  }
}