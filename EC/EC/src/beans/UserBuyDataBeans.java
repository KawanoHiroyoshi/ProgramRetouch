package beans;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザー
 * @author d-yamaguchi
 *
 */
public class UserBuyDataBeans implements Serializable {
	private int DelivertMethodId;
	private Date CreateDate;
	private int Total_Price;
	private String Delivery_Method;
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
		return Total_Price;
	}

	public void setTotal_Price(int total_Price) {
		Total_Price = total_Price;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public String getDelivery_Method() {
		return Delivery_Method;
	}

	public void setDelivery_Method(String delivery_Method) {
		Delivery_Method = delivery_Method;
	}
}

