package gwt.react_router.client;

import gwt.interop.utils.shared.functional.JsRunnable;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteChangeCallbackAsync {
    void onChange(String prevState, String nextState, JsRunnable replaceFn, JsRunnable continueFn);
}
