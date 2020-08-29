package co.edu.escuelaing.sparkd.httpserver;

public interface URIProcessor {

    public void mapService(String commang) throws Exception;
    public String executeServices(String theuri);

}
