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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceMaintenanceAttributesRequest extends RpcAcsRequest<ModifyInstanceMaintenanceAttributesResponse> {
	   

	private Long resourceOwnerId;

	private List<MaintenanceWindow> maintenanceWindows;

	private String actionOnMaintenance;

	private Boolean liveMigration;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> instanceIds;
	public ModifyInstanceMaintenanceAttributesRequest() {
		super("Ecs", "2016-03-14", "ModifyInstanceMaintenanceAttributes", "ecs");
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

	public List<MaintenanceWindow> getMaintenanceWindows() {
		return this.maintenanceWindows;
	}

	public void setMaintenanceWindows(List<MaintenanceWindow> maintenanceWindows) {
		this.maintenanceWindows = maintenanceWindows;	
		if (maintenanceWindows != null) {
			for (int depth1 = 0; depth1 < maintenanceWindows.size(); depth1++) {
				putQueryParameter("MaintenanceWindow." + (depth1 + 1) + ".EndTime" , maintenanceWindows.get(depth1).getEndTime());
				putQueryParameter("MaintenanceWindow." + (depth1 + 1) + ".StartTime" , maintenanceWindows.get(depth1).getStartTime());
			}
		}	
	}

	public String getActionOnMaintenance() {
		return this.actionOnMaintenance;
	}

	public void setActionOnMaintenance(String actionOnMaintenance) {
		this.actionOnMaintenance = actionOnMaintenance;
		if(actionOnMaintenance != null){
			putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
		}
	}

	public Boolean getLiveMigration() {
		return this.liveMigration;
	}

	public void setLiveMigration(Boolean liveMigration) {
		this.liveMigration = liveMigration;
		if(liveMigration != null){
			putQueryParameter("LiveMigration", liveMigration.toString());
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public static class MaintenanceWindow {

		private String endTime;

		private String startTime;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public Class<ModifyInstanceMaintenanceAttributesResponse> getResponseClass() {
		return ModifyInstanceMaintenanceAttributesResponse.class;
	}

}
