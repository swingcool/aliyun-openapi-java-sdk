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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SbjOperateNewRequest extends RpcAcsRequest<SbjOperateNewResponse> {
	   

	private String amount;

	private Boolean auditStatus;

	private String orderNo;

	private String fileDate;

	private Boolean allowResubmit;

	private Boolean submittedSuccess;

	private String successType;

	private String message;

	private String fileOssKey;

	private Boolean changeStatus;

	private Boolean addSubmitCount;

	private String applyNo;

	private String bizId;

	private String operateType;

	private String receiptOssKey;
	public SbjOperateNewRequest() {
		super("Trademark", "2018-07-24", "SbjOperateNew");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount);
		}
	}

	public Boolean getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Boolean auditStatus) {
		this.auditStatus = auditStatus;
		if(auditStatus != null){
			putQueryParameter("AuditStatus", auditStatus.toString());
		}
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
		if(orderNo != null){
			putQueryParameter("OrderNo", orderNo);
		}
	}

	public String getFileDate() {
		return this.fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
		if(fileDate != null){
			putQueryParameter("FileDate", fileDate);
		}
	}

	public Boolean getAllowResubmit() {
		return this.allowResubmit;
	}

	public void setAllowResubmit(Boolean allowResubmit) {
		this.allowResubmit = allowResubmit;
		if(allowResubmit != null){
			putQueryParameter("AllowResubmit", allowResubmit.toString());
		}
	}

	public Boolean getSubmittedSuccess() {
		return this.submittedSuccess;
	}

	public void setSubmittedSuccess(Boolean submittedSuccess) {
		this.submittedSuccess = submittedSuccess;
		if(submittedSuccess != null){
			putQueryParameter("SubmittedSuccess", submittedSuccess.toString());
		}
	}

	public String getSuccessType() {
		return this.successType;
	}

	public void setSuccessType(String successType) {
		this.successType = successType;
		if(successType != null){
			putQueryParameter("SuccessType", successType);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getFileOssKey() {
		return this.fileOssKey;
	}

	public void setFileOssKey(String fileOssKey) {
		this.fileOssKey = fileOssKey;
		if(fileOssKey != null){
			putQueryParameter("FileOssKey", fileOssKey);
		}
	}

	public Boolean getChangeStatus() {
		return this.changeStatus;
	}

	public void setChangeStatus(Boolean changeStatus) {
		this.changeStatus = changeStatus;
		if(changeStatus != null){
			putQueryParameter("ChangeStatus", changeStatus.toString());
		}
	}

	public Boolean getAddSubmitCount() {
		return this.addSubmitCount;
	}

	public void setAddSubmitCount(Boolean addSubmitCount) {
		this.addSubmitCount = addSubmitCount;
		if(addSubmitCount != null){
			putQueryParameter("AddSubmitCount", addSubmitCount.toString());
		}
	}

	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
		if(applyNo != null){
			putQueryParameter("ApplyNo", applyNo);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getReceiptOssKey() {
		return this.receiptOssKey;
	}

	public void setReceiptOssKey(String receiptOssKey) {
		this.receiptOssKey = receiptOssKey;
		if(receiptOssKey != null){
			putQueryParameter("ReceiptOssKey", receiptOssKey);
		}
	}

	@Override
	public Class<SbjOperateNewResponse> getResponseClass() {
		return SbjOperateNewResponse.class;
	}

}
