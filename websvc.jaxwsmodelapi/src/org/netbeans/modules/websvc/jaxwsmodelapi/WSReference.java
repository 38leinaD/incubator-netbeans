/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * WebServiceReference.java
 *
 * Created on August 23, 2006, 3:53 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.netbeans.modules.websvc.jaxwsmodelapi;

import java.net.URL;

/**
 *
 * @author ayubskhan
 */
public class WSReference {
    
    private URL wsdlURL;
    private String webServiceName;
    private String moduleName;
    /** Creates a new instance of WSReference */
    public WSReference(URL wsdlURL, String webServiceName, String moduleName) {
        this.wsdlURL = wsdlURL;
        this.webServiceName = webServiceName;
        this.moduleName = moduleName;
    }
    
    public URL getWsdlURL(){
        return wsdlURL;
    }
    
    public String getWebServiceName(){
        return webServiceName;
    }
    
    public String getModuleName(){
        return moduleName;
    }

}
