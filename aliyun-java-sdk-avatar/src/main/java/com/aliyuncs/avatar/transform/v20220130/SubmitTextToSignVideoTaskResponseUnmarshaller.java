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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.SubmitTextToSignVideoTaskResponse;
import com.aliyuncs.avatar.model.v20220130.SubmitTextToSignVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitTextToSignVideoTaskResponseUnmarshaller {

	public static SubmitTextToSignVideoTaskResponse unmarshall(SubmitTextToSignVideoTaskResponse submitTextToSignVideoTaskResponse, UnmarshallerContext _ctx) {
		
		submitTextToSignVideoTaskResponse.setRequestId(_ctx.stringValue("SubmitTextToSignVideoTaskResponse.RequestId"));
		submitTextToSignVideoTaskResponse.setCode(_ctx.stringValue("SubmitTextToSignVideoTaskResponse.Code"));
		submitTextToSignVideoTaskResponse.setMessage(_ctx.stringValue("SubmitTextToSignVideoTaskResponse.Message"));
		submitTextToSignVideoTaskResponse.setSuccess(_ctx.stringValue("SubmitTextToSignVideoTaskResponse.Success"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("SubmitTextToSignVideoTaskResponse.Data.TaskUuid"));
		submitTextToSignVideoTaskResponse.setData(data);
	 
	 	return submitTextToSignVideoTaskResponse;
	}
}