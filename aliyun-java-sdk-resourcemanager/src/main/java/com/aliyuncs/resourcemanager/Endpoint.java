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

package com.aliyuncs.resourcemanager;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "resourcemanager.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "resourcemanager.cn-beijing.aliyuncs.com");
            put("cn-wulanchabu", "resourcemanager.cn-wulanchabu.aliyuncs.com");
            put("ap-south-1", "resourcemanager.ap-south-1.aliyuncs.com");
            put("eu-west-1", "resourcemanager.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "resourcemanager.ap-northeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "resourcemanager.cn-shenzhen-finance-1.aliyuncs.com");
            put("me-east-1", "resourcemanager.me-east-1.aliyuncs.com");
            put("cn-chengdu", "resourcemanager.cn-chengdu.aliyuncs.com");
            put("cn-north-2-gov-1", "resourcemanager.cn-north-2-gov-1.aliyuncs.com");
            put("cn-qingdao", "resourcemanager.cn-qingdao.aliyuncs.com");
            put("cn-shanghai-finance-1", "resourcemanager.cn-shanghai-finance-1.aliyuncs.com");
            put("cn-hangzhou-finance", "resourcemanager.cn-hangzhou-finance.aliyuncs.com");
            put("cn-hongkong", "resourcemanager.cn-hongkong.aliyuncs.com");
            put("ap-southeast-1", "resourcemanager.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "resourcemanager.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "resourcemanager.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "resourcemanager.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "resourcemanager.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "resourcemanager.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "resourcemanager.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "resourcemanager.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "resourcemanager.us-west-1.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
