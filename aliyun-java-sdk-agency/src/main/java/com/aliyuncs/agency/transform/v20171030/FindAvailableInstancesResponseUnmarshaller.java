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

package com.aliyuncs.agency.transform.v20171030;

import com.aliyuncs.agency.model.v20171030.FindAvailableInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAvailableInstancesResponseUnmarshaller {

	public static FindAvailableInstancesResponse unmarshall(FindAvailableInstancesResponse findAvailableInstancesResponse, UnmarshallerContext _ctx) {
		
		findAvailableInstancesResponse.setCode(_ctx.stringValue("FindAvailableInstancesResponse.Code"));
		findAvailableInstancesResponse.setMessage(_ctx.stringValue("FindAvailableInstancesResponse.Message"));
		findAvailableInstancesResponse.setData(_ctx.booleanValue("FindAvailableInstancesResponse.Data"));
		findAvailableInstancesResponse.setSuccess(_ctx.booleanValue("FindAvailableInstancesResponse.Success"));
	 
	 	return findAvailableInstancesResponse;
	}
}