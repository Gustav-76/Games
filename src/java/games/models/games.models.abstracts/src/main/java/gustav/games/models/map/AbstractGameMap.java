package gustav.games.models.map;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa {@link }.
 *
 * @author Gustavo Mejías <gustavo.mejias at kimn-it.cl>
 * @version     %I%, %G%
 * @since       1.0
 */
public  class AbstractGameMap {
    
    protected List<List> map = new ArrayList<List>();
    
    protected Integer actualLatitude;
    
    protected Integer actualLongitude;
    
    protected Object getMapContent(
            Integer latitude
            , Integer longitude){
        
        return map.get(latitude).get(longitude);
    }
    
    protected <T extends AbstractMapContent> void setMapContent(
            Integer latitude
            , Integer longitude
            , T content){
        
        map.get(latitude).set(longitude, content);
        
    }
    
}
