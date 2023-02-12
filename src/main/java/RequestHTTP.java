import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RequestHTTP {

    public static String PrintInfoAboutAllMeasuringStations(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet request = new HttpGet("https://api.gios.gov.pl/pjp-api/rest/station/findAll");

        // add request headers
        request.addHeader("custom-key", "programming");

        try (CloseableHttpResponse response = httpclient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                //System.out.println(result);
                return result;
            }
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "blable";
    }

    public static String PrintInfoAboutSpecificMeasuringStation(String id){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet request = new HttpGet("https://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/"+id);

        // add request headers
        request.addHeader("custom-key", "programming");

        try (CloseableHttpResponse response = httpclient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                return(result);

            }
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return("blabla");
    }

}
