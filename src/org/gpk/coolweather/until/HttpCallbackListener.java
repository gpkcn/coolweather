package org.gpk.coolweather.until;

public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
