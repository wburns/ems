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
 * @author Greg Hinkle (ghinkle@users.sourceforge.net), Oct 4, 2004
 * @version $Revision: 570 $($Author: ghinkl $ / $Date: 2006-04-12 21:14:16 +0200 (Mi, 12 Apr 2006) $)
 */
public class GeronimoConnectionTypeDescriptor extends JSR160ConnectionTypeDescriptor {

    public String getDisplayName() {
        return "Geronimo";
    }

    public String getConnectionType() {
        return "Geronimo";
    }

    public String getDefaultServerUrl() {
        return "service:jmx:rmi:///jndi/rmi://localhost/JMXConnector";
                //"service:jmx:rmi://localhost/jndi/rmi:/JMXConnector"
    }
}
