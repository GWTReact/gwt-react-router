package gwt.react_router.client;

import gwt.interop.utils.shared.functional.JsProcedure;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface OnRouteEnterCallbackAsync {
    void onEnter(String nextState, JsProcedure replaceFn, JsProcedure continueFn);
}
