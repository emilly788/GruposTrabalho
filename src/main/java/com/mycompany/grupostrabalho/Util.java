
package com.mycompany.grupostrabalho;

import java.util.Locale;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

public class Util {
    
    public static String toJson(Object object){
        JsonbConfig config = new JsonbConfig()
                .withFormatting(true)
                .withDateFormat("dd/MM/yyyy", Locale.forLanguageTag("pt_BR"))
                .withPropertyOrderStrategy(PropertyOrderStrategy.LEXICOGRAPHICAL);
        
        return JsonbBuilder.create(config).toJson(object);
    }

}