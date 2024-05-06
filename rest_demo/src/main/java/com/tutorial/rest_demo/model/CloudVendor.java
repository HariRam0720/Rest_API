package com.tutorial.rest_demo.model;

public class CloudVendor {
    private String vendor_id;
    private String vendor_name;
    private String vendor_address;
    private String vendor_phonenumber;

    public CloudVendor() {

    }

    public CloudVendor(String vendor_id, String vendor_name, String vendor_address, String vendor_phonenumber) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_phonenumber = vendor_phonenumber;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_phonenumber() {
        return vendor_phonenumber;
    }

    public void setVendor_phonenumber(String vendor_phonenumber) {
        this.vendor_phonenumber = vendor_phonenumber;
    }
}
