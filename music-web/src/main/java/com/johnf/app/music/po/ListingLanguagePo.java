package com.johnf.app.music.po;

import java.io.Serializable;

/**
 * 歌单语言实体类 
 */
public class ListingLanguagePo implements Serializable {
	private static final long serialVersionUID = -3106988567190201151L;

	//主键
	private String id;
	
	//歌单ID
	private String listingId;
	
	//歌单语言
	private String language;
	
	//版本控制字段
	private String version;
	
	//语言对应的数据字典
	private SysDicPo dicPo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getListingId() {
		return listingId;
	}

	public void setListingId(String listingId) {
		this.listingId = listingId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public SysDicPo getDicPo() {
		return dicPo;
	}

	public void setDicPo(SysDicPo dicPo) {
		this.dicPo = dicPo;
	}
	
}