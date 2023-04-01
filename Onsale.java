public class Sample18 {
  public static void main(String[] args) {
    Day4 day1 = new Day4(2011, 1, 20);
    Goods a = new Goods("101", "”L‚Ì‚¨‚à‚¿‚á", (long)380, day1);
    Day4 b = new Day4(2011, 5, 7);
    Day4 day2 = new Day4(2011, 3, 14);
    Goods c = new Goods("102", "Œ¢‚Ì‚¨‚à‚¿‚á", (long)280, day2);
    Day4 d = new Day4(2011, 5, 7);
    Order od1 = new Order("1001", a ,(long)5, b);
    Order od2 = new Order("1002", c ,(long)15, d);

    System.out.println(od1.toFormatString());
    System.out.println(od2.toFormatString());
  }
}