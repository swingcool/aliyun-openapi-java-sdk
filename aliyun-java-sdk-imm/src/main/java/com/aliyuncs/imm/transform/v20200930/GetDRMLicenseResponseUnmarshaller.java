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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.GetDRMLicenseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDRMLicenseResponseUnmarshaller {

	public static GetDRMLicenseResponse unmarshall(GetDRMLicenseResponse getDRMLicenseResponse, UnmarshallerContext _ctx) {
		
		getDRMLicenseResponse.setRequestId(_ctx.stringValue("GetDRMLicenseResponse.RequestId"));
		getDRMLicenseResponse.setLicense(_ctx.stringValue("GetDRMLicenseResponse.License"));
		getDRMLicenseResponse.setStates(_ctx.longValue("GetDRMLicenseResponse.States"));
		getDRMLicenseResponse.setDeviceInfo(_ctx.stringValue("GetDRMLicenseResponse.DeviceInfo"));
	 
	 	return getDRMLicenseResponse;
	}
}