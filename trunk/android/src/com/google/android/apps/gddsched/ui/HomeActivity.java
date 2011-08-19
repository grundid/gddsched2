/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.gddsched.ui;

/**
 * Front-door {@link Activity} that displays high-level features the schedule
 * application offers to users. Depending on whether the device is a phone or an
 * Android 3.0+ tablet, different layouts will be used. For example, on a phone,
 * the primary content is a {@link DashboardFragment}, whereas on a tablet, both
 * a {@link DashboardFragment} and a {@link TagStreamFragment} are displayed.
 */
public class HomeActivity extends
		com.google.android.apps.iosched.ui.HomeActivity {

}
