/*
 * Copyright (C) 2022 The Android Open Source Project
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
 *
 */

package com.android.systemui.keyguard.data.repository

import com.android.internal.widget.LockPatternUtils
import com.android.systemui.keyguard.shared.model.AuthenticationFlags
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

class FakeBiometricSettingsRepository : BiometricSettingsRepository {

    private val _isFingerprintEnrolled = MutableStateFlow<Boolean>(false)
    override val isFingerprintEnrolled: StateFlow<Boolean> = _isFingerprintEnrolled.asStateFlow()

    private val _isFaceEnrolled = MutableStateFlow(false)
    override val isFaceEnrolled: Flow<Boolean>
        get() = _isFaceEnrolled

    private val _isFaceAuthEnabled = MutableStateFlow(false)
    override val isFaceAuthenticationEnabled: Flow<Boolean>
        get() = _isFaceAuthEnabled

    private val _isStrongBiometricAllowed = MutableStateFlow(false)
    override val isStrongBiometricAllowed = _isStrongBiometricAllowed.asStateFlow()

    private val _isNonStrongBiometricAllowed = MutableStateFlow(false)
    override val isNonStrongBiometricAllowed: StateFlow<Boolean>
        get() = _isNonStrongBiometricAllowed

    private val _isFingerprintEnabledByDevicePolicy = MutableStateFlow(false)
    override val isFingerprintEnabledByDevicePolicy =
        _isFingerprintEnabledByDevicePolicy.asStateFlow()

    private val _isFaceAuthSupportedInCurrentPosture = MutableStateFlow(false)
    override val isFaceAuthSupportedInCurrentPosture: Flow<Boolean>
        get() = _isFaceAuthSupportedInCurrentPosture

    override val isCurrentUserInLockdown: Flow<Boolean>
        get() = _authFlags.map { it.isInUserLockdown }

    private val _authFlags = MutableStateFlow(AuthenticationFlags(0, 0))
    override val authenticationFlags: Flow<AuthenticationFlags>
        get() = _authFlags

    fun setFingerprintEnrolled(isFingerprintEnrolled: Boolean) {
        _isFingerprintEnrolled.value = isFingerprintEnrolled
    }

    fun setStrongBiometricAllowed(isStrongBiometricAllowed: Boolean) {
        _isStrongBiometricAllowed.value = isStrongBiometricAllowed
    }

    fun setFingerprintEnabledByDevicePolicy(isFingerprintEnabledByDevicePolicy: Boolean) {
        _isFingerprintEnabledByDevicePolicy.value = isFingerprintEnabledByDevicePolicy
    }

    fun setAuthenticationFlags(value: AuthenticationFlags) {
        _authFlags.value = value
    }

    fun setFaceEnrolled(isFaceEnrolled: Boolean) {
        _isFaceEnrolled.value = isFaceEnrolled
    }

    fun setIsFaceAuthSupportedInCurrentPosture(value: Boolean) {
        _isFaceAuthSupportedInCurrentPosture.value = value
    }

    fun setIsFaceAuthEnabled(enabled: Boolean) {
        _isFaceAuthEnabled.value = enabled
    }

    fun setIsUserInLockdown(value: Boolean) {
        if (value) {
            setAuthenticationFlags(
                AuthenticationFlags(
                    _authFlags.value.userId,
                    _authFlags.value.flag or
                        LockPatternUtils.StrongAuthTracker.STRONG_AUTH_REQUIRED_AFTER_USER_LOCKDOWN
                )
            )
        } else {
            setAuthenticationFlags(
                AuthenticationFlags(
                    _authFlags.value.userId,
                    LockPatternUtils.StrongAuthTracker.STRONG_AUTH_NOT_REQUIRED
                )
            )
        }
    }

    fun setIsNonStrongBiometricAllowed(value: Boolean) {
        _isNonStrongBiometricAllowed.value = value
    }
}
