/*
 * Copyright 2002-2004 Greg Hinkle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mc4j.ems.connection.support.metadata;



/**
 * @author Greg Hinkle (ghinkle@users.sourceforge.net), Sep 30, 2004
 * @version $Revision: 575 $($Author: ghinkl $ / $Date: 2006-05-22 04:38:53 +0200 (Mo, 22 Mai 2006) $)
 */
public class WebsphereConnectionTypeDescriptor extends AbstractConnectionTypeDescriptor {

    public boolean isMEJBCompliant() {
        return true;
    }

    public String getDefaultServerUrl() {
        return "http://localhost:8880";
    }

    public String getDefaultPrincipal() {
        return "admin";
    }

    public String getDefaultCredentials() {
        return "";
    }

    public String getDefaultJndiName() {
        return null;
    }

    public String getDefaultInitialContext() {
        return null;
    }

    public String getConnectionType() {
        return "WebSphere";
    }

    public String getConnectionMessage() {
        return "You must use the IBM JVM for MC4J when connection to WebSphere 5.x. The Sun JVM " +
            "can only be used for WS 6.";
    }

    public String[] getConnectionClasspathEntries() {
        return new String[] {
            "AppServer/lib/*",
            "AppServer/deploytool/itp/plugins/com.ibm.etools.jsse/ibmjsse.jar",
            "AppServer/java/jre/lib/ext/mail.jar",
            "AppServer/java/jre/lib/ibmcertpathprovider.jar",
            "AppServer/java/jre/lib/ext/ibmjceprovider.jar",
            "AppServer/deploytool/itp/plugins/org.apache.xerces_4.0.13/xercesImpl.jar",
            "AppServer/deploytool/itp/plugins/org.apache.xerces_4.0.13/xmlParserAPIs.jar",
        };
    }

    public String getConnectionNodeClassName() {
        return "org.mc4j.ems.impl.jmx.connection.support.providers.WebsphereConnectionProvider";
    }

    public String getDisplayName() {
        return "WebSphere 5.x+";
    }

    public String getRecongnitionPath() {
        return "AppServer/lib/runtime.jar";
    }
}
