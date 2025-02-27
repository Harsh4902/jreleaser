/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2025 The JReleaser authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.model.api.announce;

/**
 * @author shblue21
 * @since 1.3.0
 */
public interface DiscourseAnnouncer extends Announcer {
    String TYPE = "discourse";
    String DISCOURSE_API_KEY = "DISCOURSE_API_KEY";
    String DISCOURSE_USERNAME = "DISCOURSE_USERNAME";
    String DISCOURSE_CATEGORY_NAME = "DISCOURSE_CATEGORY_NAME";

    String getHost();

    String getUsername();

    String getApiKey();

    String getCategoryName();

    String getTitle();

    String getMessage();

    String getMessageTemplate();
}
