package com.demo.inject2;

import java.lang.reflect.Method;

import android.content.Context;
import android.util.Log;

/**
 * 
 * @author boyliang
 * 
 */
public final class EntryClass {

	public static Object[] invoke(int i) {

		try {
			Log.i("TTT", ">>>>>>>>>>>>>I am in, I am a bad boy 2!!!!<<<<<<<<<<<<<<");
			Context context = ContexHunter.getContext();
			Class<?> MainActivity_class = context.getClassLoader().loadClass("com.demo.host.MainActivity");
			Method setA_method = MainActivity_class.getDeclaredMethod("setA", int.class);
			setA_method.invoke(null, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
