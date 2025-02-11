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

package com.aliyuncs.agency.model.v20200324;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferResellerToUserRequest extends RpcAcsRequest<TransferResellerToUserResponse> {
	   

	private Long transferUid;

	private String siteId;

	private String empId;

	private String realName;
	public TransferResellerToUserRequest() {
		super("Agency", "2020-03-24", "TransferResellerToUser", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTransferUid() {
		return this.transferUid;
	}

	public void setTransferUid(Long transferUid) {
		this.transferUid = transferUid;
		if(transferUid != null){
			putQueryParameter("TransferUid", transferUid.toString());
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putQueryParameter("SiteId", siteId);
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putQueryParameter("EmpId", empId);
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putQueryParameter("RealName", realName);
		}
	}

	@Override
	public Class<TransferResellerToUserResponse> getResponseClass() {
		return TransferResellerToUserResponse.class;
	}

}
