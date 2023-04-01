public class Order {
  
  private String id;
  private Goods product;
  private long amount;
  private Day4 orderDay;
  
  public Order(String id, Goods product, long amount, Day4 orderDay) {
    this.id = id;
    this.product = product;
    this.amount = amount;
    this.orderDay = orderDay;
  }
  
  public String toFormatString() {
    return "注文ID：" + id + " 注文商品：" + product.toFormatString() + " 数量：" + amount + " 受注日：" + orderDay.toFormatString();
  }
}