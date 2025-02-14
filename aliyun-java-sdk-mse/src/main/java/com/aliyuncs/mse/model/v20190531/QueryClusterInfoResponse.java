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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryClusterInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryClusterInfoResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String errorCode;

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

		private String vpcId;

		private String createTime;

		private String intranetAddress;

		private String diskType;

		private String pubNetworkFlow;

		private Long diskCapacity;

		private Long memoryCapacity;

		private String clusterAliasName;

		private Integer instanceCount;

		private String intranetPort;

		private String clusterId;

		private String intranetDomain;

		private String internetDomain;

		private String payInfo;

		private String internetAddress;

		private String instanceId;

		private String aclEntryList;

		private String healthStatus;

		private Long initCostTime;

		private String regionId;

		private String aclId;

		private Integer cpu;

		private String clusterType;

		private String clusterName;

		private String initStatus;

		private String internetPort;

		private String appVersion;

		private String netType;

		private String clusterVersion;

		private String clusterSpecification;

		private String vSwitchId;

		private String connectionType;

		private String mseVersion;

		private String chargeType;

		private Map<Object,Object> tags;

		private List<InstanceModel> instanceModels;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getIntranetAddress() {
			return this.intranetAddress;
		}

		public void setIntranetAddress(String intranetAddress) {
			this.intranetAddress = intranetAddress;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getPubNetworkFlow() {
			return this.pubNetworkFlow;
		}

		public void setPubNetworkFlow(String pubNetworkFlow) {
			this.pubNetworkFlow = pubNetworkFlow;
		}

		public Long getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Long diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public Long getMemoryCapacity() {
			return this.memoryCapacity;
		}

		public void setMemoryCapacity(Long memoryCapacity) {
			this.memoryCapacity = memoryCapacity;
		}

		public String getClusterAliasName() {
			return this.clusterAliasName;
		}

		public void setClusterAliasName(String clusterAliasName) {
			this.clusterAliasName = clusterAliasName;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getIntranetPort() {
			return this.intranetPort;
		}

		public void setIntranetPort(String intranetPort) {
			this.intranetPort = intranetPort;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getIntranetDomain() {
			return this.intranetDomain;
		}

		public void setIntranetDomain(String intranetDomain) {
			this.intranetDomain = intranetDomain;
		}

		public String getInternetDomain() {
			return this.internetDomain;
		}

		public void setInternetDomain(String internetDomain) {
			this.internetDomain = internetDomain;
		}

		public String getPayInfo() {
			return this.payInfo;
		}

		public void setPayInfo(String payInfo) {
			this.payInfo = payInfo;
		}

		public String getInternetAddress() {
			return this.internetAddress;
		}

		public void setInternetAddress(String internetAddress) {
			this.internetAddress = internetAddress;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAclEntryList() {
			return this.aclEntryList;
		}

		public void setAclEntryList(String aclEntryList) {
			this.aclEntryList = aclEntryList;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public Long getInitCostTime() {
			return this.initCostTime;
		}

		public void setInitCostTime(Long initCostTime) {
			this.initCostTime = initCostTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
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

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getInitStatus() {
			return this.initStatus;
		}

		public void setInitStatus(String initStatus) {
			this.initStatus = initStatus;
		}

		public String getInternetPort() {
			return this.internetPort;
		}

		public void setInternetPort(String internetPort) {
			this.internetPort = internetPort;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getClusterVersion() {
			return this.clusterVersion;
		}

		public void setClusterVersion(String clusterVersion) {
			this.clusterVersion = clusterVersion;
		}

		public String getClusterSpecification() {
			return this.clusterSpecification;
		}

		public void setClusterSpecification(String clusterSpecification) {
			this.clusterSpecification = clusterSpecification;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getConnectionType() {
			return this.connectionType;
		}

		public void setConnectionType(String connectionType) {
			this.connectionType = connectionType;
		}

		public String getMseVersion() {
			return this.mseVersion;
		}

		public void setMseVersion(String mseVersion) {
			this.mseVersion = mseVersion;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public List<InstanceModel> getInstanceModels() {
			return this.instanceModels;
		}

		public void setInstanceModels(List<InstanceModel> instanceModels) {
			this.instanceModels = instanceModels;
		}

		public static class InstanceModel {

			private String podName;

			private String singleTunnelVip;

			private String internetIp;

			private String ip;

			private String role;

			private String healthStatus;

			private String creationTimestamp;

			private String zone;

			public String getPodName() {
				return this.podName;
			}

			public void setPodName(String podName) {
				this.podName = podName;
			}

			public String getSingleTunnelVip() {
				return this.singleTunnelVip;
			}

			public void setSingleTunnelVip(String singleTunnelVip) {
				this.singleTunnelVip = singleTunnelVip;
			}

			public String getInternetIp() {
				return this.internetIp;
			}

			public void setInternetIp(String internetIp) {
				this.internetIp = internetIp;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getHealthStatus() {
				return this.healthStatus;
			}

			public void setHealthStatus(String healthStatus) {
				this.healthStatus = healthStatus;
			}

			public String getCreationTimestamp() {
				return this.creationTimestamp;
			}

			public void setCreationTimestamp(String creationTimestamp) {
				this.creationTimestamp = creationTimestamp;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
			}
		}
	}

	@Override
	public QueryClusterInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryClusterInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
