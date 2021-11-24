package com.netneg.admin.dto;

import java.sql.Timestamp;

public class BPListOutDto {
	private String bpid;
	private String Id;
	private String bpCode;
	private String bpName;
	private String bpShort;
	private Long empcnt;
	private String country;
	private String bpimptName;
	private Long bpimpt;
	private String sales;
	private String salesName;
	private String hpurl;
	private String zipcode;
	private String address;
	private String tel;
	private String fax;
	private Timestamp createtime;
	private String createuser;
	private Timestamp updatetime;
	private String updateuser;
	private String bpMemo;
	private Timestamp contactdate;
	private Long contactcnt;
	private Long maxcnttdays;
	private Long custpsnCnt;
	private Long psnCnt;
	private Long kmcnt;
	private Long vPrjcnt;
	private Long vFzcnt;
	private Long vTgcnt;
	private Long tacnt;
	private Long prjprsncnt;
	private Long gotprjcnt;
	private Long bpprsncnt;
	private String prjflg;
	private String contactflg;
	private String wngtext;
	private String wnglvlName;
	private String wnglvl;
	private String cnttwnglvl;
	
	public String getBpid() {
		return bpid;
	}
	public void setBpid(String bpid) {
		this.bpid = bpid;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getBpCode() {
		return bpCode;
	}
	public void setBpCode(String bpCode) {
		this.bpCode = bpCode;
	}
	public String getBpName() {
		return bpName;
	}
	public void setBpName(String bpName) {
		this.bpName = bpName;
	}
	public String getBpShort() {
		return bpShort;
	}
	public void setBpShort(String bpShort) {
		this.bpShort = bpShort;
	}
	public Long getEmpcnt() {
		return empcnt;
	}
	public void setEmpcnt(Long empcnt) {
		this.empcnt = empcnt;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getBpimpt() {
		return bpimpt;
	}
	public void setBpimpt(Long bpimpt) {
		this.bpimpt = bpimpt;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getHpurl() {
		return hpurl;
	}
	public void setHpurl(String hpurl) {
		this.hpurl = hpurl;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public String getCreateuser() {
		return createuser;
	}
	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	public String getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}
	public String getBpMemo() {
		return bpMemo;
	}
	public void setBpMemo(String bpMemo) {
		this.bpMemo = bpMemo;
	}
	public Timestamp getContactdate() {
		return contactdate;
	}
	public void setContactdate(Timestamp contactdate) {
		this.contactdate = contactdate;
	}
	public Long getContactcnt() {
		return contactcnt;
	}
	public void setContactcnt(Long contactcnt) {
		this.contactcnt = contactcnt;
	}
	public Long getMaxcnttdays() {
		return maxcnttdays;
	}
	public void setMaxcnttdays(Long maxcnttdays) {
		this.maxcnttdays = maxcnttdays;
	}
	public Long getPrjprsncnt() {
		return prjprsncnt;
	}
	public void setPrjprsncnt(Long prjprsncnt) {
		this.prjprsncnt = prjprsncnt;
	}
	public Long getGotprjcnt() {
		return gotprjcnt;
	}
	public void setGotprjcnt(Long gotprjcnt) {
		this.gotprjcnt = gotprjcnt;
	}
	public Long getBpprsncnt() {
		return bpprsncnt;
	}
	public void setBpprsncnt(Long bpprsncnt) {
		this.bpprsncnt = bpprsncnt;
	}
	public String getPrjflg() {
		return prjflg;
	}
	public void setPrjflg(String prjflg) {
		this.prjflg = prjflg;
	}
	
	public String getContactflg() {
		return contactflg;
	}
	public void setContactflg(String contactflg) {
		this.contactflg = contactflg;
	}
	public String getWngtext() {
		return wngtext;
	}
	public void setWngtext(String wngtext) {
		this.wngtext = wngtext;
	}
	public String getWnglvl() {
		return wnglvl;
	}
	public void setWnglvl(String wnglvl) {
		this.wnglvl = wnglvl;
	}
	public String getCnttwnglvl() {
		return cnttwnglvl;
	}
	public void setCnttwnglvl(String cnttwnglvl) {
		this.cnttwnglvl = cnttwnglvl;
	}
	public String getSalesName() {
		return salesName;
	}
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}
	public String getBpimptName() {
		return bpimptName;
	}
	public void setBpimptName(String bpimptName) {
		this.bpimptName = bpimptName;
	}
	public String getWnglvlName() {
		return wnglvlName;
	}
	public void setWnglvlName(String wnglvlName) {
		this.wnglvlName = wnglvlName;
	}
	public Long getCustpsnCnt() {
		return custpsnCnt;
	}
	public void setCustpsnCnt(Long custpsnCnt) {
		this.custpsnCnt = custpsnCnt;
	}
	public Long getPsnCnt() {
		return psnCnt;
	}
	public void setPsnCnt(Long psnCnt) {
		this.psnCnt = psnCnt;
	}
	public Long getKmcnt() {
		return kmcnt;
	}
	public void setKmcnt(Long kmcnt) {
		this.kmcnt = kmcnt;
	}
	public Long getvPrjcnt() {
		return vPrjcnt;
	}
	public void setvPrjcnt(Long vPrjcnt) {
		this.vPrjcnt = vPrjcnt;
	}
	public Long getvFzcnt() {
		return vFzcnt;
	}
	public void setvFzcnt(Long vFzcnt) {
		this.vFzcnt = vFzcnt;
	}
	public Long getvTgcnt() {
		return vTgcnt;
	}
	public void setvTgcnt(Long vTgcnt) {
		this.vTgcnt = vTgcnt;
	}
	public Long gettTacnt() {
		return tacnt;
	}
	public void settTacnt(Long tTacnt) {
		this.tacnt = tTacnt;
	}
	

	
}
