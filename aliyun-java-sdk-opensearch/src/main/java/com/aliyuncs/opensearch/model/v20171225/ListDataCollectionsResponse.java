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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListDataCollectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataCollectionsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<ResultItem> result;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer created;

		private String dataCollectionType;

		private String type;

		private String industryName;

		private Integer status;

		private Integer updated;

		private String name;

		private String sundialId;

		private String id;

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public String getDataCollectionType() {
			return this.dataCollectionType;
		}

		public void setDataCollectionType(String dataCollectionType) {
			this.dataCollectionType = dataCollectionType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIndustryName() {
			return this.industryName;
		}

		public void setIndustryName(String industryName) {
			this.industryName = industryName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getUpdated() {
			return this.updated;
		}

		public void setUpdated(Integer updated) {
			this.updated = updated;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSundialId() {
			return this.sundialId;
		}

		public void setSundialId(String sundialId) {
			this.sundialId = sundialId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public ListDataCollectionsResponse getInstance(UnmarshallerContext context) {
		return	ListDataCollectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
