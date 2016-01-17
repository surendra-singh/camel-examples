/**
 * 
 */
package com.surendra.camel.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author surendra.singh
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	@XmlAttribute
	private boolean valid;
	
	@XmlElement
	private String email;
	
	@XmlElement
	private String password;
	
	@XmlElement(name = "address")
    @XmlElementWrapper(name = "addressList")
	private List<Address> addressList;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("Email", this.email)
				.append("Valid", this.valid).append("Password", this.password).append("Address", this.addressList).toString();
	}
}
