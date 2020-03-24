package ua.tqs;

import java.io.IOException;

public interface IHttpClient {
    public abstract String get(String url) throws IOException;
}
