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
package org.basepom.mojo.repack;

import org.springframework.boot.loader.tools.Packager.MainClassTimeoutWarningListener;

final class LoggingMainClassTimeoutWarningListener implements MainClassTimeoutWarningListener {

    private static final PluginLog LOG = new PluginLog(LoggingMainClassTimeoutWarningListener.class);

    LoggingMainClassTimeoutWarningListener() {
    }

    @Override
    public void handleTimeoutWarning(long duration, String mainMethod) {
        LOG.warn("Searching for the main class is taking some time, "
                + "consider using the mainClass configuration parameter");
    }

}
