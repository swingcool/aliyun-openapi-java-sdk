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
import com.aliyuncs.ecs.transform.v20160314.DescribeDedicatedHostAutoRenewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostAutoRenewResponse extends AcsResponse {

	private String requestId;

	private List<InstanceRenewAttribute> instanceRenewAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceRenewAttribute> getInstanceRenewAttributes() {
		return this.instanceRenewAttributes;
	}

	public void setInstanceRenewAttributes(List<InstanceRenewAttribute> instanceRenewAttributes) {
		this.instanceRenewAttributes = instanceRenewAttributes;
	}

	public static class InstanceRenewAttribute {

		private String periodUnit;

		private Integer duration;

		private String renewalStatus;

		private String instanceId;

		private Boolean autoRenewEnabled;

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getAutoRenewEnabled() {
			return this.autoRenewEnabled;
		}

		public void setAutoRenewEnabled(Boolean autoRenewEnabled) {
			this.autoRenewEnabled = autoRenewEnabled;
		}
	}

	@Override
	public DescribeDedicatedHostAutoRenewResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostAutoRenewResponseUnmarshaller.unmarshall(this, context);
	}
}
