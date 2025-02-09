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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RefreshAssetsRequest extends RpcAcsRequest<RefreshAssetsResponse> {
	   

	private Integer cloudAssetType;

	private Integer cloudAssetSubType;

	private String assetType;
	public RefreshAssetsRequest() {
		super("Sas", "2018-12-03", "RefreshAssets");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCloudAssetType() {
		return this.cloudAssetType;
	}

	public void setCloudAssetType(Integer cloudAssetType) {
		this.cloudAssetType = cloudAssetType;
		if(cloudAssetType != null){
			putQueryParameter("CloudAssetType", cloudAssetType.toString());
		}
	}

	public Integer getCloudAssetSubType() {
		return this.cloudAssetSubType;
	}

	public void setCloudAssetSubType(Integer cloudAssetSubType) {
		this.cloudAssetSubType = cloudAssetSubType;
		if(cloudAssetSubType != null){
			putQueryParameter("CloudAssetSubType", cloudAssetSubType.toString());
		}
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
		if(assetType != null){
			putQueryParameter("AssetType", assetType);
		}
	}

	@Override
	public Class<RefreshAssetsResponse> getResponseClass() {
		return RefreshAssetsResponse.class;
	}

}
