package com.winnipegandroid.junkdrawer.library;

import android.content.Context;
import android.util.TypedValue;

public class DimensionHelpers {

	/**
	 * Static methods only.
	 */
	private DimensionHelpers () {
	}

	/**
	 * Converts a supplied DP value into pixels.
	 *
	 * @param dp      Density independent pixels.
	 * @param context Current Android context.
	 *
	 * @return Pixels.
	 */
	public static float getPixelsForDp ( float dp, Context context ) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
	}
}
