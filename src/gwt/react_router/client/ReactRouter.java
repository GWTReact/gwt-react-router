package gwt.react_router.client;

import gwt.react.client.components.ReactClass;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "ReactRouter")
public class ReactRouter {

    public static HistoryMechanism browserHistory;
    public static HistoryMechanism hashHistory;

    public static ReactClass<RouterProps> Router;
    public static ReactClass<RouteProps> Route;
    public static ReactClass<RouteProps> IndexRoute;
    public static ReactClass<RedirectProps> Redirect;
    public static ReactClass<RedirectProps> IndexRedirect;
}
