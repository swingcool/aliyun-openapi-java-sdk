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

package com.aliyuncs.facebody.model.v20200910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20200910.DetectIPCPedestrianOptimizedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectIPCPedestrianOptimizedResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ImageInfoListItem> imageInfoList;

		public List<ImageInfoListItem> getImageInfoList() {
			return this.imageInfoList;
		}

		public void setImageInfoList(List<ImageInfoListItem> imageInfoList) {
			this.imageInfoList = imageInfoList;
		}

		public static class ImageInfoListItem {

			private List<Element> elements;

			public List<Element> getElements() {
				return this.elements;
			}

			public void setElements(List<Element> elements) {
				this.elements = elements;
			}

			public static class Element {

				private Float score;

				private List<Long> boxes;

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public List<Long> getBoxes() {
					return this.boxes;
				}

				public void setBoxes(List<Long> boxes) {
					this.boxes = boxes;
				}
			}
		}
	}

	@Override
	public DetectIPCPedestrianOptimizedResponse getInstance(UnmarshallerContext context) {
		return	DetectIPCPedestrianOptimizedResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
