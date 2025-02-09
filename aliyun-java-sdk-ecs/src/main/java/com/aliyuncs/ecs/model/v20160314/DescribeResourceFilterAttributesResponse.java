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
import com.aliyuncs.ecs.transform.v20160314.DescribeResourceFilterAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceFilterAttributesResponse extends AcsResponse {

	private String requestId;

	private List<FilterAttribute> filterAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FilterAttribute> getFilterAttributes() {
		return this.filterAttributes;
	}

	public void setFilterAttributes(List<FilterAttribute> filterAttributes) {
		this.filterAttributes = filterAttributes;
	}

	public static class FilterAttribute {

		private String type;

		private String name;

		private List<String> supportOperations;

		private List<String> values;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getSupportOperations() {
			return this.supportOperations;
		}

		public void setSupportOperations(List<String> supportOperations) {
			this.supportOperations = supportOperations;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}
	}

	@Override
	public DescribeResourceFilterAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceFilterAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
