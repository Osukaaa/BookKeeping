package dto;

//収入支出クラス
public class Income_Spending {
	private int income_spending_id;
	private String income_spending_kind;
	private String date;
	private String income_spending_type;
	private int money;

	public Income_Spending(int income_spending_id, String income_spending_kind, String date, String income_spending_type,
			int money) {
		this.income_spending_id = income_spending_id;
		this.income_spending_kind = income_spending_kind;
		this.date = date;
		this.income_spending_type = income_spending_type;
		this.money = money;
	}

	public Income_Spending(String income_spending_kind, String date, String income_spending_type,
			int money) {
		this.income_spending_kind = income_spending_kind;
		this.date = date;
		this.income_spending_type = income_spending_type;
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

	public String getIncome_spending_kind() {
		return income_spending_kind;
	}

	public void setIncome_spending_kind(String income_spending_kind) {
		this.income_spending_kind = income_spending_kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIncome_spending_type() {
		return income_spending_type;
	}

	public void setIncome_spending_type(String income_spending_type) {
		this.income_spending_type = income_spending_type;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}





}
