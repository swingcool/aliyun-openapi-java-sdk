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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.SearchAlertRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAlertRulesResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<AlertRuleEntity> alertRules;

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

		public List<AlertRuleEntity> getAlertRules() {
			return this.alertRules;
		}

		public void setAlertRules(List<AlertRuleEntity> alertRules) {
			this.alertRules = alertRules;
		}

		public static class AlertRuleEntity {

			private String status;

			private Long updateTime;

			private String contactGroupIdList;

			private Long createTime;

			private String alertTitle;

			private String userId;

			private Integer alertVersion;

			private Boolean hostByAlertManager;

			private Integer alertType;

			private String contactGroupIds;

			private String config;

			private String regionId;

			private String alertLevel;

			private String taskStatus;

			private String title;

			private Long taskId;

			private Long id;

			private String resourceGroupId;

			private List<String> alertWays;

			private AlarmContext alarmContext;

			private AlertRule alertRule;

			private MetricParam metricParam;

			private Notice notice;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getContactGroupIdList() {
				return this.contactGroupIdList;
			}

			public void setContactGroupIdList(String contactGroupIdList) {
				this.contactGroupIdList = contactGroupIdList;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getAlertTitle() {
				return this.alertTitle;
			}

			public void setAlertTitle(String alertTitle) {
				this.alertTitle = alertTitle;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Integer getAlertVersion() {
				return this.alertVersion;
			}

			public void setAlertVersion(Integer alertVersion) {
				this.alertVersion = alertVersion;
			}

			public Boolean getHostByAlertManager() {
				return this.hostByAlertManager;
			}

			public void setHostByAlertManager(Boolean hostByAlertManager) {
				this.hostByAlertManager = hostByAlertManager;
			}

			public Integer getAlertType() {
				return this.alertType;
			}

			public void setAlertType(Integer alertType) {
				this.alertType = alertType;
			}

			public String getContactGroupIds() {
				return this.contactGroupIds;
			}

			public void setContactGroupIds(String contactGroupIds) {
				this.contactGroupIds = contactGroupIds;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAlertLevel() {
				return this.alertLevel;
			}

			public void setAlertLevel(String alertLevel) {
				this.alertLevel = alertLevel;
			}

			public String getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public List<String> getAlertWays() {
				return this.alertWays;
			}

			public void setAlertWays(List<String> alertWays) {
				this.alertWays = alertWays;
			}

			public AlarmContext getAlarmContext() {
				return this.alarmContext;
			}

			public void setAlarmContext(AlarmContext alarmContext) {
				this.alarmContext = alarmContext;
			}

			public AlertRule getAlertRule() {
				return this.alertRule;
			}

			public void setAlertRule(AlertRule alertRule) {
				this.alertRule = alertRule;
			}

			public MetricParam getMetricParam() {
				return this.metricParam;
			}

			public void setMetricParam(MetricParam metricParam) {
				this.metricParam = metricParam;
			}

			public Notice getNotice() {
				return this.notice;
			}

			public void setNotice(Notice notice) {
				this.notice = notice;
			}

			public static class AlarmContext {

				private String alarmContentTemplate;

				private String subTitle;

				private String alarmContentSubTitle;

				private String content;

				public String getAlarmContentTemplate() {
					return this.alarmContentTemplate;
				}

				public void setAlarmContentTemplate(String alarmContentTemplate) {
					this.alarmContentTemplate = alarmContentTemplate;
				}

				public String getSubTitle() {
					return this.subTitle;
				}

				public void setSubTitle(String subTitle) {
					this.subTitle = subTitle;
				}

				public String getAlarmContentSubTitle() {
					return this.alarmContentSubTitle;
				}

				public void setAlarmContentSubTitle(String alarmContentSubTitle) {
					this.alarmContentSubTitle = alarmContentSubTitle;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}

			public static class AlertRule {

				private String operator;

				private List<Rule> rules;

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public List<Rule> getRules() {
					return this.rules;
				}

				public void setRules(List<Rule> rules) {
					this.rules = rules;
				}

				public static class Rule {

					private String measure;

					private Float value;

					private String aggregates;

					private Integer nValue;

					private String operator;

					private String alias;

					public String getMeasure() {
						return this.measure;
					}

					public void setMeasure(String measure) {
						this.measure = measure;
					}

					public Float getValue() {
						return this.value;
					}

					public void setValue(Float value) {
						this.value = value;
					}

					public String getAggregates() {
						return this.aggregates;
					}

					public void setAggregates(String aggregates) {
						this.aggregates = aggregates;
					}

					public Integer getNValue() {
						return this.nValue;
					}

					public void setNValue(Integer nValue) {
						this.nValue = nValue;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public String getAlias() {
						return this.alias;
					}

					public void setAlias(String alias) {
						this.alias = alias;
					}
				}
			}

			public static class MetricParam {

				private String type;

				private String appGroupId;

				private String appId;

				private String pid;

				private List<Dimension> dimensions;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getAppGroupId() {
					return this.appGroupId;
				}

				public void setAppGroupId(String appGroupId) {
					this.appGroupId = appGroupId;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getPid() {
					return this.pid;
				}

				public void setPid(String pid) {
					this.pid = pid;
				}

				public List<Dimension> getDimensions() {
					return this.dimensions;
				}

				public void setDimensions(List<Dimension> dimensions) {
					this.dimensions = dimensions;
				}

				public static class Dimension {

					private String key;

					private String type;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Notice {

				private Long endTime;

				private Long noticeEndTime;

				private Long startTime;

				private Long noticeStartTime;

				public Long getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Long endTime) {
					this.endTime = endTime;
				}

				public Long getNoticeEndTime() {
					return this.noticeEndTime;
				}

				public void setNoticeEndTime(Long noticeEndTime) {
					this.noticeEndTime = noticeEndTime;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Long getNoticeStartTime() {
					return this.noticeStartTime;
				}

				public void setNoticeStartTime(Long noticeStartTime) {
					this.noticeStartTime = noticeStartTime;
				}
			}
		}
	}

	@Override
	public SearchAlertRulesResponse getInstance(UnmarshallerContext context) {
		return	SearchAlertRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
