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
 * limitations under the License
 */

package android.window;

/**
 * Interface to be invoked by the controlling process when a back animation has finished.
 *
 * @param trigger Whether the back gesture has passed the triggering threshold.
 * {@hide}
 */
interface IBackAnimationFinishedCallback {
    void onAnimationFinished(in boolean triggerBack);
}