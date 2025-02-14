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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.DeleteNetworkInsightsPathResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNetworkInsightsPathResponseUnmarshaller {

	public static DeleteNetworkInsightsPathResponse unmarshall(DeleteNetworkInsightsPathResponse deleteNetworkInsightsPathResponse, UnmarshallerContext _ctx) {
		
		deleteNetworkInsightsPathResponse.setRequestId(_ctx.stringValue("DeleteNetworkInsightsPathResponse.RequestId"));
	 
	 	return deleteNetworkInsightsPathResponse;
	}
}