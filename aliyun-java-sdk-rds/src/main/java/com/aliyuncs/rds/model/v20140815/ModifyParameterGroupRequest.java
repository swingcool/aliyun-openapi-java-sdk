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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyParameterGroupRequest extends RpcAcsRequest<ModifyParameterGroupResponse> {
	   

	private Long resourceOwnerId;

	private String parameterGroupId;

	private String modifyMode;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String parameterGroupName;

	private String parameters;

	private String parameterGroupDesc;
	public ModifyParameterGroupRequest() {
		super("Rds", "2014-08-15", "ModifyParameterGroup", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getParameterGroupId() {
		return this.parameterGroupId;
	}

	public void setParameterGroupId(String parameterGroupId) {
		this.parameterGroupId = parameterGroupId;
		if(parameterGroupId != null){
			putQueryParameter("ParameterGroupId", parameterGroupId);
		}
	}

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getParameterGroupName() {
		return this.parameterGroupName;
	}

	public void setParameterGroupName(String parameterGroupName) {
		this.parameterGroupName = parameterGroupName;
		if(parameterGroupName != null){
			putQueryParameter("ParameterGroupName", parameterGroupName);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	public String getParameterGroupDesc() {
		return this.parameterGroupDesc;
	}

	public void setParameterGroupDesc(String parameterGroupDesc) {
		this.parameterGroupDesc = parameterGroupDesc;
		if(parameterGroupDesc != null){
			putQueryParameter("ParameterGroupDesc", parameterGroupDesc);
		}
	}

	@Override
	public Class<ModifyParameterGroupResponse> getResponseClass() {
		return ModifyParameterGroupResponse.class;
	}

}
