package dto;

//収支分類クラス
public class Kind {

	private int kindid;
	private String kindname;

	public Kind(int kindid, String kindname) {
		this.kindid = kindid;
		this.kindname = kindname;
	}

	public Kind(){

	}

	public int getKindid() {
		return kindid;
	}

	public void setKindid(int kindid) {
		this.kindid = kindid;
	}

	public String getKindname() {
		return kindname;
	}

	public void setKindname(String kindname) {
		this.kindname = kindname;
	}




}
