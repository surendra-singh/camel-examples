/**
 * 
 */
package com.surendra.camel.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author surendra.singh
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

	@XmlElement
	private String city;
	
	@XmlElement
	private String pin;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("City", this.city).append("Pin", this.pin).toString();
	}
}
