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
import com.aliyuncs.ecs.transform.v20160314.ModifyInstanceChargeTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceChargeTypeResponse extends AcsResponse {

	private String orderId;

	private String requestId;

	private List<FeeOfInstance> feeOfInstances;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FeeOfInstance> getFeeOfInstances() {
		return this.feeOfInstances;
	}

	public void setFeeOfInstances(List<FeeOfInstance> feeOfInstances) {
		this.feeOfInstances = feeOfInstances;
	}

	public static class FeeOfInstance {

		private String instanceId;

		private String currency;

		private String fee;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getFee() {
			return this.fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}
	}

	@Override
	public ModifyInstanceChargeTypeResponse getInstance(UnmarshallerContext context) {
		return	ModifyInstanceChargeTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
