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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeRegionsResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeRegionsResponse.Region;
import com.aliyuncs.ebs.model.v20210730.DescribeRegionsResponse.Region.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].LocalName"));
			region.setRegionEndpoint(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			region.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionsResponse.Regions["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].LocalName"));
				zone.setZoneId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Zones["+ j +"].ZoneId"));

				zones.add(zone);
			}
			region.setZones(zones);

			regions.add(region);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}