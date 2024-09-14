/*
 * Copyright (C) 2023-2024 The RisingOS Android Project
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
package com.android.systemui.theme;

import android.provider.Settings;

public class TenXSettingsConstants {
    public static final String STATUS_BAR_BATTERY_STYLE = Settings.System.STATUS_BAR_BATTERY_STYLE;
    public static final String QS_BATTERY_STYLE = Settings.System.QS_BATTERY_STYLE;
    public static final String QS_SHOW_BATTERY_PERCENT = Settings.System.QS_SHOW_BATTERY_PERCENT;
    public static final String QS_TILE_UI_STYLE = Settings.System.QS_TILE_UI_STYLE;
    public static final String DEFAULT_QS_TILE_CORNER_RADIUS = Settings.System.DEFAULT_QS_TILE_CORNER_RADIUS;
    public static final String DEFAULT_QS_TILE_STYLES = Settings.System.DEFAULT_QS_TILE_STYLES;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_SHOWN = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_SHOWN;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_ARROW = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_ARROW;
    public static final String SETTINGS_DASHBOARD_ARROW_COLOR = Settings.System.SETTINGS_DASHBOARD_ARROW_COLOR;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_STYLE = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_STYLE;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_COLOR = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_COLOR;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_STROKE_WIDTH = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_STROKE_WIDTH;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_START_COLOR = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_START_COLOR;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_END_COLOR = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_END_COLOR;
    public static final String SETTINGS_DASHBOARD_ICON_COLOR = Settings.System.SETTINGS_DASHBOARD_ICON_COLOR;
    public static final String SETTINGS_DASHBOARD_IOCON_STYLES = Settings.System.SETTINGS_DASHBOARD_IOCON_STYLES;
    public static final String SETTINGS_DASHBOARD_BACKGROUND_SIZE = Settings.System.SETTINGS_DASHBOARD_BACKGROUND_SIZE;
    public static final String USE_CUSTOM_STATUSBAR_PADDING_START = Settings.System.USE_CUSTOM_STATUSBAR_PADDING_START;
    public static final String CUSTOM_STATUSBAR_PADDING_START = Settings.System.CUSTOM_STATUSBAR_PADDING_START;
    public static final String USE_CUSTOM_STATUSBAR_PADDING_END = Settings.System.USE_CUSTOM_STATUSBAR_PADDING_END;
    public static final String CUSTOM_STATUSBAR_PADDING_END = Settings.System.CUSTOM_STATUSBAR_PADDING_END;
    public static final String USE_CUSTOM_STATUSBAR_HEIGHT = Settings.System.USE_CUSTOM_STATUSBAR_HEIGHT;
    public static final String CUSTOM_STATUSBAR_HEIGHT = Settings.System.CUSTOM_STATUSBAR_HEIGHT;
    public static final String USE_DUAL_STATUSBAR_MOD = Settings.System.USE_DUAL_STATUSBAR_MOD;

    public static final String[] SYSTEM_SETTINGS_KEYS = {
        STATUS_BAR_BATTERY_STYLE,
        QS_BATTERY_STYLE,
        QS_SHOW_BATTERY_PERCENT,
        QS_TILE_UI_STYLE,
        SETTINGS_DASHBOARD_BACKGROUND_SHOWN,
        SETTINGS_DASHBOARD_BACKGROUND_ARROW,
        SETTINGS_DASHBOARD_ARROW_COLOR,
        SETTINGS_DASHBOARD_BACKGROUND_STYLE,
        SETTINGS_DASHBOARD_BACKGROUND_COLOR,
        SETTINGS_DASHBOARD_BACKGROUND_STROKE_WIDTH,
        SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_START_COLOR,
        SETTINGS_DASHBOARD_BACKGROUND_GRADIENT_END_COLOR,
        SETTINGS_DASHBOARD_ICON_COLOR,
        SETTINGS_DASHBOARD_IOCON_STYLES,
        SETTINGS_DASHBOARD_BACKGROUND_SIZE,
        USE_CUSTOM_STATUSBAR_PADDING_START,
        CUSTOM_STATUSBAR_PADDING_START,
        USE_CUSTOM_STATUSBAR_PADDING_END,
        CUSTOM_STATUSBAR_PADDING_END,
        USE_CUSTOM_STATUSBAR_HEIGHT,
        CUSTOM_STATUSBAR_HEIGHT,
        USE_DUAL_STATUSBAR_MOD
    };
}
