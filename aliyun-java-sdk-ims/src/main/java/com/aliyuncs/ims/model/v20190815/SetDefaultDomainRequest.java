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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDefaultDomainRequest extends RpcAcsRequest<SetDefaultDomainResponse> {
	   

	private String defaultDomainName;
	public SetDefaultDomainRequest() {
		super("Ims", "2019-08-15", "SetDefaultDomain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultDomainName() {
		return this.defaultDomainName;
	}

	public void setDefaultDomainName(String defaultDomainName) {
		this.defaultDomainName = defaultDomainName;
		if(defaultDomainName != null){
			putQueryParameter("DefaultDomainName", defaultDomainName);
		}
	}

	@Override
	public Class<SetDefaultDomainResponse> getResponseClass() {
		return SetDefaultDomainResponse.class;
	}

}
