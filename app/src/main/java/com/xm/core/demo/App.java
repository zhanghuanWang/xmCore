/*
 * Copyright 2016 code_gg_boy, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xm.core.demo;


import com.xm.core.app.BaseApp;
import com.xm.core.components.BaseAppComponent;
import com.xm.core.demo.components.DaggerMyAppComponent;
import com.xm.core.demo.module.MyAppModule;
import com.xm.core.module.BaseAppModule;

public class App extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected BaseAppComponent initAppComponent() {
        return DaggerMyAppComponent.builder().baseAppModule(new BaseAppModule(this)).myAppModule(new MyAppModule()).build();
    }

    @Override
    public boolean initCanaryOpen() {
        return false ;
    }
}