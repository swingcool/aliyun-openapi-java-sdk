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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListABTestMetricsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListABTestMetricsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListABTestMetricsResponseUnmarshaller {

	public static ListABTestMetricsResponse unmarshall(ListABTestMetricsResponse listABTestMetricsResponse, UnmarshallerContext _ctx) {
		
		listABTestMetricsResponse.setRequestId(_ctx.stringValue("ListABTestMetricsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListABTestMetricsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setZeroHitRate(_ctx.floatValue("ListABTestMetricsResponse.result["+ i +"].zeroHitRate"));
			resultItem.setCtr(_ctx.floatValue("ListABTestMetricsResponse.result["+ i +"].ctr"));
			resultItem.setExperimentName(_ctx.stringValue("ListABTestMetricsResponse.result["+ i +"].experimentName"));
			resultItem.setDate(_ctx.stringValue("ListABTestMetricsResponse.result["+ i +"].date"));
			resultItem.setIpvUv(_ctx.integerValue("ListABTestMetricsResponse.result["+ i +"].ipvUv"));
			resultItem.setIpv(_ctx.integerValue("ListABTestMetricsResponse.result["+ i +"].ipv"));
			resultItem.setUv(_ctx.integerValue("ListABTestMetricsResponse.result["+ i +"].uv"));
			resultItem.setPv(_ctx.integerValue("ListABTestMetricsResponse.result["+ i +"].pv"));

			result.add(resultItem);
		}
		listABTestMetricsResponse.setResult(result);
	 
	 	return listABTestMetricsResponse;
	}
}