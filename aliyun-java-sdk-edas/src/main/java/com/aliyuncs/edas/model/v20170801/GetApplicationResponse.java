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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Applcation applcation;

	private Application application;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public Applcation getApplcation() {
		return this.applcation;
	}

	public void setApplcation(Applcation applcation) {
		this.applcation = applcation;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public static class Applcation {

		private String extSlbIp;

		private String owner;

		private Integer slbPort;

		private String nameSpace;

		private String extSlbName;

		private Long createTime;

		private String userId;

		private Integer port;

		private Integer runningInstanceCount;

		private String slbIp;

		private Boolean dockerize;

		private String description;

		private Integer instanceCount;

		private String appId;

		private String slbInfo;

		private Integer memory;

		private String name;

		private String clusterId;

		private String slbId;

		private String healthCheckUrl;

		private String applicationType;

		private String extSlbId;

		private String regionId;

		private Long buildPackageId;

		private String email;

		private Integer cpu;

		private Integer clusterType;

		private String slbName;

		private Boolean enableUrlCheck;

		private Boolean enablePortCheck;

		private String appPhase;

		private Boolean haveManageAccess;

		public String getExtSlbIp() {
			return this.extSlbIp;
		}

		public void setExtSlbIp(String extSlbIp) {
			this.extSlbIp = extSlbIp;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(Integer slbPort) {
			this.slbPort = slbPort;
		}

		public String getNameSpace() {
			return this.nameSpace;
		}

		public void setNameSpace(String nameSpace) {
			this.nameSpace = nameSpace;
		}

		public String getExtSlbName() {
			return this.extSlbName;
		}

		public void setExtSlbName(String extSlbName) {
			this.extSlbName = extSlbName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getRunningInstanceCount() {
			return this.runningInstanceCount;
		}

		public void setRunningInstanceCount(Integer runningInstanceCount) {
			this.runningInstanceCount = runningInstanceCount;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public Boolean getDockerize() {
			return this.dockerize;
		}

		public void setDockerize(Boolean dockerize) {
			this.dockerize = dockerize;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getSlbInfo() {
			return this.slbInfo;
		}

		public void setSlbInfo(String slbInfo) {
			this.slbInfo = slbInfo;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getHealthCheckUrl() {
			return this.healthCheckUrl;
		}

		public void setHealthCheckUrl(String healthCheckUrl) {
			this.healthCheckUrl = healthCheckUrl;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public String getExtSlbId() {
			return this.extSlbId;
		}

		public void setExtSlbId(String extSlbId) {
			this.extSlbId = extSlbId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getBuildPackageId() {
			return this.buildPackageId;
		}

		public void setBuildPackageId(Long buildPackageId) {
			this.buildPackageId = buildPackageId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public String getSlbName() {
			return this.slbName;
		}

		public void setSlbName(String slbName) {
			this.slbName = slbName;
		}

		public Boolean getEnableUrlCheck() {
			return this.enableUrlCheck;
		}

		public void setEnableUrlCheck(Boolean enableUrlCheck) {
			this.enableUrlCheck = enableUrlCheck;
		}

		public Boolean getEnablePortCheck() {
			return this.enablePortCheck;
		}

		public void setEnablePortCheck(Boolean enablePortCheck) {
			this.enablePortCheck = enablePortCheck;
		}

		public String getAppPhase() {
			return this.appPhase;
		}

		public void setAppPhase(String appPhase) {
			this.appPhase = appPhase;
		}

		public Boolean getHaveManageAccess() {
			return this.haveManageAccess;
		}

		public void setHaveManageAccess(Boolean haveManageAccess) {
			this.haveManageAccess = haveManageAccess;
		}
	}

	public static class Application {

		private String extSlbIp;

		private String owner;

		private Integer slbPort;

		private String nameSpace;

		private String extSlbName;

		private Long createTime;

		private String userId;

		private Integer port;

		private Integer runningInstanceCount;

		private String slbIp;

		private Boolean dockerize;

		private String description;

		private Integer instanceCount;

		private String appId;

		private String slbInfo;

		private Integer memory;

		private String name;

		private String clusterId;

		private String slbId;

		private String healthCheckUrl;

		private String applicationType;

		private String extSlbId;

		private String regionId;

		private Long buildPackageId;

		private String email;

		private Integer cpu;

		private String clusterType;

		private String slbName;

		private Boolean enableUrlCheck;

		private Boolean enablePortCheck;

		private String appPhase;

		private String haveManageAccess;

		public String getExtSlbIp() {
			return this.extSlbIp;
		}

		public void setExtSlbIp(String extSlbIp) {
			this.extSlbIp = extSlbIp;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(Integer slbPort) {
			this.slbPort = slbPort;
		}

		public String getNameSpace() {
			return this.nameSpace;
		}

		public void setNameSpace(String nameSpace) {
			this.nameSpace = nameSpace;
		}

		public String getExtSlbName() {
			return this.extSlbName;
		}

		public void setExtSlbName(String extSlbName) {
			this.extSlbName = extSlbName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getRunningInstanceCount() {
			return this.runningInstanceCount;
		}

		public void setRunningInstanceCount(Integer runningInstanceCount) {
			this.runningInstanceCount = runningInstanceCount;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public Boolean getDockerize() {
			return this.dockerize;
		}

		public void setDockerize(Boolean dockerize) {
			this.dockerize = dockerize;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getSlbInfo() {
			return this.slbInfo;
		}

		public void setSlbInfo(String slbInfo) {
			this.slbInfo = slbInfo;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getHealthCheckUrl() {
			return this.healthCheckUrl;
		}

		public void setHealthCheckUrl(String healthCheckUrl) {
			this.healthCheckUrl = healthCheckUrl;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public String getExtSlbId() {
			return this.extSlbId;
		}

		public void setExtSlbId(String extSlbId) {
			this.extSlbId = extSlbId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getBuildPackageId() {
			return this.buildPackageId;
		}

		public void setBuildPackageId(Long buildPackageId) {
			this.buildPackageId = buildPackageId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getSlbName() {
			return this.slbName;
		}

		public void setSlbName(String slbName) {
			this.slbName = slbName;
		}

		public Boolean getEnableUrlCheck() {
			return this.enableUrlCheck;
		}

		public void setEnableUrlCheck(Boolean enableUrlCheck) {
			this.enableUrlCheck = enableUrlCheck;
		}

		public Boolean getEnablePortCheck() {
			return this.enablePortCheck;
		}

		public void setEnablePortCheck(Boolean enablePortCheck) {
			this.enablePortCheck = enablePortCheck;
		}

		public String getAppPhase() {
			return this.appPhase;
		}

		public void setAppPhase(String appPhase) {
			this.appPhase = appPhase;
		}

		public String getHaveManageAccess() {
			return this.haveManageAccess;
		}

		public void setHaveManageAccess(String haveManageAccess) {
			this.haveManageAccess = haveManageAccess;
		}
	}

	@Override
	public GetApplicationResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
