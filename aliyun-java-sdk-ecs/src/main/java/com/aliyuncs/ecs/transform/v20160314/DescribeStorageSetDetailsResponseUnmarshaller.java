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

import com.aliyuncs.ecs.model.v20160314.DescribeStorageSetDetailsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeStorageSetDetailsResponse.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageSetDetailsResponseUnmarshaller {

	public static DescribeStorageSetDetailsResponse unmarshall(DescribeStorageSetDetailsResponse describeStorageSetDetailsResponse, UnmarshallerContext _ctx) {
		
		describeStorageSetDetailsResponse.setRequestId(_ctx.stringValue("DescribeStorageSetDetailsResponse.RequestId"));
		describeStorageSetDetailsResponse.setPageSize(_ctx.integerValue("DescribeStorageSetDetailsResponse.PageSize"));
		describeStorageSetDetailsResponse.setPageNumber(_ctx.integerValue("DescribeStorageSetDetailsResponse.PageNumber"));
		describeStorageSetDetailsResponse.setTotalCount(_ctx.integerValue("DescribeStorageSetDetailsResponse.TotalCount"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageSetDetailsResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setCreationTime(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].CreationTime"));
			disk.setDiskName(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].DiskName"));
			disk.setZoneId(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].ZoneId"));
			disk.setStorageSetId(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].StorageSetId"));
			disk.setDiskId(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].DiskId"));
			disk.setCategory(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].Category"));
			disk.setStorageSetPartitionNumber(_ctx.integerValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].StorageSetPartitionNumber"));
			disk.setRegionId(_ctx.stringValue("DescribeStorageSetDetailsResponse.Disks["+ i +"].RegionId"));

			disks.add(disk);
		}
		describeStorageSetDetailsResponse.setDisks(disks);
	 
	 	return describeStorageSetDetailsResponse;
	}
}