package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;

public class CollectionBean {
	
	private Set<String> addressList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	
	
	
	
	
	
/*	
	<< List Mapping Example >>
	private List<String> addressList;
		
	// Getter 
	public List<String> getAddressList() {
		return addressList;
	}
    // Setter 생성
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
*/

}
