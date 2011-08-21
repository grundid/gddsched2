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

import com.google.android.apps.iosched.util.NotifyingAsyncQueryHandler;
import android.widget.CompoundButton;

/**
 * A fragment that shows detail information for a sandbox company, including
 * company name, description, product description, logo, etc.
 */
public class VendorDetailFragment extends
		com.google.android.apps.iosched.ui.VendorDetailFragment implements
		NotifyingAsyncQueryHandler.AsyncQueryListener,
		CompoundButton.OnCheckedChangeListener {

}