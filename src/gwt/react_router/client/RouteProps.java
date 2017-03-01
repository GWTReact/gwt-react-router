package gwt.react_router.client;

import gwt.interop.utils.shared.collections.StringMap;
import gwt.react.client.components.ComponentConstructorFn;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RouteProps extends BaseProps {

    @JsProperty
    native void setPath(String p);

    @JsProperty
    native <P extends BaseProps> void setComponent(ComponentConstructorFn<P> c);

    @JsProperty
    native <P extends BaseProps> void setComponents(StringMap<ComponentConstructorFn<P>> c);

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
    public final <P extends BaseProps> RouteProps component(ComponentConstructorFn<P> c) {
        setComponent(c);
        return this;
    }

    @JsOverlay
    public final <P extends BaseProps> RouteProps components(StringMap<ComponentConstructorFn<P>> c) {
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

    @JsOverlay
    public final RouteProps key(String key) {
        this.key = key;
        return this;
    }
}
