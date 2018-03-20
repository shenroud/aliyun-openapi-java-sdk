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

package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.CreateTransactionResponse;
import com.aliyuncs.cloudphoto.model.v20170711.CreateTransactionResponse.Transaction;
import com.aliyuncs.cloudphoto.model.v20170711.CreateTransactionResponse.Transaction.Upload;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTransactionResponseUnmarshaller {

	public static CreateTransactionResponse unmarshall(CreateTransactionResponse createTransactionResponse, UnmarshallerContext context) {
		
		createTransactionResponse.setRequestId(context.stringValue("CreateTransactionResponse.RequestId"));
		createTransactionResponse.setCode(context.stringValue("CreateTransactionResponse.Code"));
		createTransactionResponse.setMessage(context.stringValue("CreateTransactionResponse.Message"));
		createTransactionResponse.setAction(context.stringValue("CreateTransactionResponse.Action"));

		Transaction transaction = new Transaction();

		Upload upload = new Upload();
		upload.setBucket(context.stringValue("CreateTransactionResponse.Transaction.Upload.Bucket"));
		upload.setFileId(context.stringValue("CreateTransactionResponse.Transaction.Upload.FileId"));
		upload.setOssEndpoint(context.stringValue("CreateTransactionResponse.Transaction.Upload.OssEndpoint"));
		upload.setObjectKey(context.stringValue("CreateTransactionResponse.Transaction.Upload.ObjectKey"));
		upload.setSessionId(context.stringValue("CreateTransactionResponse.Transaction.Upload.SessionId"));
		upload.setAccessKeyId(context.stringValue("CreateTransactionResponse.Transaction.Upload.AccessKeyId"));
		upload.setAccessKeySecret(context.stringValue("CreateTransactionResponse.Transaction.Upload.AccessKeySecret"));
		upload.setStsToken(context.stringValue("CreateTransactionResponse.Transaction.Upload.StsToken"));
		transaction.setUpload(upload);
		createTransactionResponse.setTransaction(transaction);
	 
	 	return createTransactionResponse;
	}
}