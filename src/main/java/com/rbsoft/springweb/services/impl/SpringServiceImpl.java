/**
 * 
 */
package com.rbsoft.springweb.services.impl;

import org.springframework.stereotype.Service;

import com.rbsoft.springweb.services.ISpringService;

/**
 * @author Rbsoft07	
 * Clase que impplementa la interfaces @ISpringService 
 */

@Service
public class SpringServiceImpl implements ISpringService {

	@Override
	public String getInfoServices() {
		// TODO Auto-generated method stub
		return "INFO: Services Up! Working Perfect!";
	}

}
