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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.QueryFaceImageTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFaceImageTemplateResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ElementsItem> elements;

		public List<ElementsItem> getElements() {
			return this.elements;
		}

		public void setElements(List<ElementsItem> elements) {
			this.elements = elements;
		}

		public static class ElementsItem {

			private String createTime;

			private String updateTime;

			private String userId;

			private String templateId;

			private String templateURL;

			private List<FaceInfosItem> faceInfos;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getTemplateURL() {
				return this.templateURL;
			}

			public void setTemplateURL(String templateURL) {
				this.templateURL = templateURL;
			}

			public List<FaceInfosItem> getFaceInfos() {
				return this.faceInfos;
			}

			public void setFaceInfos(List<FaceInfosItem> faceInfos) {
				this.faceInfos = faceInfos;
			}

			public static class FaceInfosItem {

				private String templateFaceID;

				private FaceRect faceRect;

				public String getTemplateFaceID() {
					return this.templateFaceID;
				}

				public void setTemplateFaceID(String templateFaceID) {
					this.templateFaceID = templateFaceID;
				}

				public FaceRect getFaceRect() {
					return this.faceRect;
				}

				public void setFaceRect(FaceRect faceRect) {
					this.faceRect = faceRect;
				}

				public static class FaceRect {

					private String x;

					private String y;

					private String height;

					private String width;

					public String getX() {
						return this.x;
					}

					public void setX(String x) {
						this.x = x;
					}

					public String getY() {
						return this.y;
					}

					public void setY(String y) {
						this.y = y;
					}

					public String getHeight() {
						return this.height;
					}

					public void setHeight(String height) {
						this.height = height;
					}

					public String getWidth() {
						return this.width;
					}

					public void setWidth(String width) {
						this.width = width;
					}
				}
			}
		}
	}

	@Override
	public QueryFaceImageTemplateResponse getInstance(UnmarshallerContext context) {
		return	QueryFaceImageTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
