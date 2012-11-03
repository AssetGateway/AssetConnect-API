package asset.connect.api.result;

public interface FutureResultListener<T extends Result> {

	public void onResult(T result);
	
}
