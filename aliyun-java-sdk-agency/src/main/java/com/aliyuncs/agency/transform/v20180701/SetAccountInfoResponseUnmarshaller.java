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

package com.aliyuncs.agency.transform.v20180701;

import com.aliyuncs.agency.model.v20180701.SetAccountInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetAccountInfoResponseUnmarshaller {

	public static SetAccountInfoResponse unmarshall(SetAccountInfoResponse setAccountInfoResponse, UnmarshallerContext _ctx) {
		
		setAccountInfoResponse.setCode(_ctx.stringValue("SetAccountInfoResponse.Code"));
		setAccountInfoResponse.setMessage(_ctx.stringValue("SetAccountInfoResponse.Message"));
		setAccountInfoResponse.setSuccess(_ctx.booleanValue("SetAccountInfoResponse.Success"));
	 
	 	return setAccountInfoResponse;
	}
}