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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RevertAggregateEvaluationResultsRequest extends RpcAcsRequest<RevertAggregateEvaluationResultsResponse> {
	   

	private String configRuleId;

	@SerializedName("resources")
	private List<Resources> resources;

	private String aggregatorId;
	public RevertAggregateEvaluationResultsRequest() {
		super("Config", "2020-09-07", "RevertAggregateEvaluationResults");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putBodyParameter("ConfigRuleId", configRuleId);
		}
	}

	public List<Resources> getResources() {
		return this.resources;
	}

	public void setResources(List<Resources> resources) {
		this.resources = resources;	
		if (resources != null) {
			putBodyParameter("Resources" , new Gson().toJson(resources));
		}	
	}

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putBodyParameter("AggregatorId", aggregatorId);
		}
	}

	public static class Resources {

		@SerializedName("ResourceId")
		private String resourceId;

		@SerializedName("ResourceAccountId")
		private Long resourceAccountId;

		@SerializedName("Region")
		private String region;

		@SerializedName("ResourceType")
		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public Long getResourceAccountId() {
			return this.resourceAccountId;
		}

		public void setResourceAccountId(Long resourceAccountId) {
			this.resourceAccountId = resourceAccountId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<RevertAggregateEvaluationResultsResponse> getResponseClass() {
		return RevertAggregateEvaluationResultsResponse.class;
	}

}
