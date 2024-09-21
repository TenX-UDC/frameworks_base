/*
 * Copyright (C) 2024 TenX-OS
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.android.systemui.tenx.utils;

import android.content.Context;
import android.os.UserHandle;
import android.provider.Settings;

import com.android.systemui.res.R;

public class TenXUtils {
    public static final String USE_SETTINGS_CARDS = Settings.System.USE_SETTINGS_CARDS;
    public static final String DISPLAY_SETTINGS_HOMEPAGE_AVATAR = Settings.System.DISPLAY_SETTINGS_HOMEPAGE_AVATAR;

    public static final String SETTINGS_CARDS = "com.android.settings.ui_cards";
    public static final String SETTINGS_HOMEPAGE_AVATAR = "com.android.settings.homepage_avatar";

    private static boolean mUseSettingsCards;
    private static boolean mDisplaySettingsHomepageAvatar;

    public static void setSettingsCards(boolean set) {
        mUseSettingsCards = set;
    }

    public static void setSettingsHomepageAvatar(boolean set) {
        mDisplaySettingsHomepageAvatar = set;
    }

    public static boolean isSettingsCardsEnabled() {
        return mUseSettingsCards;
    }

    public static boolean isSettingsHomepageAvatarEnabled() {
        return mDisplaySettingsHomepageAvatar;
    }

    public static boolean getSettingsCardsSetting(Context context) {
        return Settings.System.getIntForUser(context.getContentResolver(),
                USE_SETTINGS_CARDS, 1, UserHandle.USER_CURRENT) == 1;
    }

    public static boolean getSettingsHomepageAvatarSetting(Context context) {
        return Settings.System.getIntForUser(context.getContentResolver(),
                DISPLAY_SETTINGS_HOMEPAGE_AVATAR, 1, UserHandle.USER_CURRENT) == 1;
    }
}
