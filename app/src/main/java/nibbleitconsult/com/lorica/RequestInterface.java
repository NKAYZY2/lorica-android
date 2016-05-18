package nibbleitconsult.com.lorica;
import  retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by jeanhuit on 17/05/16.
 */
public interface RequestInterface {

    @GET ("master/lorica.json")
    Call<JSONResponse> getJSON();
}
