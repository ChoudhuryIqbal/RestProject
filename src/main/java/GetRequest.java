import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Created by a on 1/31/2017.
 */
public class GetRequest {
    public static void main(String[]args){


        /**
         * Step 1 : create the http get method
         * step 2: create the Http Client
         * Step 3: Create the Http method using the client
         * Step 4: create the response of execution
         * Step 5: display the response at athe console
         */


        try{
            HttpGet httpGet=new HttpGet("http://localhost:8087/laptop-bag/webapi/api/ping/hello");
            CloseableHttpClient client=HttpClientBuilder.create().build();
            CloseableHttpResponse response=client.execute(httpGet);
         StatusLine  status=  response.getStatusLine();
            System.out.println(status.getStatusCode());
            System.out.println(status.getProtocolVersion());
            client.close();
            response.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
