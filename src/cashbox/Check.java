package cashbox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julia on 25.03.2015.
 */
public class Check {
    int idCheck;
    List<Product> productList;

    public int getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(int idCheck) {
        this.idCheck = idCheck;
    }

    public Check(int idCheck) {
        this.idCheck = idCheck;
        productList=new ArrayList<Product>();
    }

    public double getCheckCost() {
        double costCheck=0;
        for(Product x:productList) {
            costCheck+=x.getPrice();
            }
        return costCheck;
    }
}
