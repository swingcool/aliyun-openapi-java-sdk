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

import com.aliyuncs.opensearch.model.v20171225.ModifyFirstRankResponse;
import com.aliyuncs.opensearch.model.v20171225.ModifyFirstRankResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.ModifyFirstRankResponse.Result.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFirstRankResponseUnmarshaller {

	public static ModifyFirstRankResponse unmarshall(ModifyFirstRankResponse modifyFirstRankResponse, UnmarshallerContext _ctx) {
		
		modifyFirstRankResponse.setRequestId(_ctx.stringValue("ModifyFirstRankResponse.requestId"));

		Result result = new Result();
		result.setDescription(_ctx.stringValue("ModifyFirstRankResponse.result.description"));
		result.setActive(_ctx.booleanValue("ModifyFirstRankResponse.result.active"));
		result.setName(_ctx.stringValue("ModifyFirstRankResponse.result.name"));

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyFirstRankResponse.result.meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setArg(_ctx.stringValue("ModifyFirstRankResponse.result.meta["+ i +"].arg"));
			metaItem.setAttribute(_ctx.stringValue("ModifyFirstRankResponse.result.meta["+ i +"].attribute"));
			metaItem.setWeight(_ctx.floatValue("ModifyFirstRankResponse.result.meta["+ i +"].weight"));

			meta.add(metaItem);
		}
		result.setMeta(meta);
		modifyFirstRankResponse.setResult(result);
	 
	 	return modifyFirstRankResponse;
	}
}