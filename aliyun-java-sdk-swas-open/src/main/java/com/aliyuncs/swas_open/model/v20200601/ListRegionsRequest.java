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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRegionsRequest extends RpcAcsRequest<ListRegionsResponse> {
	   
	public ListRegionsRequest() {
		super("SWAS-OPEN", "2020-06-01", "ListRegions", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<ListRegionsResponse> getResponseClass() {
		return ListRegionsResponse.class;
	}

}
