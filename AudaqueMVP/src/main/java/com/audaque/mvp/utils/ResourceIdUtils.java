package com.audaque.mvp.utils;

import android.content.Context;

/**
 * 通过资源名字获取id
 * @author xusong
 */
public class ResourceIdUtils {

	private static int getId(Context context, String type, String resourceName) {
		if (context != null && type != null && resourceName != null) {
			int resId = context.getResources().getIdentifier(resourceName,
					type, context.getPackageName());
			return resId;
		}
		return 0;
	}

	public static int getIdId(Context context, String resourceName) {
		return getId(context, "id", resourceName);
	}

	public static int getLayoutId(Context context, String resourceName) {
		return getId(context, "layout", resourceName);
	}

	public static int getStringId(Context context, String resourceName) {
		return getId(context, "string", resourceName);
	}

	public static int getDrawableId(Context context, String resourceName) {
		return getId(context, "drawable", resourceName);
	}

	public static int getStyleId(Context context, String resourceName) {
		return getId(context, "style", resourceName);
	}

	public static int getAttrId(Context context, String resourceName) {
		return getId(context, "attr", resourceName);
	}

	public static int getAnimId(Context context, String resourceName) {
		return getId(context, "anim", resourceName);
	}

	public static int getColorId(Context context, String resourceName) {
		return getId(context, "color", resourceName);
	}
	
	public static int getDimenId(Context context, String resourceName) {
		return getId(context, "dimen", resourceName);
	}
}
