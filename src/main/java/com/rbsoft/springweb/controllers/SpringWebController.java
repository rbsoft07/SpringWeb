/**
 * 
 */
package com.rbsoft.springweb.controllers;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.rbsoft.springweb.services.impl.SpringServiceImpl;



/**
 * @author rbsoft
 * Controlador para mostrar la integracion de Spring Con JSF
 */

@ManagedBean
@ViewScoped
public class SpringWebController {
	
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringServiceImpl springServiceImpl;
	
	private String infoServices;
	
	@PostConstruct
	public void init() {
		System.out.println(this.springServiceImpl.getInfoServices());
		this.infoServices = springServiceImpl.getInfoServices();
	}

	/**
	 * @return the springServiceImpl
	 */
	public SpringServiceImpl getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringServiceImpl springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	/**
	 * @return the infoServices
	 */
	public String getInfoServices() {
		return infoServices;
	}

	/**
	 * @param infoServices the infoServices to set
	 */
	public void setInfoServices(String infoServices) {
		this.infoServices = infoServices;
	}

	
	
	
	
}
