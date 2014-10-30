package com.ryg.dynamicload.internal;

import android.app.Activity;
import android.content.Intent;

public class DLIntent extends Intent {
	private String mPluginPackage;
	
	private String mPluginClass;

	public DLIntent(String pluginPackage, String pluginClass) {
        super();
        this.mPluginPackage = pluginPackage;
        this.mPluginClass = pluginClass;
    }
	
	public DLIntent(Class<? extends Activity> clazz) {
        super();
        this.mPluginClass = clazz.getName();
    }
	
	public DLIntent(String packageName) {
        super();
        this.mPluginPackage = packageName;
    }

    public String getPluginPackage() {
		return mPluginPackage;
	}

	public void setPluginPackage(String pluginPackage) {
		this.mPluginPackage = pluginPackage;
	}

	public String getPluginClass() {
		return mPluginClass;
	}

	public void setPluginClass(String pluginClass) {
		this.mPluginClass = pluginClass;
	}

	
}