package beans;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザー
 * @author d-yamaguchi
 *
 */
public class UserBuyItemDataBeans implements Serializable {
	private String DelivertMethod;
	private Date CreateDate;
	private int Price;
	private int Price_1;
	private String Item_Date;
	private int id;








	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal_Price() {
		return Price;
	}


	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getItem_Date() {
		return Item_Date;
	}

	public void setItem_Date(String item_Date) {
		Item_Date = item_Date;
	}

	public String getDelivertMethod() {
		return DelivertMethod;
	}

	public void setDelivertMethod(String delivertMethod) {
		DelivertMethod = delivertMethod;
	}

	public int getPrice_1() {
		return Price_1;
	}

	public void setPrice_1(int price_1) {
		Price_1 = price_1;
	}


}

