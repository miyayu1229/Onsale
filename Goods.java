public class Goods {
  private String id;
  private String name;
  private long price;
  private Day4 onSaleDay;
  
  public Goods(String id, String name, long price, Day4 onSaleDay) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.onSaleDay = onSaleDay;
  }
  
  public String toFormatString() {
    return "商品 ID：" + id + " 商品名：" + name + " 価格：" + price + "円 発売日：" + onSaleDay.toFormatString();
  }
}