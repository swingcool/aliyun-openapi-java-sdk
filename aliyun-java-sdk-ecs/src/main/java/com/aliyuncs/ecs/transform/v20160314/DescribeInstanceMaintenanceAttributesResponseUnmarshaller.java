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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeInstanceMaintenanceAttributesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttribute;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttribute.ActionOnMaintenance;
import com.aliyuncs.ecs.model.v20160314.DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttribute.MaintenanceWindow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceMaintenanceAttributesResponseUnmarshaller {

	public static DescribeInstanceMaintenanceAttributesResponse unmarshall(DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceMaintenanceAttributesResponse.setRequestId(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.RequestId"));
		describeInstanceMaintenanceAttributesResponse.setPageSize(_ctx.integerValue("DescribeInstanceMaintenanceAttributesResponse.PageSize"));
		describeInstanceMaintenanceAttributesResponse.setPageNumber(_ctx.integerValue("DescribeInstanceMaintenanceAttributesResponse.PageNumber"));
		describeInstanceMaintenanceAttributesResponse.setTotalCount(_ctx.integerValue("DescribeInstanceMaintenanceAttributesResponse.TotalCount"));

		List<MaintenanceAttribute> maintenanceAttributes = new ArrayList<MaintenanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes.Length"); i++) {
			MaintenanceAttribute maintenanceAttribute = new MaintenanceAttribute();
			maintenanceAttribute.setLiveMigration(_ctx.booleanValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].LiveMigration"));
			maintenanceAttribute.setInstanceId(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].InstanceId"));

			ActionOnMaintenance actionOnMaintenance = new ActionOnMaintenance();
			actionOnMaintenance.setDefaultValue(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.DefaultValue"));
			actionOnMaintenance.setValue(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.Value"));

			List<String> supportedValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.SupportedValues.Length"); j++) {
				supportedValues.add(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.SupportedValues["+ j +"]"));
			}
			actionOnMaintenance.setSupportedValues(supportedValues);
			maintenanceAttribute.setActionOnMaintenance(actionOnMaintenance);

			List<MaintenanceWindow> maintenanceWindows = new ArrayList<MaintenanceWindow>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows.Length"); j++) {
				MaintenanceWindow maintenanceWindow = new MaintenanceWindow();
				maintenanceWindow.setEndTime(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows["+ j +"].EndTime"));
				maintenanceWindow.setStartTime(_ctx.stringValue("DescribeInstanceMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows["+ j +"].StartTime"));

				maintenanceWindows.add(maintenanceWindow);
			}
			maintenanceAttribute.setMaintenanceWindows(maintenanceWindows);

			maintenanceAttributes.add(maintenanceAttribute);
		}
		describeInstanceMaintenanceAttributesResponse.setMaintenanceAttributes(maintenanceAttributes);
	 
	 	return describeInstanceMaintenanceAttributesResponse;
	}
}