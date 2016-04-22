package gwt.react_router.client;

import gwt.react.client.utils.JSFunc;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteChangeCallbackAsync {
    void onChange(String prevState, String nextState, JSFunc replaceFn, JSFunc continueFn);
}
