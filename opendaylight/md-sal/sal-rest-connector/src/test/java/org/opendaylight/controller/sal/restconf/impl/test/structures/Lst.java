package org.opendaylight.controller.sal.restconf.impl.test.structures;

import java.util.*;

public class Lst extends YangElement {
    private Set<LstItem> lstItems;

    public Lst(String name) {
        super(name);
        lstItems = new HashSet<>();
    }

    public void addLstItem(LstItem lstItem) {
        lstItem.setLstName(name);
        this.lstItems.add(lstItem);
    }

    public Set<LstItem> getLstItems() {
        return lstItems;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Lst lst = (Lst) obj;
        if (!this.lstItems.equals(lst.lstItems)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((lstItems == null) ? 0 : lstItems.hashCode());
        return result;
    }

}