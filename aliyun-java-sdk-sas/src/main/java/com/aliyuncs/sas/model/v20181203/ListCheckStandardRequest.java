/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCheckStandardRequest extends RpcAcsRequest<ListCheckStandardResponse> {
	   

	private List<String> instanceSubTypess;

	private List<String> instanceTypess;

	private List<String> instanceIdss;

	private String lang;

	private List<String> vendorss;
	public ListCheckStandardRequest() {
		super("Sas", "2018-12-03", "ListCheckStandard");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getInstanceSubTypess() {
		return this.instanceSubTypess;
	}

	public void setInstanceSubTypess(List<String> instanceSubTypess) {
		this.instanceSubTypess = instanceSubTypess;	
		if (instanceSubTypess != null) {
			for (int i = 0; i < instanceSubTypess.size(); i++) {
				putQueryParameter("InstanceSubTypes." + (i + 1) , instanceSubTypess.get(i));
			}
		}	
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<String> getVendorss() {
		return this.vendorss;
	}

	public void setVendorss(List<String> vendorss) {
		this.vendorss = vendorss;	
		if (vendorss != null) {
			for (int i = 0; i < vendorss.size(); i++) {
				putQueryParameter("Vendors." + (i + 1) , vendorss.get(i));
			}
		}	
	}

	@Override
	public Class<ListCheckStandardResponse> getResponseClass() {
		return ListCheckStandardResponse.class;
	}

}
