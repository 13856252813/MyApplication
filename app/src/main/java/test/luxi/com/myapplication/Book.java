package test.luxi.com.myapplication;

import java.util.List;

/**
 * Created by DELL on 2017/3/29.
 */

public class Book  {


    /**
     * return_code : 0
     * return_message : OK
     * order_info : [{"prod_name":"name1","prod_code":"p001","order_status":"1","order_data":"2013-07-04 22:15:00","active_data":"2013-07-04 22:15:00","expire_data":"2014-07-04 22:15:00"},{"prod_name":"name1","prod_code":"p001","order_status":"1","order_data":"2013-07-04 22:15:00","active_data":"2013-07-04 22:15:00","expire_data":"2014-07-04 22:15:00"}]
     */

    private String return_code;
    private String return_message;
    private List<OrderInfoBean> order_info;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_message() {
        return return_message;
    }

    public void setReturn_message(String return_message) {
        this.return_message = return_message;
    }

    public List<OrderInfoBean> getOrder_info() {
        return order_info;
    }

    public void setOrder_info(List<OrderInfoBean> order_info) {
        this.order_info = order_info;
    }

    public static class OrderInfoBean {
        /**
         * prod_name : name1
         * prod_code : p001
         * order_status : 1
         * order_data : 2013-07-04 22:15:00
         * active_data : 2013-07-04 22:15:00
         * expire_data : 2014-07-04 22:15:00
         */

        private String prod_name;
        private String prod_code;
        private String order_status;
        private String order_data;
        private String active_data;
        private String expire_data;

        public String getProd_name() {
            return prod_name;
        }

        public void setProd_name(String prod_name) {
            this.prod_name = prod_name;
        }

        public String getProd_code() {
            return prod_code;
        }

        public void setProd_code(String prod_code) {
            this.prod_code = prod_code;
        }

        public String getOrder_status() {
            return order_status;
        }

        public void setOrder_status(String order_status) {
            this.order_status = order_status;
        }

        public String getOrder_data() {
            return order_data;
        }

        public void setOrder_data(String order_data) {
            this.order_data = order_data;
        }

        public String getActive_data() {
            return active_data;
        }

        public void setActive_data(String active_data) {
            this.active_data = active_data;
        }

        public String getExpire_data() {
            return expire_data;
        }

        public void setExpire_data(String expire_data) {
            this.expire_data = expire_data;
        }
    }
}
