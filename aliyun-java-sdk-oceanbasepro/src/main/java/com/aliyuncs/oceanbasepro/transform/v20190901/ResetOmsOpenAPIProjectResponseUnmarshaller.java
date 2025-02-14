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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.ResetOmsOpenAPIProjectResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ResetOmsOpenAPIProjectResponse.ErrorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetOmsOpenAPIProjectResponseUnmarshaller {

	public static ResetOmsOpenAPIProjectResponse unmarshall(ResetOmsOpenAPIProjectResponse resetOmsOpenAPIProjectResponse, UnmarshallerContext _ctx) {
		
		resetOmsOpenAPIProjectResponse.setRequestId(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.RequestId"));
		resetOmsOpenAPIProjectResponse.setSuccess(_ctx.booleanValue("ResetOmsOpenAPIProjectResponse.Success"));
		resetOmsOpenAPIProjectResponse.setCode(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.Code"));
		resetOmsOpenAPIProjectResponse.setMessage(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.Message"));
		resetOmsOpenAPIProjectResponse.setAdvice(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.Advice"));
		resetOmsOpenAPIProjectResponse.setPageNumber(_ctx.integerValue("ResetOmsOpenAPIProjectResponse.PageNumber"));
		resetOmsOpenAPIProjectResponse.setPageSize(_ctx.integerValue("ResetOmsOpenAPIProjectResponse.PageSize"));
		resetOmsOpenAPIProjectResponse.setTotalCount(_ctx.longValue("ResetOmsOpenAPIProjectResponse.TotalCount"));
		resetOmsOpenAPIProjectResponse.setCost(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.Cost"));
		resetOmsOpenAPIProjectResponse.setData(_ctx.booleanValue("ResetOmsOpenAPIProjectResponse.Data"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("ResetOmsOpenAPIProjectResponse.ErrorDetail.Proposal"));
		resetOmsOpenAPIProjectResponse.setErrorDetail(errorDetail);
	 
	 	return resetOmsOpenAPIProjectResponse;
	}
}