package interfaces;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 25/01/2021 - 00:55
 * @project think-data-structures
 */
public class ListClientExample {

    private List list;

    public ListClientExample() {
        this.list = new LinkedList();
    }

    public List getList() {
        return list;
    }

}
