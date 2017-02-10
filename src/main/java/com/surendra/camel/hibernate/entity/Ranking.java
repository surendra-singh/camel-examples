package com.surendra.camel.hibernate.entity;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * @author TTND
 *
 */
@CsvRecord(separator = ",", skipFirstLine = true)
public class Ranking {

	private int id;
	@DataField(pos = 1, pattern = "yyyy-MM-dd")
	private Date report_date;
	@DataField(pos = 2)
	private String online_store;
	@DataField(pos = 3)
	private String trusted_rpc;
	@DataField(pos = 4)
	private String trusted_product_description;
	@DataField(pos = 5)
	private String post_code;
	@DataField(pos = 6)
	private String location;
	@DataField(pos = 7)
	private int rank;
	@DataField(pos = 8)
	private int depth;
	@DataField(pos = 9)
	private String brand;
	@DataField(pos = 10)
	private String seller;
	@DataField(pos = 11)
	private String found_at_url;
	@DataField(pos = 12)
	private String product_url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getOnline_store() {
		return online_store;
	}
	public void setOnline_store(String online_store) {
		this.online_store = online_store;
	}
	public String getTrusted_rpc() {
		return trusted_rpc;
	}
	public void setTrusted_rpc(String trusted_rpc) {
		this.trusted_rpc = trusted_rpc;
	}
	public String getTrusted_product_description() {
		return trusted_product_description;
	}
	public void setTrusted_product_description(String trusted_product_description) {
		this.trusted_product_description = trusted_product_description;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getFound_at_url() {
		return found_at_url;
	}
	public void setFound_at_url(String found_at_url) {
		this.found_at_url = found_at_url;
	}
	public String getProduct_url() {
		return product_url;
	}
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}


}
