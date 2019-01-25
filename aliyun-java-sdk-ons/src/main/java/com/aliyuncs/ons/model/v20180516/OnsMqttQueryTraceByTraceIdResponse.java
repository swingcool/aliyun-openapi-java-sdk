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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180516.OnsMqttQueryTraceByTraceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttQueryTraceByTraceIdResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Long pushCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Long getPushCount() {
		return this.pushCount;
	}

	public void setPushCount(Long pushCount) {
		this.pushCount = pushCount;
	}

	@Override
	public OnsMqttQueryTraceByTraceIdResponse getInstance(UnmarshallerContext context) {
		return	OnsMqttQueryTraceByTraceIdResponseUnmarshaller.unmarshall(this, context);
	}
}
