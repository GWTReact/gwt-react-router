package gwt.react_router.client;

import gwt.interop.utils.shared.functional.JsRunnable;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteEnterCallback {
    void onEnter(String nextState, JsRunnable replaceFn);
}
