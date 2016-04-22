package gwt.react_router.client;

import gwt.react.client.utils.JSFunc;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteEnterCallbackAsync {
    void onEnter(String nextState, JSFunc replaceFn, JSFunc continueFn);
}
