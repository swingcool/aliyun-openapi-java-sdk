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

package com.aliyuncs.agency.transform.v20210425;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20210425.ListCountriesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCountriesResponseUnmarshaller {

	public static ListCountriesResponse unmarshall(ListCountriesResponse listCountriesResponse, UnmarshallerContext _ctx) {
		
		listCountriesResponse.setRequestId(_ctx.stringValue("ListCountriesResponse.RequestId"));
		listCountriesResponse.setCode(_ctx.stringValue("ListCountriesResponse.Code"));
		listCountriesResponse.setMessage(_ctx.stringValue("ListCountriesResponse.Message"));
		listCountriesResponse.setSuccess(_ctx.booleanValue("ListCountriesResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCountriesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListCountriesResponse.Data["+ i +"]"));
		}
		listCountriesResponse.setData(data);
	 
	 	return listCountriesResponse;
	}
}