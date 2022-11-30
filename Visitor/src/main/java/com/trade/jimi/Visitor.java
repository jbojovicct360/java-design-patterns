
package com.trade.jimi;

import com.trade.jimi.models.Bank;
import com.trade.jimi.models.Company;
import com.trade.jimi.models.Resident;
import com.trade.jimi.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}

