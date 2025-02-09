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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.ModifyMigrationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyMigrationInstancesResponse extends AcsResponse {

	private String requestId;

	private List<InstancesFailModel> instancesFailModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstancesFailModel> getInstancesFailModels() {
		return this.instancesFailModels;
	}

	public void setInstancesFailModels(List<InstancesFailModel> instancesFailModels) {
		this.instancesFailModels = instancesFailModels;
	}

	public static class InstancesFailModel {

		private String instanceId;

		private List<FailModel> failModels;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<FailModel> getFailModels() {
			return this.failModels;
		}

		public void setFailModels(List<FailModel> failModels) {
			this.failModels = failModels;
		}

		public static class FailModel {

			private String errorCode;

			private String errorMessage;

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}
		}
	}

	@Override
	public ModifyMigrationInstancesResponse getInstance(UnmarshallerContext context) {
		return	ModifyMigrationInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
