/*
 * Copyright 2020 Codeveo Ltd.
 *
 * Written by Ladislav Klenovic <lklenovic@codeveo.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.codeveo.commons.immutables.annotation;

import org.immutables.value.Value;
import org.immutables.value.Value.Style.BuilderVisibility;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Style(typeImmutable = "Imm*",
        visibility = ImplementationVisibility.PACKAGE,
        builderVisibility = BuilderVisibility.PACKAGE,
        builder = "new",
        jdkOnly = true,
        redactedMask = "***",
        overshadowImplementation = true)
public @interface ValueObject {
}
