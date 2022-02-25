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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetFullRequestOriginStatByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFullRequestOriginStatByInstanceIdResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Long code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private List<ListItem> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String key;

			private Long avgFetchRows;

			private Double avgLockWaitTime;

			private Double avgLogicalRead;

			private Long avgPhysicalAsyncRead;

			private Double avgPhysicalSyncRead;

			private Long avgRows;

			private Double avgExaminedRows;

			private Double avgReturnedRows;

			private Double avgUpdatedRows;

			private Double avgRt;

			private Long avgSqlCount;

			private Long count;

			private Double countRate;

			private String database;

			private Long errorCount;

			private Long fetchRows;

			private String ip;

			private Double lockWaitTime;

			private Long logicalRead;

			private String originHost;

			private Long physicalAsyncRead;

			private Long physicalSyncRead;

			private Long port;

			private Long rows;

			private Long examinedRows;

			private Long rtGreaterThanOneSecondCount;

			private Double rtRate;

			private Long sqlCount;

			private Long sumUpdatedRows;

			private Long version;

			private String vpcId;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public Long getAvgFetchRows() {
				return this.avgFetchRows;
			}

			public void setAvgFetchRows(Long avgFetchRows) {
				this.avgFetchRows = avgFetchRows;
			}

			public Double getAvgLockWaitTime() {
				return this.avgLockWaitTime;
			}

			public void setAvgLockWaitTime(Double avgLockWaitTime) {
				this.avgLockWaitTime = avgLockWaitTime;
			}

			public Double getAvgLogicalRead() {
				return this.avgLogicalRead;
			}

			public void setAvgLogicalRead(Double avgLogicalRead) {
				this.avgLogicalRead = avgLogicalRead;
			}

			public Long getAvgPhysicalAsyncRead() {
				return this.avgPhysicalAsyncRead;
			}

			public void setAvgPhysicalAsyncRead(Long avgPhysicalAsyncRead) {
				this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
			}

			public Double getAvgPhysicalSyncRead() {
				return this.avgPhysicalSyncRead;
			}

			public void setAvgPhysicalSyncRead(Double avgPhysicalSyncRead) {
				this.avgPhysicalSyncRead = avgPhysicalSyncRead;
			}

			public Long getAvgRows() {
				return this.avgRows;
			}

			public void setAvgRows(Long avgRows) {
				this.avgRows = avgRows;
			}

			public Double getAvgExaminedRows() {
				return this.avgExaminedRows;
			}

			public void setAvgExaminedRows(Double avgExaminedRows) {
				this.avgExaminedRows = avgExaminedRows;
			}

			public Double getAvgReturnedRows() {
				return this.avgReturnedRows;
			}

			public void setAvgReturnedRows(Double avgReturnedRows) {
				this.avgReturnedRows = avgReturnedRows;
			}

			public Double getAvgUpdatedRows() {
				return this.avgUpdatedRows;
			}

			public void setAvgUpdatedRows(Double avgUpdatedRows) {
				this.avgUpdatedRows = avgUpdatedRows;
			}

			public Double getAvgRt() {
				return this.avgRt;
			}

			public void setAvgRt(Double avgRt) {
				this.avgRt = avgRt;
			}

			public Long getAvgSqlCount() {
				return this.avgSqlCount;
			}

			public void setAvgSqlCount(Long avgSqlCount) {
				this.avgSqlCount = avgSqlCount;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Double getCountRate() {
				return this.countRate;
			}

			public void setCountRate(Double countRate) {
				this.countRate = countRate;
			}

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public Long getErrorCount() {
				return this.errorCount;
			}

			public void setErrorCount(Long errorCount) {
				this.errorCount = errorCount;
			}

			public Long getFetchRows() {
				return this.fetchRows;
			}

			public void setFetchRows(Long fetchRows) {
				this.fetchRows = fetchRows;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Double getLockWaitTime() {
				return this.lockWaitTime;
			}

			public void setLockWaitTime(Double lockWaitTime) {
				this.lockWaitTime = lockWaitTime;
			}

			public Long getLogicalRead() {
				return this.logicalRead;
			}

			public void setLogicalRead(Long logicalRead) {
				this.logicalRead = logicalRead;
			}

			public String getOriginHost() {
				return this.originHost;
			}

			public void setOriginHost(String originHost) {
				this.originHost = originHost;
			}

			public Long getPhysicalAsyncRead() {
				return this.physicalAsyncRead;
			}

			public void setPhysicalAsyncRead(Long physicalAsyncRead) {
				this.physicalAsyncRead = physicalAsyncRead;
			}

			public Long getPhysicalSyncRead() {
				return this.physicalSyncRead;
			}

			public void setPhysicalSyncRead(Long physicalSyncRead) {
				this.physicalSyncRead = physicalSyncRead;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public Long getRows() {
				return this.rows;
			}

			public void setRows(Long rows) {
				this.rows = rows;
			}

			public Long getExaminedRows() {
				return this.examinedRows;
			}

			public void setExaminedRows(Long examinedRows) {
				this.examinedRows = examinedRows;
			}

			public Long getRtGreaterThanOneSecondCount() {
				return this.rtGreaterThanOneSecondCount;
			}

			public void setRtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
				this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
			}

			public Double getRtRate() {
				return this.rtRate;
			}

			public void setRtRate(Double rtRate) {
				this.rtRate = rtRate;
			}

			public Long getSqlCount() {
				return this.sqlCount;
			}

			public void setSqlCount(Long sqlCount) {
				this.sqlCount = sqlCount;
			}

			public Long getSumUpdatedRows() {
				return this.sumUpdatedRows;
			}

			public void setSumUpdatedRows(Long sumUpdatedRows) {
				this.sumUpdatedRows = sumUpdatedRows;
			}

			public Long getVersion() {
				return this.version;
			}

			public void setVersion(Long version) {
				this.version = version;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}
		}
	}

	@Override
	public GetFullRequestOriginStatByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	GetFullRequestOriginStatByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
