/**
 * Copyright © 2016-2021 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.transport.lwm2m.secure.credentials;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.leshan.core.SecurityMode;

import static org.eclipse.leshan.core.SecurityMode.X509;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class X509ClientCredentialsConfig implements LwM2MClientCredentialsConfig {
    private String cert;
    private String endpoint;

    @Override
    public SecurityMode getSecurityConfigClientMode() {
        return X509;
    }
}