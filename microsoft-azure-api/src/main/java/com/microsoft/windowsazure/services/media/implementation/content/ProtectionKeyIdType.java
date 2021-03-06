/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * This type maps the XML returned in the odata ATOM serialization
 * for Asset entities.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetProtectionKeyId", namespace = Constants.ODATA_DATA_NS)
public class ProtectionKeyIdType implements MediaServiceDTO {
    @XmlValue
    String protectionKeyId;

    /**
     * @return the protection key id
     */
    public String getProtectionKeyId() {
        return protectionKeyId;
    }

    /**
     * @param protection
     *            key id
     *            the protection key id to set
     */
    public void setProtectionKeyId(String protectionKeyId) {
        this.protectionKeyId = protectionKeyId;
    }

}
