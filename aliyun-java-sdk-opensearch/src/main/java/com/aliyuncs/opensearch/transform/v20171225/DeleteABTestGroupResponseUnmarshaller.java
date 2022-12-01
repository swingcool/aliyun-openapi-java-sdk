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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.DeleteABTestGroupResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteABTestGroupResponseUnmarshaller {

	public static DeleteABTestGroupResponse unmarshall(DeleteABTestGroupResponse deleteABTestGroupResponse, UnmarshallerContext _ctx) {
		
		deleteABTestGroupResponse.setResult(_ctx.mapValue("DeleteABTestGroupResponse.result"));
		deleteABTestGroupResponse.setRequestId(_ctx.stringValue("DeleteABTestGroupResponse.requestId"));
	 
	 	return deleteABTestGroupResponse;
	}
}