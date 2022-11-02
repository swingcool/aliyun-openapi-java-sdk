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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachCenChildInstanceRequest extends RpcAcsRequest<DetachCenChildInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String cenId;

	private Long cenOwnerId;

	private String childInstanceRegionId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String childInstanceType;

	private Long childInstanceOwnerId;

	private String childInstanceId;
	public DetachCenChildInstanceRequest() {
		super("Cbn", "2017-09-12", "DetachCenChildInstance", "cbn");
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

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public Long getCenOwnerId() {
		return this.cenOwnerId;
	}

	public void setCenOwnerId(Long cenOwnerId) {
		this.cenOwnerId = cenOwnerId;
		if(cenOwnerId != null){
			putQueryParameter("CenOwnerId", cenOwnerId.toString());
		}
	}

	public String getChildInstanceRegionId() {
		return this.childInstanceRegionId;
	}

	public void setChildInstanceRegionId(String childInstanceRegionId) {
		this.childInstanceRegionId = childInstanceRegionId;
		if(childInstanceRegionId != null){
			putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public String getChildInstanceType() {
		return this.childInstanceType;
	}

	public void setChildInstanceType(String childInstanceType) {
		this.childInstanceType = childInstanceType;
		if(childInstanceType != null){
			putQueryParameter("ChildInstanceType", childInstanceType);
		}
	}

	public Long getChildInstanceOwnerId() {
		return this.childInstanceOwnerId;
	}

	public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
		this.childInstanceOwnerId = childInstanceOwnerId;
		if(childInstanceOwnerId != null){
			putQueryParameter("ChildInstanceOwnerId", childInstanceOwnerId.toString());
		}
	}

	public String getChildInstanceId() {
		return this.childInstanceId;
	}

	public void setChildInstanceId(String childInstanceId) {
		this.childInstanceId = childInstanceId;
		if(childInstanceId != null){
			putQueryParameter("ChildInstanceId", childInstanceId);
		}
	}

	@Override
	public Class<DetachCenChildInstanceResponse> getResponseClass() {
		return DetachCenChildInstanceResponse.class;
	}

}
