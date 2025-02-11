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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.ModifyOrderAutoRebootTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyOrderAutoRebootTimeResponse extends AcsResponse {

	private String requestId;

	private ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ModifyOrderAutoRebootTimeInfo getModifyOrderAutoRebootTimeInfo() {
		return this.modifyOrderAutoRebootTimeInfo;
	}

	public void setModifyOrderAutoRebootTimeInfo(ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo) {
		this.modifyOrderAutoRebootTimeInfo = modifyOrderAutoRebootTimeInfo;
	}

	public static class ModifyOrderAutoRebootTimeInfo {

		private String autoRebootTime;

		private Long orderId;

		public String getAutoRebootTime() {
			return this.autoRebootTime;
		}

		public void setAutoRebootTime(String autoRebootTime) {
			this.autoRebootTime = autoRebootTime;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
	}

	@Override
	public ModifyOrderAutoRebootTimeResponse getInstance(UnmarshallerContext context) {
		return	ModifyOrderAutoRebootTimeResponseUnmarshaller.unmarshall(this, context);
	}
}
