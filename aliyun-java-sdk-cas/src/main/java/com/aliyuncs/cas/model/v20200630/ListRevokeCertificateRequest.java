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

package com.aliyuncs.cas.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListRevokeCertificateRequest extends RpcAcsRequest<ListRevokeCertificateResponse> {
	   

	private Integer currentPage;

	private Integer showSize;
	public ListRevokeCertificateRequest() {
		super("cas", "2020-06-30", "ListRevokeCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Integer showSize) {
		this.showSize = showSize;
		if(showSize != null){
			putQueryParameter("ShowSize", showSize.toString());
		}
	}

	@Override
	public Class<ListRevokeCertificateResponse> getResponseClass() {
		return ListRevokeCertificateResponse.class;
	}

}
