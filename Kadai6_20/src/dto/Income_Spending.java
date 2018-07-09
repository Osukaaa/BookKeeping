package dto;

//収入支出クラス
public class Income_Spending {
	private int income_spending_id;
	private int income_spending_kindid;
	private String date;
	private int income_spending_typeid;
	private int money;

	public Income_Spending(int income_spending_id, int income_spending_kindid, String date, int income_spending_typeid,
			int money) {
		this.income_spending_id = income_spending_id;
		this.income_spending_kindid = income_spending_kindid;
		this.date = date;
		this.income_spending_typeid = income_spending_typeid;
		this.money = money;
	}

	public Income_Spending(){

	}

	public int getIncome_spending_id() {
		return income_spending_id;
	}

	public void setIncome_spending_id(int income_spending_id) {
		this.income_spending_id = income_spending_id;
	}

	public int getIncome_spending_kindid() {
		return income_spending_kindid;
	}

	public void setIncome_spending_kindid(int income_spending_kindid) {
		this.income_spending_kindid = income_spending_kindid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getIncome_spending_typeid() {
		return income_spending_typeid;
	}

	public void setIncome_spending_typeid(int income_spending_typeid) {
		this.income_spending_typeid = income_spending_typeid;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}





}
