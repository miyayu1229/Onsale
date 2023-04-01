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
    return "���i ID�F" + id + " ���i���F" + name + " ���i�F" + price + "�~ �������F" + onSaleDay.toFormatString();
  }
}