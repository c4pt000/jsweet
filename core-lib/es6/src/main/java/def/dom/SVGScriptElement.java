package def.dom;

@jsweet.lang.Extends({SVGExternalResourcesRequired.class,SVGURIReference.class})
public class SVGScriptElement extends SVGElement {
    public java.lang.String type;
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static SVGScriptElement prototype;
    public SVGScriptElement(){}
    public SVGAnimatedBoolean externalResourcesRequired;
    public SVGAnimatedString href;
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}

