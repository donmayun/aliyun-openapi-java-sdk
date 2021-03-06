/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ehpc.model.v20170714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListNodesNoPagingRequest extends RpcAcsRequest<ListNodesNoPagingResponse> {
	
	public ListNodesNoPagingRequest() {
		super("EHPC", "2017-07-14", "ListNodesNoPaging", "ehs");
	}

	private String hostName;

	private String role;

	private String clusterId;

	private Boolean onlyDetached;

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getOnlyDetached() {
		return this.onlyDetached;
	}

	public void setOnlyDetached(Boolean onlyDetached) {
		this.onlyDetached = onlyDetached;
		if(onlyDetached != null){
			putQueryParameter("OnlyDetached", onlyDetached.toString());
		}
	}

	@Override
	public Class<ListNodesNoPagingResponse> getResponseClass() {
		return ListNodesNoPagingResponse.class;
	}

}
