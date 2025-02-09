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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCenChildInstanceRouteEntriesToAttachmentRequest extends RpcAcsRequest<ListCenChildInstanceRouteEntriesToAttachmentResponse> {
	   

	private Long resourceOwnerId;

	private String cenId;

	private String nextToken;

	private List<RouteFilter> routeFilters;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterAttachmentId;

	private String serviceType;

	private Integer maxResults;

	private String childInstanceRouteTableId;
	public ListCenChildInstanceRouteEntriesToAttachmentRequest() {
		super("Cbn", "2017-09-12", "ListCenChildInstanceRouteEntriesToAttachment");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<RouteFilter> getRouteFilters() {
		return this.routeFilters;
	}

	public void setRouteFilters(List<RouteFilter> routeFilters) {
		this.routeFilters = routeFilters;	
		if (routeFilters != null) {
			for (int depth1 = 0; depth1 < routeFilters.size(); depth1++) {
				if (routeFilters.get(depth1).getValues() != null) {
					for (int i = 0; i < routeFilters.get(depth1).getValues().size(); i++) {
						putQueryParameter("RouteFilter." + (depth1 + 1) + ".Value." + (i + 1) , routeFilters.get(depth1).getValues().get(i));
					}
				}
				putQueryParameter("RouteFilter." + (depth1 + 1) + ".Key" , routeFilters.get(depth1).getKey());
			}
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

	public String getTransitRouterAttachmentId() {
		return this.transitRouterAttachmentId;
	}

	public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
		this.transitRouterAttachmentId = transitRouterAttachmentId;
		if(transitRouterAttachmentId != null){
			putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getChildInstanceRouteTableId() {
		return this.childInstanceRouteTableId;
	}

	public void setChildInstanceRouteTableId(String childInstanceRouteTableId) {
		this.childInstanceRouteTableId = childInstanceRouteTableId;
		if(childInstanceRouteTableId != null){
			putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
		}
	}

	public static class RouteFilter {

		private List<String> values;

		private String key;

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListCenChildInstanceRouteEntriesToAttachmentResponse> getResponseClass() {
		return ListCenChildInstanceRouteEntriesToAttachmentResponse.class;
	}

}
