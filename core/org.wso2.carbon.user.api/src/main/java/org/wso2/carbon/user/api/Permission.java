/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.user.api;

public class Permission {

    /**
     * The resource Id string
     */
    private String resourceId;
    
    /**
     * The action string
     */
    private String action;

    public Permission(String resourceId, String action) {
        this.resourceId = resourceId;
        this.action = action;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getAction() {
        return action;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public void setAction(String action) {
        this.action = action;
    }

}