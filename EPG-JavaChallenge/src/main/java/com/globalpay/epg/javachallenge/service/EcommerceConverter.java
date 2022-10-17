package com.globalpay.epg.javachallenge.service;

import java.util.ArrayList;
import java.util.List;

import com.globalpay.epg.javachallenge.model.EcommerceDto;
import com.globalpay.epg.javachallenge.persistence.dao.Ecommerce;

/**
 * The Class EcommerceConverter.
 */
public class EcommerceConverter {

	/**
	 * Convert.
	 *
	 * @param ec the ec
	 * @return the list
	 */
	public static List<EcommerceDto> convert(List<Ecommerce> ec) {
		List<EcommerceDto> ecommerces = new ArrayList<EcommerceDto>();
		ec.forEach(e -> ecommerces.add(convert(e)));
		return ecommerces;
	}

	/**
	 * Convert.
	 *
	 * @param e the e
	 * @return the ecommerce dto
	 */
	private static EcommerceDto convert(Ecommerce e) {
		EcommerceDto ec = new EcommerceDto(e.getCompanyName());
		return ec;
	}

	/**
	 * Convert.
	 *
	 * @param e the e
	 * @return the ecommerce
	 */
	public static Ecommerce convert(EcommerceDto e) {
		Ecommerce ec = new Ecommerce(e.getCompanyName());
		return ec;
	}

	/**
	 * Convert to.
	 *
	 * @param ecommerces the ecommerces
	 * @return the list
	 */
	public static List<Ecommerce> convertTo(List<EcommerceDto> ecommerces) {
		List<Ecommerce> eco = new ArrayList<Ecommerce>();
		ecommerces.forEach(e -> eco.add(convert(e)));
		return eco;
	}

}
