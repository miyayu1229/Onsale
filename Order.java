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
    return "����ID�F" + id + " �������i�F" + product.toFormatString() + " ���ʁF" + amount + " �󒍓��F" + orderDay.toFormatString();
  }
}