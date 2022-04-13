package lab5.classes;

import java.util.StringJoiner;

/**
 * 1. Exercises on Classes
 *
 * <p>1.5 The InvoiceItem Class
 *
 * <p>Class InvoiceItem models an item of an invoice, with ID, description, quantity and unit
 * price.
 */
public class InvoiceItem {

  private String id;
  private String desc;
  private int qty;
  private double unitPrice;

  /**
   * @param id        ID.
   * @param desc      description.
   * @param qty       quantity.
   * @param unitPrice unit price.
   */
  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public String getId() {
    return id;
  }

  public String getDesc() {
    return desc;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal() {
    return unitPrice * qty;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", InvoiceItem.class.getSimpleName() + "[", "]")
        .add("id='" + id + "'")
        .add("desc='" + desc + "'")
        .add("qty=" + qty)
        .add("unitPrice=" + unitPrice)
        .toString();
  }
}
