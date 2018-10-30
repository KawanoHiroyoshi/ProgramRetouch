package beans;

import java.io.Serializable;

/**
 * ユーザー
 * @author d-yamaguchi
 *
 */
public class UserBuyDataBeans implements Serializable {
	private int DelivertMethodId;
	private String CreateDate;
	private int Total_Id;
	private int id;


	public int getDelivertMethodId() {
		return DelivertMethodId;
	}

	public void setDelivertMethodId(int delivertMethodId) {
		DelivertMethodId = delivertMethodId;
	}

	public String getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}

	public int getTotal_Id() {
		return Total_Id;
	}

	public void setTotal_Id(int total_Id) {
		Total_Id = total_Id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

