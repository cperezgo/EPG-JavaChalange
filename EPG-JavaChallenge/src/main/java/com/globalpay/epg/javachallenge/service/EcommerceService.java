package com.globalpay.epg.javachallenge.service;

import java.util.List;

import com.globalpay.epg.javachallenge.model.EcommerceDto;

/**
 * The Interface EcommerceService.
 */
public interface EcommerceService {
	
	/**
	 * Gets the ecommerces.
	 *
	 * @return the ecommerces
	 */
	List<EcommerceDto> getEcommerces();

	/**
	 * Update ecommerces.
	 *
	 * @param ecommerces the ecommerces
	 */
	void updateEcommerces(List<EcommerceDto> ecommerces);

	/**
	 * Save ecommerce.
	 *
	 * @param ecommerce the ecommerce
	 */
	void saveEcommerce(EcommerceDto ecommerce);
	

}
