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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCharsetRequest extends RpcAcsRequest<DescribeCharsetResponse> {
	   

	private String tenantMode;
	public DescribeCharsetRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeCharset", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantMode() {
		return this.tenantMode;
	}

	public void setTenantMode(String tenantMode) {
		this.tenantMode = tenantMode;
		if(tenantMode != null){
			putBodyParameter("TenantMode", tenantMode);
		}
	}

	@Override
	public Class<DescribeCharsetResponse> getResponseClass() {
		return DescribeCharsetResponse.class;
	}

}
