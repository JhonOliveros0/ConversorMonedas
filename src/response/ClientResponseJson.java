package response;


import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

public class ClientResponseJson {

    String result;
    String documentacion;
    String terms_of_use;
    int time_last_update_unix;
    String time_last_update_utc;
    int time_next_update_unix;
    String time_next_update_utc;
    String base_code;
    Map<String, Double>conversion_rates;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public int getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(int time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public int getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public void setTime_next_update_unix(int time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
