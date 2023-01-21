import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RestClient {
    public static void main(String[] args) throws UnsupportedEncodingException, URISyntaxException {
        String url = "https://tvscsreceiptuat.tvscredit.com/service/service.asmx?op=Get_SCROLLNO_DETAILS";
        Gson gson = new GsonBuilder().create();
        HttpPost request = new HttpPost();
        request.setHeader("Content-Type", " text/xml; charset=utf-8");

        String jsonReq = gson.toJson(request);

        StringEntity reqEntity = new StringEntity(jsonReq);
        request.setEntity(reqEntity);

        URIBuilder builder = new URIBuilder(url);
        URI uri = builder.build();
        request.setURI(uri);

    }
}
