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
import com.aliyuncs.ecs.transform.v20160314.DescribeInstancePerformanceRestrictHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancePerformanceRestrictHistoryResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<PerformanceRestrictHistory> performanceRestrictHistories;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PerformanceRestrictHistory> getPerformanceRestrictHistories() {
		return this.performanceRestrictHistories;
	}

	public void setPerformanceRestrictHistories(List<PerformanceRestrictHistory> performanceRestrictHistories) {
		this.performanceRestrictHistories = performanceRestrictHistories;
	}

	public static class PerformanceRestrictHistory {

		private String instanceId;

		private List<String> intervals;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<String> getIntervals() {
			return this.intervals;
		}

		public void setIntervals(List<String> intervals) {
			this.intervals = intervals;
		}
	}

	@Override
	public DescribeInstancePerformanceRestrictHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancePerformanceRestrictHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
