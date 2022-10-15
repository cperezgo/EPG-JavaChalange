package com.globalpay.epg.javachallenge.model;

/**
 * The Class Ecommerce.
 */
public class Ecommerce {
	
	/** The company name. */
	private String companyName;

	/**
	 * Gets the company name.
	 *
	 * @return the company name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the company name.
	 *
	 * @param companyName the new company name
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ecommerce [companyName=" + companyName + "]";
	}

}
