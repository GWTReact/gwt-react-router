package gwt.react_router.client;

import gwt.interop.utils.shared.functional.JsRunnable;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteEnterCallbackAsync {
    void onEnter(String nextState, JsRunnable replaceFn, JsRunnable continueFn);
}
