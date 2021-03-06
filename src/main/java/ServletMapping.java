import java.util.List;

public class ServletMapping {
      String ServletName;
      String url;
      String clazz;

    public ServletMapping(String servletName, String url, String clazz) {
        ServletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }

    public String getServletName() {
        return ServletName;
    }

    public void setServletName(String servletName) {
        ServletName = servletName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
