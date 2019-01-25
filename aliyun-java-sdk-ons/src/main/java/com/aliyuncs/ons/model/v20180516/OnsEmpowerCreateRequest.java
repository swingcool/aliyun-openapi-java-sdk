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

package com.aliyuncs.ons.model.v20180516;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsEmpowerCreateRequest extends RpcAcsRequest<OnsEmpowerCreateResponse> {
	
	public OnsEmpowerCreateRequest() {
		super("Ons", "2018-05-16", "OnsEmpowerCreate");
	}

	private Long preventCache;

	private String onsRegionId;

	private String onsPlatform;

	private String empowerUser;

	private String topic;

	private Integer relation;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		if(onsRegionId != null){
			putQueryParameter("OnsRegionId", onsRegionId);
		}
	}

	public String getOnsPlatform() {
		return this.onsPlatform;
	}

	public void setOnsPlatform(String onsPlatform) {
		this.onsPlatform = onsPlatform;
		if(onsPlatform != null){
			putQueryParameter("OnsPlatform", onsPlatform);
		}
	}

	public String getEmpowerUser() {
		return this.empowerUser;
	}

	public void setEmpowerUser(String empowerUser) {
		this.empowerUser = empowerUser;
		if(empowerUser != null){
			putQueryParameter("EmpowerUser", empowerUser);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public Integer getRelation() {
		return this.relation;
	}

	public void setRelation(Integer relation) {
		this.relation = relation;
		if(relation != null){
			putQueryParameter("Relation", relation.toString());
		}
	}

	@Override
	public Class<OnsEmpowerCreateResponse> getResponseClass() {
		return OnsEmpowerCreateResponse.class;
	}

}
