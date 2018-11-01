package beans;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザー
 * @author d-yamaguchi
 *
 */
public class UserBuyItemDataBeans implements Serializable {
	private int DelivertMethodId;
	private Date CreateDate;
	private int Price;
	private String Item_Date;
	private int id;




	public int getDelivertMethodId() {
		return DelivertMethodId;
	}

	public void setDelivertMethodId(int delivertMethodId) {
		DelivertMethodId = delivertMethodId;
	}




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


}

