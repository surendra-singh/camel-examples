/**
 * 
 */
package com.surendra.camel.hibernate.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.commons.lang3.StringUtils;

/**
 * @author TTND
 *
 */
@CsvRecord(separator = ",", skipFirstLine = true)
public class Availability {
	
	private long id;
	@DataField(pos = 1)
	private String url;
	@DataField(pos = 2)
	private String location;
	@DataField(pos = 3)
	private String zip;
	@DataField(pos = 4)
	private String availability;
	@DataField(pos = 5)
	private int avail;
	@DataField(pos = 6)
	private String asin;
	@DataField(pos = 7)
	private String productTitle;
	@DataField(pos = 8)
	private String upc;
	@DataField(pos = 9)
	private String category;
	@DataField(pos = 10)
	private String subcategory1;
	@DataField(pos = 11)
	private String Subcategory2;
	@DataField(pos = 12)
	private String price;
	@DataField(pos = 13)
	private String brand;
	@DataField(pos = 14)
	private String seller;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getAvail() {
		return avail;
	}

	public void setAvail(int avail) {
		this.avail = avail;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory1() {
		return subcategory1;
	}

	public void setSubcategory1(String subcategory1) {
		this.subcategory1 = subcategory1;
	}

	public String getSubcategory2() {
		return Subcategory2;
	}

	public void setSubcategory2(String subcategory2) {
		Subcategory2 = subcategory2;
	}

	public Double getPrice() {
		if (StringUtils.isNotBlank(this.price) && this.price.startsWith("$")) {
			return Double.valueOf(this.price.substring(1, this.price.length())).doubleValue();
		}
		return null;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Availability [id=" + id + ", url=" + url + ", location=" + location + ", zip=" + zip + ", availability="
				+ availability + ", avail=" + avail + ", asin=" + asin + ", productTitle=" + productTitle + ", upc="
				+ upc + ", category=" + category + ", subcategory1=" + subcategory1 + ", Subcategory2=" + Subcategory2
				+ ", price=" + price + "]";
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
