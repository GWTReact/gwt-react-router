package gwt.react_router.client;

import gwt.react.client.components.ReactClass;
import gwt.react.client.proptypes.BaseProps;
import gwt.react.shared.utils.StringMap;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RouteProps extends BaseProps {

    @JsProperty
    native void setPath(String p);

    @JsProperty
    native void setComponent(ReactClass c);

    @JsProperty
    native void setComponents(StringMap<ReactClass> c);

    @JsProperty
    native void setOnChange(Object cb);

    @JsProperty
    native void setOnEnter(Object cb);

    @JsProperty
    native void setOnLeave(OnRouteLeaveCallback cb);

    @JsOverlay
    public final RouteProps path(String v) {
        setPath(v);
        return this;
    }

    @JsOverlay
    public final RouteProps component(ReactClass c) {
        setComponent(c);
        return this;
    }

    @JsOverlay
    public final RouteProps components(StringMap<ReactClass> c) {
        setComponents(c);
        return this;
    }

    @JsOverlay
    public final RouteProps onChange(OnRouteChangeCallback cb) {
        setOnChange(cb);
        return this;
    }

    @JsOverlay
    public final RouteProps onChange(OnRouteChangeCallbackAsync cb) {
        setOnChange(cb);
        return this;
    }

    @JsOverlay
    public final RouteProps onEnter(OnRouteEnterCallback cb) {
        setOnEnter(cb);
        return this;
    }

    @JsOverlay
    public final RouteProps onEnter(OnRouteEnterCallbackAsync cb) {
        setOnEnter(cb);
        return this;
    }

    @JsOverlay
    public final RouteProps onLeave(OnRouteLeaveCallback cb) {
        setOnLeave(cb);
        return this;
    }
}
