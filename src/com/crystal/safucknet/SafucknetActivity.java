/*
 * Copyright (C) 2023 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.crystal.safucknet;

import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;
import com.android.settingslib.widget.R;

public class SafucknetActivity extends CollapsingToolbarBaseActivity {

    private static final String TAG = "Safucknet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(R.id.content_frame,
                new Safucknet(), TAG).commit();
    }
}
