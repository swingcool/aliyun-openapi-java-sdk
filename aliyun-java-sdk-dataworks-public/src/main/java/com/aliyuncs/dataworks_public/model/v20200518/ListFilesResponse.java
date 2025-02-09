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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFilesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<File> files;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<File> getFiles() {
			return this.files;
		}

		public void setFiles(List<File> files) {
			this.files = files;
		}

		public static class File {

			private Integer commitStatus;

			private Boolean autoParsing;

			private String owner;

			private Long createTime;

			private Integer fileType;

			private Integer currentVersion;

			private Long bizId;

			private String lastEditUser;

			private String fileName;

			private String connectionName;

			private String useType;

			private String fileFolderId;

			private Long fileId;

			private Long parentId;

			private String createUser;

			private Boolean isMaxCompute;

			private Long businessId;

			private String fileDescription;

			private Long lastEditTime;

			private String content;

			private Long nodeId;

			public Integer getCommitStatus() {
				return this.commitStatus;
			}

			public void setCommitStatus(Integer commitStatus) {
				this.commitStatus = commitStatus;
			}

			public Boolean getAutoParsing() {
				return this.autoParsing;
			}

			public void setAutoParsing(Boolean autoParsing) {
				this.autoParsing = autoParsing;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getFileType() {
				return this.fileType;
			}

			public void setFileType(Integer fileType) {
				this.fileType = fileType;
			}

			public Integer getCurrentVersion() {
				return this.currentVersion;
			}

			public void setCurrentVersion(Integer currentVersion) {
				this.currentVersion = currentVersion;
			}

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public String getLastEditUser() {
				return this.lastEditUser;
			}

			public void setLastEditUser(String lastEditUser) {
				this.lastEditUser = lastEditUser;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getConnectionName() {
				return this.connectionName;
			}

			public void setConnectionName(String connectionName) {
				this.connectionName = connectionName;
			}

			public String getUseType() {
				return this.useType;
			}

			public void setUseType(String useType) {
				this.useType = useType;
			}

			public String getFileFolderId() {
				return this.fileFolderId;
			}

			public void setFileFolderId(String fileFolderId) {
				this.fileFolderId = fileFolderId;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public Boolean getIsMaxCompute() {
				return this.isMaxCompute;
			}

			public void setIsMaxCompute(Boolean isMaxCompute) {
				this.isMaxCompute = isMaxCompute;
			}

			public Long getBusinessId() {
				return this.businessId;
			}

			public void setBusinessId(Long businessId) {
				this.businessId = businessId;
			}

			public String getFileDescription() {
				return this.fileDescription;
			}

			public void setFileDescription(String fileDescription) {
				this.fileDescription = fileDescription;
			}

			public Long getLastEditTime() {
				return this.lastEditTime;
			}

			public void setLastEditTime(Long lastEditTime) {
				this.lastEditTime = lastEditTime;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public ListFilesResponse getInstance(UnmarshallerContext context) {
		return	ListFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
